SUMMARY = "Simple C/C++ Application from local tarball"
DESCRIPTION = "MyApp is a basic C/C++ application packaged as a local tarball."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "file://hwtarlocal_1.0.tar.gz"

SRC_URI[md5sum] = "4b9f23466c0c8f776b7d54447bb4329f"
SRC_URI[sha256sum] = "409b89573c0cbc84423ef3db1b42193d819d8e11b9370d4b969e7dc87d7228f3"

S = "${UNPACKDIR}/hwtarlocal_1.0"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hwtarlocal ${D}${bindir}
}
