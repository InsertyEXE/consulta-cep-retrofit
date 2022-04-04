package com.example.consultacepretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.consultacepretrofit.databinding.ActivityMainBinding
import com.example.consultacepretrofit.model.Cep
import com.example.consultacepretrofit.rest.CEPService
import com.example.consultacepretrofit.rest.RetrofitConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}

/*binding.let {
            with(binding) {
                fbPesquisar.setOnClickListener {
                    buscarCEP()
                }

            }
        }*/

/*private fun buscarCEP() {

       val retrofit = RetrofitConfig.getInstanceRetrofit("https://viacep.com.br/ws/")
       val interFace = retrofit.create(CEPService::class.java)

       val callback: Call<Cep> = interFace.buscarCEP(binding.edtCep.text.toString())

       callback?.enqueue(object : Callback<Cep> {
           override fun onResponse(call: Call<Cep>, response: Response<Cep>) {
               //resposta do servidor

               if (!response.isSuccessful)
                   Toast.makeText(baseContext, "Erro interno do servidor", Toast.LENGTH_LONG)
                       .show()
               else {

                   val cep: Cep = response.body()!!

                   binding.let {
                       with(binding) {

                           txtCep.text = cep.cep
                           txtBairro.text = cep.bairro
                           txtComplemento.text = cep.bairro
                           txtLogradouro.text = cep.logradouro
                           txtLocalidade.text = cep.localidade
                           txtGia.text = cep.gia
                           txtUf.text = cep.uf
                           txtIbge.text = cep.ibge
                           txtDdd.text = cep.ddd
                           txtSiafi.text = cep.siafi
                       }
                   }


               }
           }

           override fun onFailure(call: Call<Cep>, t: Throwable) {
               //conexão não sucedida
           }

       })

   }*/