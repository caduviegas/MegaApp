package com.innaval.odontoapp


import retrofit2.http.GET
import rx.Observable


interface MegaApi {
    @GET("jogos/megasena/lasted")
    fun getJogos(): Observable<RespostaJogo>
}