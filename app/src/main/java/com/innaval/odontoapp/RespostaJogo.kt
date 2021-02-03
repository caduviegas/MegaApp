package com.innaval.odontoapp

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RespostaJogo(
    @SerializedName("data") val data: List<Jogo>
): Parcelable
