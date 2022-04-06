package com.example.consultacepretrofit.rest

import com.example.consultacepretrofit.model.Cep

interface ApiCallback {

    fun onSucess(cep: Cep?)
    fun onFailure(falhaMessage: Int)
}