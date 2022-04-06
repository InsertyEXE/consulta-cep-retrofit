package com.example.consultacepretrofit.data

import com.example.consultacepretrofit.rest.ApiCallback
import com.example.consultacepretrofit.rest.RetrofitConfig

class RestRepository: MainDataSource {

    override fun consultaRepository(cep: String, callback: ApiCallback) {

        val retrofit = RetrofitConfig.getInstanceRetrofit("")
    }

}