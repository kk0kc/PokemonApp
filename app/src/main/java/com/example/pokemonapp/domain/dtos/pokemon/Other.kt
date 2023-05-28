package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: com.example.pokemonapp.domain.dtos.pokemon.DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: com.example.pokemonapp.domain.dtos.pokemon.OfficialArtwork
)
