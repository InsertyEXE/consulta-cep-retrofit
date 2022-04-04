package com.example.consultacepretrofit.rest

import com.example.consultacepretrofit.model.Cep
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.Call

interface CEPService {

    /*

    //Site do webService
    https://viacep.com.br

    //Caminho da API axemplo
    https://viacep.com.br/ws/01001000/json/
     */


    @GET("{cep}/json")
    fun buscarCEP(@Path("cep") cep: String): Call<Cep>

}