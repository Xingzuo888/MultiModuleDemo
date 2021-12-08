package com.multimoduledome

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.common.AppConfig
import com.common.IComponentApplication

/**
 *    Author : wxz
 *    Time   : 2021/12/06
 *    Desc   :
 */
class MainApplication : Application(), IComponentApplication {
    companion object {
        private var application: Application? = null
            get() = field
    }

    override fun onCreate() {
        super.onCreate()
        initialize(this)
        ARouter.openDebug()
        ARouter.init(this)
    }

    override fun initialize(application: Application) {
        for (cpnt in AppConfig.components) {
            try {
                val clz = Class.forName(cpnt)
                val obj = clz.newInstance()
                if (obj is IComponentApplication) {
                    obj.initialize(this)
                }
            } catch (e: Exception) {
                Log.e("MainApplication", e.message.toString())
            }
        }
    }
}