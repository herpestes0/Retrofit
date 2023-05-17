package com.herpestes.retrofitkotlin.service

import android.telecom.Call
import com.herpestes.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import io.reactivex.Observer
import retrofit2.http.GET

interface CryptoAPI {

    // Get, post, update, delete
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData() : Observable<List<CryptoModel>>

// fun getData():  Call <List<CryptoModel>>



}