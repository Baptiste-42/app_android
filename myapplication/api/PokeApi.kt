package com.example.myapplication.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokeApi {
    @GET("pokemon")  //path
    fun getPokemonList(): Call<PokemonListResponse>

    @GET("pokemon/{id}")  //path
    fun getPokemonDetail(@Path("id") id: Int): Call<PokemonDetailResponse>
}