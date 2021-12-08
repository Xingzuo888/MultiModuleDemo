package com.showarouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.common.AppConfig

@Route(path = AppConfig.MODULE_SHOWAROUTER_PATH)
class ShowARouterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_a_router)
    }
}