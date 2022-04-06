package com.example.consultacepretrofit.data

import com.example.consultacepretrofit.R
import com.example.consultacepretrofit.model.Cep
import com.example.consultacepretrofit.rest.ApiCallback
import com.example.consultacepretrofit.rest.CEPService
import com.example.consultacepretrofit.rest.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestRepository : MainDataSource {

    override fun consultaRepository(cepConsulta: String, callback: ApiCallback) {

        val retrofit = RetrofitConfig.getInstanceRetrofit("https://viacep.com.br/ws/")
        val retrofitContract = retrofit.create(CEPService::class.java)
        val resposta: Call<Cep> = retrofitContract.buscarCEP(cepConsulta)

        resposta.enqueue(object : Callback<Cep> {
            override fun onResponse(call: Call<Cep>, response: Response<Cep>) {

                //resposta do servidor

                if (!response.isSuccessful)
                    callback.onFailure(R.string.erro_servidor)
                else {
                    val cep: Cep? = response.body()

                    if (cep?.cep != null)
                        callback.onSucess(cep)
                    else
                        callback.onFailure(R.string.erro_cep_inexistente)


                }

            }

            override fun onFailure(call: Call<Cep>, t: Throwable) {

                //Servidor inválido
                callback.onFailure(R.string.erro_servidor_indisponivel)
            }

        })
    }


}