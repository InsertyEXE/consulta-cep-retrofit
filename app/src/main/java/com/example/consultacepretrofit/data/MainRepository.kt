package com.example.consultacepretrofit.data

import com.example.consultacepretrofit.rest.ApiCallback

class MainRepository(private val dataSource: MainDataSource) {

    fun consultarRepository(cepConsulta: String, callback: ApiCallback ){
            dataSource.consultaRepository(cepConsulta, callback)
    }
}