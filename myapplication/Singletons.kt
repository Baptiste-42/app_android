package com.example.myapplication

import com.example.myapplication.api.PokeApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Singletons{
    companion object {
        fun getPokeApi(){

        }
        val pokeApi: PokeApi = Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(PokeApi::class.java)
    }
}

