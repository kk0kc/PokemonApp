package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue")
    val redBlue: com.example.pokemonapp.domain.dtos.pokemon.RedBlue,
    val yellow: com.example.pokemonapp.domain.dtos.pokemon.Yellow
)
