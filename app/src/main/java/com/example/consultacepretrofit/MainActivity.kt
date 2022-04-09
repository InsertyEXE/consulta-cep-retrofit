package com.example.consultacepretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.consultacepretrofit.data.MainRepository
import com.example.consultacepretrofit.data.RestRepository
import com.example.consultacepretrofit.databinding.ActivityMainBinding
import com.example.consultacepretrofit.model.Cep
import com.example.consultacepretrofit.presenter.MainPresenter
import com.example.consultacepretrofit.util.TxtWatcher
import com.example.consultacepretrofit.view.MainView

class MainActivity : AppCompatActivity(), MainView.View {

    private lateinit var binding: ActivityMainBinding

    private lateinit var presenter: MainView.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mascaraEditText()


        binding.edtCep.addTextChangedListener(TxtWatcher{
            messageFailure(null)
        })

        val repository = MainRepository(RestRepository())
        presenter = MainPresenter(this, repository)

        binding.fbPesquisar.setOnClickListener {
            presenter.consultar(binding.edtCep.text.toString())
        }

    }

    override fun messageFailure(errorMessage: Int?) {
        binding.layoutEdtCep.error = errorMessage?.let { getString(it) }
        mascaraEditText()
    }

    override fun consultaSucess(cep: Cep?) {

        with(binding) {
            txtCep.text = getString(R.string.cep, cep?.cep)
            txtBairro.text = getString(R.string.bairro, cep?.bairro)
            txtComplemento.text = getString(R.string.complemento, cep?.complemento)
            txtLogradouro.text = getString(R.string.logradouro, cep?.logradouro)
            txtLocalidade.text = getString(R.string.localidade, cep?.localidade)
            txtGia.text = getString(R.string.gia, cep?.gia)
            txtUf.text = getString(R.string.uf, cep?.uf)
            txtIbge.text = getString(R.string.ibge, cep?.ibge)
            txtDdd.text = getString(R.string.ddd, cep?.ddd)
            txtSiafi.text = getString(R.string.siafi, cep?.siafi)
        }

    }

    override fun mascaraEditText() {

        with(binding) {
            txtCep.text = getString(R.string.cep, "-")
            txtBairro.text = getString(R.string.bairro, "-")
            txtComplemento.text = getString(R.string.complemento, "-")
            txtLogradouro.text = getString(R.string.logradouro, "-")
            txtLocalidade.text = getString(R.string.localidade, "-")
            txtGia.text = getString(R.string.gia, "-")
            txtUf.text = getString(R.string.uf, "-")
            txtIbge.text = getString(R.string.ibge, "-")
            txtDdd.text = getString(R.string.ddd, "-")
            txtSiafi.text = getString(R.string.siafi, "-")
        }

    }
}

