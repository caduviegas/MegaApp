package com.innaval.odontoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var ivLogo: ImageView
    lateinit var tvMegaApp: TextView
    lateinit var tvFrase: TextView
    lateinit var btResultado: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btResultado = findViewById(R.id.bt_mostrar_resultado)

        btResultado.setOnClickListener{

            val abrirResultado = Intent(this, ResultadosActivity::class.java)
        startActivity(abrirResultado)
        }
    }
}