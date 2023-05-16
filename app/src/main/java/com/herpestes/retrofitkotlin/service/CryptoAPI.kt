package com.herpestes.retrofitkotlin.service

import android.telecom.Call
import com.herpestes.retrofitkotlin.model.CryptoModel
import retrofit2.http.GET

interface CryptoAPI {

    // Get, post, update, delete
    //https://raw.githubusercontent.com/
    // atilsamancioglu/K21-JSONDataSet/master/crypto.json
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData():  Call <List<CryptoModel>>



}