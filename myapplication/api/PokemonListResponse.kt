package com.example.myapplication.api

import com.example.myapplication.list.Pokemon

data class PokemonListResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)