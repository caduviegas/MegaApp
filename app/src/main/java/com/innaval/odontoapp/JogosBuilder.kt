package com.innaval.odontoapp


import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Observable

class JogosBuilder {

     val megaApi: MegaApi

    init{
        val gson = GsonBuilder().setLenient().create()

        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl ( "https://lotericas.io/api/v1/jogos/megasena/lasted" )
            .addConverterFactory (GsonConverterFactory.create (gson))
            .build ()

        megaApi = retrofit.create(MegaApi::class.java)

    }


}