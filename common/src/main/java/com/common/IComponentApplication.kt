package com.common

import android.app.Application

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
interface IComponentApplication {
    fun initialize(application: Application)
}