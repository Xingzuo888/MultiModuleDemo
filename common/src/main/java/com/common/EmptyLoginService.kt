package com.common

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class EmptyLoginService : ILoginService {
    override fun launch(context: Context, targetClass: String) {
    }

    override fun newUserInfoFragment(
        fragmentManager: FragmentManager,
        viewId: Int,
        bundle: Bundle
    ): Fragment? {
        return null
    }
}