package com.signcomponent

import android.app.Application
import com.common.IComponentApplication
import com.common.ServiceFactory

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class SignApplication:Application(),IComponentApplication {
    companion object{
        private var application:Application?=null
        get() = field
        set(value) {field=value}
    }

    override fun onCreate() {
        super.onCreate()
    }
    override fun initialize(application: Application) {
        SignApplication.application = application
        ServiceFactory.getInstance().mSignService = SignService()
    }
}