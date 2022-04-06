package com.example.consultacepretrofit.view

interface MainView {

    interface Presenter{
        fun consultar(cep: String)
        fun onDestroy()
    }

    interface View{
        fun messageFailure(errorMessage: Int)
    }
}