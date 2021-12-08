package com.signcomponent

import android.content.Context
import android.content.Intent
import com.common.ISignService

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class SignService : ISignService {
    override fun launch(context: Context, userId: String) {
        val intent = Intent(context, SignActivity::class.java)
        intent.putExtra("userId", userId)
        context.startActivity(intent)
    }
}