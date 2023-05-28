package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire")
    val omegarubyAlphasapphire: com.example.pokemonapp.domain.dtos.pokemon.OmegarubyAlphasapphire,
    @SerializedName("x-y")
    val xY: com.example.pokemonapp.domain.dtos.pokemon.XY
)
