package com.multimoduledome

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.common.AppConfig
import com.common.ServiceFactory

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSign: Button
    private lateinit var btnLogin: Button
    private lateinit var btnShowUserInfo: Button
    private lateinit var btnShowActivity: Button
    private lateinit var btnShowARouter: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        btnSign = findViewById(R.id.btnSign)
        btnLogin = findViewById(R.id.btnLogin)
        btnShowUserInfo = findViewById(R.id.btnShowUserInfo)
        btnShowActivity = findViewById(R.id.btnShowActivity)
        btnShowARouter = findViewById(R.id.btnShowARouter)

        btnSign.setOnClickListener(this)
        btnLogin.setOnClickListener(this)
        btnShowUserInfo.setOnClickListener(this)
        btnShowActivity.setOnClickListener(this)
        btnShowARouter.setOnClickListener(this)
    }

    private fun sign() {
        Log.d("Tag", "Sign")
        ServiceFactory.getInstance().mSignService?.launch(this, "")
    }

    private fun login() {
        Log.d("Tag", "Login")
        ServiceFactory.getInstance().getLoginService().launch(this, "")
    }

    private fun showUserInfo() {
        Log.d("Tag", "ShowUserInfo")
        val fragmentManager = supportFragmentManager
        val bundle = Bundle()
        ServiceFactory.getInstance().getLoginService()
            .newUserInfoFragment(fragmentManager, R.id.llFragmentContainer, bundle)
    }

    private fun showActivity() {
        Log.d("Tag", "ShowActivity")
        ARouter.getInstance().build(AppConfig.APP_ACTIVITY_PATH).navigation()
    }

    private fun showARouter() {
        Log.d("Tag", "ShowARouter")
        ARouter.getInstance().build(AppConfig.MODULE_SHOWAROUTER_PATH).navigation()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnSign -> {
                sign()
            }
            R.id.btnLogin -> {
                login()
            }
            R.id.btnShowUserInfo -> {
                showUserInfo()
            }
            R.id.btnShowActivity -> {
                showActivity()
            }
            R.id.btnShowARouter -> {
                showARouter()
            }
        }
    }
}