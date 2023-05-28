package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: com.example.pokemonapp.domain.dtos.pokemon.Icons,
    @SerializedName("ultra-sun-ultra-moon")
    val ultraSunUltraMoon: com.example.pokemonapp.domain.dtos.pokemon.UltraSunUltraMoon
)
