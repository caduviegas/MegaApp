package com.innaval.odontoapp


import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class JogosBuilder {

     val megaApi: MegaApi

    init{
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl ( "https://lotericas.io/api/v1/jogos/megasena/lasted" )
            .addConverterFactory (GsonConverterFactory.create ())
            .build ()

        megaApi = retrofit.create(MegaApi::class.java)

    }
}