package com.example.myapplication.api

import com.example.myapplication.list.Pokemon

data class PokemonResponse(
    val count: Int,
    val next: String,
    val results: List<Pokemon>
)