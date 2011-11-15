PACKAGE=Adempiere_GlobalQSS
VERSION=361
TIMESTAMP=`date +%Y%m%d`
TMP=/tmp
RWD=`dirname $0`
PACKFILE=${PACKAGE}_${VERSION}_${TIMESTAMP}.deb
find $RWD/../.. -name "*.sh" -exec chmod +x {} \;
chmod +x $RWD/DebianInstaller/etc/init.d/adempiere
rm -f $TMP/debian-binary $TMP/control.tar.gz $TMP/data.tar.gz $TMP/control.tar $TMP/data.tar $TMP/$PACKFILE
echo 2.0 > $TMP/debian-binary
tar cvf $TMP/control.tar -C $RWD/DebianInstaller/DEBIAN .
gzip -v -9 $TMP/control.tar
tar cvf $TMP/data.tar -C $RWD/DebianInstaller/ ./usr
tar rvf $TMP/data.tar --exclude='Adempiere/utils/unix/createDEBpackage.sh' --exclude='Adempiere/utils/unix/DebianInstaller' --transform 's:^Adempiere:./opt/Adempiere:' -C $RWD/../../.. Adempiere
tar rvf $TMP/data.tar -C $RWD/DebianInstaller/ ./etc
gzip -v -9 $TMP/data.tar
cd $TMP
ar q $PACKFILE debian-binary control.tar.gz data.tar.gz
rm debian-binary control.tar.gz data.tar.gz
