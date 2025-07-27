SUMMARY = "MyApp from GitHub"
DESCRIPTION = "A simple C/C++ application fetched from a GitHub repo"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/HungNDn/myapp.git;branch=main;protocol=https"

SRCREV = "cbfce4f58b69538248aafa07a9a55844bc8716f3"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hwpatch ${D}${bindir}
}
