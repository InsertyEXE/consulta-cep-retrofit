package com.example.consultacepretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.consultacepretrofit.data.MainRepository
import com.example.consultacepretrofit.data.RestRepository
import com.example.consultacepretrofit.databinding.ActivityMainBinding
import com.example.consultacepretrofit.model.Cep
import com.example.consultacepretrofit.presenter.MainPresenter
import com.example.consultacepretrofit.rest.CEPService
import com.example.consultacepretrofit.rest.RetrofitConfig
import com.example.consultacepretrofit.view.MainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), MainView.View {

    private lateinit var binding: ActivityMainBinding

    private lateinit var presenter: MainView.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = MainRepository(RestRepository())
        presenter = MainPresenter(this, repository)

        binding.fbPesquisar.setOnClickListener {
            presenter.consultar(binding.edtCep.text.toString())
        }

    }

    override fun messageFailure(errorMessage: Int) {
        binding.layoutEdtCep.error = getString(errorMessage)
    }

    override fun consultaSucess(cep: Cep?) {

        with(binding) {
            txtCep.text = cep?.cep
            txtBairro.text = cep?.bairro
            txtComplemento.text = cep?.bairro
            txtLogradouro.text = cep?.logradouro
            txtLocalidade.text = cep?.localidade
            txtGia.text = cep?.gia
            txtUf.text = cep?.uf
            txtIbge.text = cep?.ibge
            txtDdd.text = cep?.ddd
            txtSiafi.text = cep?.siafi
        }

    }

}
