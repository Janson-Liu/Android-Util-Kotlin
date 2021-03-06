package com.taonce.utilmodule

import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable


/**
 * Author: taoyongxiang
 * Date: 2019/4/12
 * Project: WanKotlin
 * Desc:
 */

/**
 * [clazz]: destination [Activity]
 * [map]: put data
 * [isFinished]: [Activity] is finish or is not finish
 */
fun <T : Activity> Activity.start(
    clazz: Class<T>,
    map: Map<String, Any>? = null,
    isFinished: Boolean = false
) {
    val intent = Intent(this, clazz)
    if (map != null) {
        if (map.isNotEmpty()) {
            map.forEach {
                val key: String = it.key
                val value: Any = it.value
                when (value) {
                    is String -> intent.putExtra(key, value)
                    is Int -> intent.putExtra(key, value)
                    is Float -> intent.putExtra(key, value)
                    is Double -> intent.putExtra(key, value)
                    is Boolean -> intent.putExtra(key, value)
                    is Short -> intent.putExtra(key, value)
                    is ShortArray -> intent.putExtra(key, value)
                    is Long -> intent.putExtra(key, value)
                    is LongArray -> intent.putExtra(key, value)
                    is IntArray -> intent.putExtra(key, value)
                    is FloatArray -> intent.putExtra(key, value)
                    is DoubleArray -> intent.putExtra(key, value)
                    is Char -> intent.putExtra(key, value)
                    is CharArray -> intent.putExtra(key, value)
                    is Byte -> intent.putExtra(key, value)
                    is ByteArray -> intent.putExtra(key, value)
                    is BooleanArray -> intent.putExtra(key, value)
                    is Bundle -> intent.putExtra(key, value)
                    is Parcelable -> intent.putExtra(key, value)
                    is Serializable -> intent.putExtra(key, value)
                }
            }
        }
    }
    this.startActivity(intent)
    if (isFinished) this.finish()
}

/**
 * [clazz]: destination [Activity]
 * [map]: put data
 * Don't need to include `isFinished` as it is an extension of [Fragment]
 */
fun <T : Activity> Fragment.start(
    clazz: Class<T>,
    map: Map<String, Any>? = null
) {
    val intent = android.content.Intent(this.context, clazz)
    if (map != null) {
        if (map.isNotEmpty()) {
            map.forEach {
                val key: String = it.key
                val value: Any = it.value
                when (value) {
                    is String -> intent.putExtra(key, value)
                    is Int -> intent.putExtra(key, value)
                    is Float -> intent.putExtra(key, value)
                    is Double -> intent.putExtra(key, value)
                    is Boolean -> intent.putExtra(key, value)
                    is Short -> intent.putExtra(key, value)
                    is ShortArray -> intent.putExtra(key, value)
                    is Long -> intent.putExtra(key, value)
                    is LongArray -> intent.putExtra(key, value)
                    is IntArray -> intent.putExtra(key, value)
                    is FloatArray -> intent.putExtra(key, value)
                    is DoubleArray -> intent.putExtra(key, value)
                    is Char -> intent.putExtra(key, value)
                    is CharArray -> intent.putExtra(key, value)
                    is Byte -> intent.putExtra(key, value)
                    is ByteArray -> intent.putExtra(key, value)
                    is BooleanArray -> intent.putExtra(key, value)
                    is Bundle -> intent.putExtra(key, value)
                    is Parcelable -> intent.putExtra(key, value)
                    is Serializable -> intent.putExtra(key, value)
                }
            }
        }
    }
    this.startActivity(intent)
}