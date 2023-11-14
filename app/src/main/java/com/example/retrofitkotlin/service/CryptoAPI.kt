package com.example.retrofitkotlin.service

import io.reactivex.Observable
import com.example.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface CryptoAPI {
    // get, post, update, delete -> Retrofit
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json

    //https://api.nomics.com/v1/
    // prices?key=2187154b76945f2373394aa34f7dc98a

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
        //fun getData(): Call<List<CryptoModel>>// call kullanımı doğru değil rxjava kutuphanesi ile Observable kullanılmalı
    //fun getData(): Observable<List<CryptoModel>> //response ve suspend fun yapmamız lazım alttaki gibi (coroutine için)
    suspend fun getData(): Response<List<CryptoModel>>


}