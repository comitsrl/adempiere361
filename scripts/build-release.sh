#!/usr/bin/env bash
set -Eeuo pipefail

REPO_ROOT="$(git rev-parse --show-toplevel)"
cd "$REPO_ROOT"

VERSION="${ADEMPIERE_RELEASE_VERSION:-362.3}"
OUTPUT_DIR="${ADEMPIERE_RELEASE_OUTPUT_DIR:-$REPO_ROOT/release-artifacts}"
SOURCE_ARCHIVE="$REPO_ROOT/install/build/Adempiere_${VERSION}.tar.gz"
SHORT_COMMIT="$(git rev-parse --short=10 HEAD)"
FULL_COMMIT="$(git rev-parse HEAD)"
DATE="${ADEMPIERE_RELEASE_DATE:-$(date +%Y%m%d)}"
ARCHIVE="$OUTPUT_DIR/Adempiere_${VERSION}-${SHORT_COMMIT}.tar.gz"
CHECKSUM="$ARCHIVE.sha256"
MANIFEST="$ARCHIVE.manifest"

die() { printf '[ERROR] %s\n' "$*" >&2; exit 1; }

[[ -x utils_dev/RUN_build.sh ]] || die 'No existe o no es ejecutable utils_dev/RUN_build.sh.'
[[ -n "${JAVA_HOME:-}" ]] || die 'JAVA_HOME no está definido.'
[[ -x "$JAVA_HOME/bin/java" ]] || die "No existe el ejecutable Java en $JAVA_HOME/bin/java."
[[ -f "$JAVA_HOME/lib/tools.jar" ]] || \
  die "El build histórico requiere un JDK compatible con tools.jar; no se encontró en $JAVA_HOME/lib/tools.jar."
[[ -f tools/lib/ant.jar ]] || die 'No existe tools/lib/ant.jar.'

printf '[INFO] Ejecutando el build histórico de ADempiere\n'
(cd utils_dev && ./RUN_build.sh)

[[ -f "$SOURCE_ARCHIVE" ]] || die "No existe el artefacto esperado: $SOURCE_ARCHIVE"
mkdir -p "$OUTPUT_DIR"
rm -f "$ARCHIVE" "$CHECKSUM" "$MANIFEST"

ROOTS="$(tar -tzf "$SOURCE_ARCHIVE" | awk -F/ 'NF > 0 {print $1; next}' | sort -u)"
[[ "$ROOTS" == 'Adempiere' ]] || \
  die "La raíz del artefacto no es Adempiere: $ROOTS"

cp "$SOURCE_ARCHIVE" "$ARCHIVE"
(cd "$OUTPUT_DIR" && sha256sum "$(basename "$ARCHIVE")" > "$(basename "$CHECKSUM")")

cat > "$MANIFEST" <<EOF
artifact=$(basename "$ARCHIVE")
source_artifact=install/build/Adempiere_${VERSION}.tar.gz
version=$VERSION
commit=$FULL_COMMIT
branch=$(git branch --show-current)
date=$DATE
sha256=$(cut -d' ' -f1 "$CHECKSUM")
EOF

printf '[INFO] Artefacto: %s\n' "$ARCHIVE"
printf '[INFO] Checksum:  %s\n' "$CHECKSUM"
printf '[INFO] Manifiesto: %s\n' "$MANIFEST"
