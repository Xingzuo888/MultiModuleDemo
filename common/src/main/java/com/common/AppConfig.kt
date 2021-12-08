package com.common

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
object AppConfig {
    val components =
        arrayOf("com.logincomponent.LoginApplication", "com.signcomponent.SignApplication")


    //ARouter允许一个module中存在多个分组，但是不允许多个module中存在相同的分组，会导致映射文件冲突。
    // 意思就是说不同的module第一个路径要不一样，
    // 比如：path = "/app/main/activity" 和path="/personal/login/activity"
    // 这两个路径是不同的module，如果都以/app或者/personal开头是不行的。

    const val APP_ACTIVITY_PATH = "/test/activity2"
    const val MODULE_SHOWAROUTER_PATH = "/demo/showarouter"
}