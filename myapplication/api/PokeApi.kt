package com.example.myapplication.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon")  //path
    fun getPokemonList(): Call<PokemonResponse>

    @GET("pokemon/{{id}}")  //path
    fun getPokemonDetail(@Path("id") id: String): Call<PokemonResponse>
}