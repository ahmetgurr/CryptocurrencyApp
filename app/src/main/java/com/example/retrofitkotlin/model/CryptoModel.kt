package com.example.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    @SerializedName("currency")
    var currency: String? = null,
    @SerializedName("price")
    var price: String? = null){

}
