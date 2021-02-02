package com.innaval.odontoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ResultadosActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultados_activity)

        val jogosBuilder = JogosBuilder()

        val megaApi2 = jogosBuilder.megaApi

       val megareceber = megaApi2.getJogos()
    }




}