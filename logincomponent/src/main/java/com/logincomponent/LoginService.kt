package com.logincomponent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.common.ILoginService

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class LoginService:ILoginService {
    override fun launch(context: Context, targetClass: String) {
        context.startActivity(Intent(context,LoginActivity::class.java))
    }

    override fun newUserInfoFragment(
        fragmentManager: FragmentManager,
        viewId: Int,
        bundle: Bundle
    ): Fragment? {
        val fragment = UserInfoFragment()
        fragment.arguments = bundle
        fragmentManager.beginTransaction().replace(viewId,fragment).commit()
        return fragment
    }
}