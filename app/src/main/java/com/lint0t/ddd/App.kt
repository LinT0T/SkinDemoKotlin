package com.lint0t.ddd

import android.app.Application
import android.content.Context


class App : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SkinManager.instance.init(this)
    }

    override fun onCreate() {
        super.onCreate()

    }
}