package com.example.consultacepretrofit.data

import com.example.consultacepretrofit.rest.ApiCallback

class MainRepository(private val dataSource: MainDataSource) {

    fun consultarRepository(cepConsulta: String, callbackApi: ApiCallback ){
            dataSource.consultaRepository(cepConsulta, callbackApi)
    }
}