package com.example.consultacepretrofit.view

interface MainView {

    interface Presenter{
        fun consultar()
        fun onDestroy()
    }

    interface View{
        fun messageFailure(errorMessage: Int)
    }
}