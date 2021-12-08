package com.multimoduledome

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.common.ServiceFactory

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnSign: Button
    private lateinit var btnLogin: Button
    private lateinit var btnShowUserInfo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        btnSign = findViewById(R.id.btnSign)
        btnLogin = findViewById(R.id.btnLogin)
        btnShowUserInfo = findViewById(R.id.btnShowUserInfo)

        btnSign.setOnClickListener(this)
        btnLogin.setOnClickListener(this)
        btnShowUserInfo.setOnClickListener(this)
    }

    private fun sign() {
        Log.d("Tag","Sign")
        ServiceFactory.getInstance().mSignService?.launch(this, "")
    }

    private fun login() {
        Log.d("Tag","Login")
        ServiceFactory.getInstance().getLoginService().launch(this, "")
    }

    private fun showUserInfo() {
        Log.d("Tag","ShowUserInfo")
        val fragmentManager = supportFragmentManager
        val bundle = Bundle()
        ServiceFactory.getInstance().getLoginService()
            .newUserInfoFragment(fragmentManager, R.id.llFragmentContainer, bundle)
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
        }
    }
}