package com.common

/**
 *    Author : wxz
 *    Time   : 2021/12/07
 *    Desc   :
 */
class ServiceFactory {

    private var mLoginService: ILoginService? = null

    var mSignService: ISignService? = null
        get() {
            if (field == null) {
                field = EmptySignService()
            }
            return field
        }
        set(value) {field=value}

    companion object {
        private val instance = ServiceFactory()
        fun getInstance(): ServiceFactory {
            return instance
        }
    }

    fun getLoginService(): ILoginService {
        if (mLoginService == null) {
            mLoginService = EmptyLoginService()
        }
        return mLoginService as ILoginService
    }

    fun setLoginService(iLoginService: ILoginService) {
        mLoginService = iLoginService
    }

//    fun getSignService(): ISignService {
//        if (mSignService == null) {
//            mSignService = EmptySignService()
//        }
//        return mSignService as ISignService
//    }
//
//    fun setSignService(iSignService: ISignService) {
//        mSignService = iSignService
//    }
}