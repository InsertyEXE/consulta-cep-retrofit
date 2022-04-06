package com.example.consultacepretrofit.presenter

import com.example.consultacepretrofit.R
import com.example.consultacepretrofit.data.MainRepository
import com.example.consultacepretrofit.model.Cep
import com.example.consultacepretrofit.rest.ApiCallback
import com.example.consultacepretrofit.view.MainView

class MainPresenter(
    private var view: MainView.View?,
    private var repository: MainRepository
) : MainView.Presenter {

    override fun consultar(cepConsulta: String) {

        if (cepConsulta.length != 8)
            view?.messageFailure(R.string.erro_mensagem)
        else {
            repository.consultarRepository(cepConsulta, object : ApiCallback{

                override fun onSucess(cep: Cep?) {
                    view?.consultaSucess(cep)
                }

                override fun onFailure(falhaMessage: Int) {
                    view?.messageFailure(falhaMessage)
                }


            })
        }
    }

    override fun onDestroy() {
        view = null
    }

}