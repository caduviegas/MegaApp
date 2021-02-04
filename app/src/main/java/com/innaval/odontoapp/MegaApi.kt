package com.innaval.odontoapp


import retrofit2.http.GET
import rx.Observable
import rx.Single


interface MegaApi {
    @GET("jogos/megasena/lasted")
    fun getJogos(): Single<RespostaJogo>
}