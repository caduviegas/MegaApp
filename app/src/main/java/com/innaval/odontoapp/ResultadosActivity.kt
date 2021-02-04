package com.innaval.odontoapp

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class ResultadosActivity: AppCompatActivity() {

    private lateinit var textViewResultado: TextView

    private val sucesso:(RespostaJogo) -> Unit = {respostaJogo ->
       respostaJogo.data.get(0).listaDezenas

        val um = respostaJogo.data.get(0).listaDezenas.get(0)
        val dois = respostaJogo.data.get(0).listaDezenas.get(1)
        val tres = respostaJogo.data.get(0).listaDezenas.get(2)
        val quatro = respostaJogo.data.get(0).listaDezenas.get(3)
        val cinco = respostaJogo.data.get(0).listaDezenas.get(4)
        val seis = respostaJogo.data.get(0).listaDezenas.get(5)

        textViewResultado.text = "${um} ${dois} ${tres} ${quatro} ${cinco} ${seis}"


    }

    private val error:(Throwable) -> Unit = {
        textViewResultado.text = " Acesso a Api não concluido"
        textViewResultado.setTextColor(Color.RED)
        it.printStackTrace()
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resultados_activity)

        val jogosBuilder = JogosBuilder()

        val megaApi2 = jogosBuilder.megaApi
        megaApi2.getJogos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(sucesso, error)

        textViewResultado = findViewById(R.id.tv_resultado_final)

    }
}



