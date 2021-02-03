package com.innaval.odontoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class ResultadosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultados_activity)

        val jogosBuilder = JogosBuilder()

        val megaApi2 = jogosBuilder.megaApi
      megaApi2.getJogos()
              .subscribeOn(Schedulers.io())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe({


              })
    }




}