package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: com.example.pokemonapp.domain.dtos.pokemon.DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: com.example.pokemonapp.domain.dtos.pokemon.HeartgoldSoulsilver,
    val platinum: com.example.pokemonapp.domain.dtos.pokemon.Platinum
)
