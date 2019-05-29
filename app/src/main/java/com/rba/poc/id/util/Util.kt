package com.rba.poc.id.util

import android.content.ContentResolver
import android.provider.Settings

object Util {

    @SuppressWarnings("HardwareIds")
    fun androidID(contentResolver: ContentResolver): String = Settings.Secure.getString(
        contentResolver,
        Settings.Secure.ANDROID_ID
    )

}