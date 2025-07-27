DESCRIPTION = "This is a simple Hello World recipe - uses a local source file"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${THISDIR}/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI += "file://hwlocal.c"

S = "${UNPACKDIR}"

do_compile() {
	${CC} ${CFLAGS} ${LDFLAGS} hwlocal.c -o hwlocal
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 hwlocal ${D}${bindir}
}

BBCLASSEXTEND = "native nativesdk"
