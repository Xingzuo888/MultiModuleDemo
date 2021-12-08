package com.common

import android.content.Context

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
interface ISignService {
    fun launch(context: Context, userId: String)
}