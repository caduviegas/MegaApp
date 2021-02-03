package com.innaval.odontoapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class ResultadosActivity: AppCompatActivity() {

    private lateinit var textViewResultado: TextView

    private val sucesso:(RespostaJogo) -> Unit = {respostaJogo ->
        textViewResultado.text = respostaJogo.data.listaDezenas


    }

    private val error:(Throwable) -> Unit = {

    }

    private val concluido:() -> Unit = { ->

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultados_activity)

        val jogosBuilder = JogosBuilder()

        val megaApi2 = jogosBuilder.megaApi
        megaApi2.getJogos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(sucesso, error, concluido)

        textViewResultado = findViewById(R.id.tv_resultado_final)

    }
}



