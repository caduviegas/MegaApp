package com.innaval.odontoapp


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Jogo(
    @SerializedName("listaDezenas") val listaDezenas: List<String>.toString
):Parcelable
