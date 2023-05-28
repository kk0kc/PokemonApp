package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.example.pokemonapp.domain.dtos.pokemon.Emerald,
    @SerializedName("firered-leafgreen")
    val fireredLeafgreen: com.example.pokemonapp.domain.dtos.pokemon.FireredLeafgreen,
    @SerializedName("ruby-sapphire")
    val rubySapphire: com.example.pokemonapp.domain.dtos.pokemon.RubySapphire
)
