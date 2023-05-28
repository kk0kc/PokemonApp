package com.example.pokemonapp.domain.dtos.pokemonList

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)
