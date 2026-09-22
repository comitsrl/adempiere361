#!/usr/bin/env bash
set -Eeuo pipefail
: "${ADEMPIERE_HOME:?ADEMPIERE_HOME no está definido}"
cd "${ADEMPIERE_HOME}/utils"
set +u
. ./myEnvironment.sh Server
set -u
echo "Export de ADempiere - ${ADEMPIERE_HOME} ($ADEMPIERE_DB_NAME)"
bash "$ADEMPIERE_DB_PATH/DBExport.sh" "$ADEMPIERE_DB_USER" "$ADEMPIERE_DB_PASSWORD"
bash "${ADEMPIERE_HOME}/utils/myDBcopy.sh"
