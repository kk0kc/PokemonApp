package com.example.pokemonapp.domain.dtos.pokemon

data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: com.example.pokemonapp.domain.dtos.pokemon.StatX
)
