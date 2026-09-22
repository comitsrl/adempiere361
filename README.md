# ADempiere ERP 361 (de Transición a iDempiere)

Este repo fue creado a partir de la versión publicada por Carlos Ruiz, cuyo último commit en Mercurial fue el siguiente:

> changeset:   6410:023409471d33</br>
> branch:      globalqss_adempiere361</br>
> user:        globalqss</br>
> date:        Fri Jun 14 18:09:24 2013 -0500</br>
> summary:     Backport bug fix from iDempiere for IDEMPIERE-990</br>

A partir de este commit, esta versión es mantenida por [Comit SRL](http://www.comit.com.ar)

## Release 362.3

Esta release mantiene la línea ADempiere 362 y agrega una mejora de infraestructura para los backups PostgreSQL. No modifica el esquema de base de datos ni el formato lógico del dump.

### Compresión de backups

El export genera temporalmente el archivo lógico `ExpDat.dmp`, lo comprime y luego elimina la copia sin comprimir. `RUN_DBRestore.sh` selecciona y descomprime el `ExpDat*.tar.7z` más reciente antes de invocar `DBRestore.sh`.

```text
ExpDat.dmp → tar → 7z → ExpDat.tar.7z
```

El archivo comprimido se renombra con fecha y hora:

```text
ExpDatYYYYMMDD_HHMMSS.tar.7z
```

El servidor debe disponer de Bash, `tar` y `7za` o `7z`. `DBRestore.sh` no necesita cambios porque continúa leyendo `data/ExpDat.dmp`.

### Build y empaquetado

El build histórico de ADempiere puede generar internamente más de un formato. Para esta release solo se publica el TAR.GZ; los ZIP no forman parte del release publicado.

El flujo utiliza `utils_dev/RUN_build.sh` y no requiere `utils_dev/myDevEnv.sh`. Ese archivo aparece en otros scripts históricos de módulos, pero no forma parte de este proceso. El build requiere un JDK compatible con `tools.jar`, además de `JAVA_HOME` y las herramientas incluidas en `tools/lib`.

Ejecutar desde la raíz del repositorio:

```bash
./scripts/build-release.sh
```

El script ejecuta el build existente mediante `utils_dev/RUN_build.sh`, toma el resultado:

```text
install/build/Adempiere_362.3.tar.gz
```

y prepara:

```text
release-artifacts/Adempiere_362.3-<commit>.tar.gz
release-artifacts/Adempiere_362.3-<commit>.tar.gz.sha256
release-artifacts/Adempiere_362.3-<commit>.tar.gz.manifest
```

El ZIP puede existir como resultado local del build histórico, pero no se copia ni se publica.

### Publicación en GitHub

Primero validar localmente:

```bash
./scripts/publish-release.sh --check-only \
  --artifact release-artifacts/Adempiere_362.3-<commit>.tar.gz
```

Crear el GitHub Release como borrador:

```bash
./scripts/publish-release.sh \
  --artifact release-artifacts/Adempiere_362.3-<commit>.tar.gz
```

Revisar el borrador y publicarlo explícitamente:

```bash
./scripts/publish-release.sh \
  --artifact release-artifacts/Adempiere_362.3-<commit>.tar.gz \
  --publish
```

El release utiliza el tag inmutable `362.3` y publica únicamente el TAR.GZ, su checksum SHA-256 y el manifiesto de build. No se utilizan workflows de GitHub.

### Validaciones previas

- comprobar que el artefacto contiene la raíz `Adempiere/`;
- validar el checksum SHA-256;
- verificar que el commit del manifiesto coincide con el commit del tag;
- instalar el TAR.GZ en un directorio limpio;
- probar exportación PostgreSQL;
- verificar el backup comprimido y la ausencia de temporales al finalizar el export;
- verificar restauración con `RUN_DBRestore.sh`.

## Operación de backups PostgreSQL

Los scripts del core incorporan el procedimiento de producción: Bash con
`set -Eeuo pipefail`, `pg_dump -w`, `umask 027`, compresión
`-mx=4 -mmt=2` y archivo final con permisos `0640`. Se prefiere `7za`;
si no está disponible se utiliza `7z`. Las llamadas se realizan con Bash.
Un fallo del export detiene la secuencia antes de renombrar el backup.

El dump se genera dentro de `data/.dbexport.XXXXXX`. El trap elimina ese
directorio y el dump al terminar, también ante errores y señales INT/HUP/TERM.
No puede hacerlo ante SIGKILL o un apagado abrupto: esos restos requieren
revisión manual. No se borran dumps anteriores ajenos a la ejecución.
Si existe `data/ExpDat.tar.7z`, el export aborta para conservar el pendiente.
Ejecutar una sola exportación por instalación a la vez, como en el procedimiento
de producción. La rotación produce `ExpDatYYYYMMDD_HHMMSS.tar.7z` sin esperas.

El restore PostgreSQL elige el archivo regular `ExpDat*.tar.7z` más reciente
por fecha de modificación; ante empate, el nombre mayor en orden descendente.
Muestra el archivo elegido y solicita confirmación. Extrae solo `ExpDat.dmp`
en un temporal; si falla o el dump está vacío, no invoca PostgreSQL.
El dump validado se instala con permisos `0640`. Se conservan el comprimido
y el dump restaurado. Si no hay comprimidos, se admite un `ExpDat.dmp` existente.
La restauración recrea la base de datos: probarla primero en un entorno aislado.

En instalaciones existentes, actualizar también `utils/myDBcopy.sh` desde
`utils/myDBcopyTemplate.sh`, revisando antes cualquier adaptación local.
La plantilla actualizada por sí sola no reemplaza necesariamente el script instalado.

El checksum del instalable contiene solo el nombre del archivo. Para verificarlo
después de descargarlo, situarse en el directorio que contiene el TAR.GZ y ejecutar
`sha256sum -c <archivo>.tar.gz.sha256`.
