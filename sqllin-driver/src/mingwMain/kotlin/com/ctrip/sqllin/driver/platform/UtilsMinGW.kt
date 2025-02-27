package com.ctrip.sqllin.driver.platform

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKStringFromUtf8

/**
 * The tools with Windows implementation
 * @author yqiao
 */

internal actual fun bytesToString(bv: CPointer<ByteVar>): String = bv.toKStringFromUtf8()

internal actual inline val separatorChar: Char
    get() = '\\'