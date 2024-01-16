# Copyright (C) 2021, Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

inherit auto-patch

inherit local-git

SRCREV:= "${AUTOREV}"
SRC_URI = " \
        git://github.com/mixtile-rockchip/rk3588-mixtile-sdk-rk-kernel.git;protocol=https;nobranch=1;branch=mixtile-core3588e; \
"
S = "${WORKDIR}/git"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
