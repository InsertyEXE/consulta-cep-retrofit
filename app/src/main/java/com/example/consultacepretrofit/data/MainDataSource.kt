package com.example.consultacepretrofit.data

import com.example.consultacepretrofit.rest.ApiCallback

interface MainDataSource {

    fun consultaRepository(cep: String, callback: ApiCallback)
}
