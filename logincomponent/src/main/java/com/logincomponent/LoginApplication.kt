package com.logincomponent

import android.app.Application
import com.common.IComponentApplication
import com.common.ServiceFactory

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class LoginApplication:Application(),IComponentApplication {
    companion object{
        var application:Application?=null
    }

    override fun onCreate() {
        super.onCreate()
    }
    override fun initialize(application: Application) {
        LoginApplication.application=application
        ServiceFactory.getInstance().setLoginService(LoginService())
    }
}