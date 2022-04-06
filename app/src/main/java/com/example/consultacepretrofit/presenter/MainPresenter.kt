package com.example.consultacepretrofit.presenter

import com.example.consultacepretrofit.R
import com.example.consultacepretrofit.view.MainView

class MainPresenter(var view: MainView.View?): MainView.Presenter {

    override fun consultar(cep: String) {

        if (cep.length != 8)
              view?.messageFailure(R.string.erro_mensagem)
    }

    override fun onDestroy() {
        view = null
    }

}