package com.example.consultacepretrofit.view

import androidx.annotation.StringRes
import com.example.consultacepretrofit.model.Cep

interface MainView {

    interface Presenter{
        fun consultar(cepConsulta: String)
        fun onDestroy()
    }

    interface View{
        fun messageFailure(@StringRes errorMessage: Int?)
        fun consultaSucess(cep: Cep?)
        fun mascaraEditText()
    }
}