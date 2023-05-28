package com.example.pokemonapp.domain.dtos.pokemon

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i")
    val generationI: com.example.pokemonapp.domain.dtos.pokemon.GenerationI,
    @SerializedName("generation-ii")
    val generationIi: com.example.pokemonapp.domain.dtos.pokemon.GenerationIi,
    @SerializedName("generation-iii")
    val generationIii: com.example.pokemonapp.domain.dtos.pokemon.GenerationIii,
    @SerializedName("generation-iv")
    val generationIv: com.example.pokemonapp.domain.dtos.pokemon.GenerationIv,
    @SerializedName("generation-v")
    val generationV: com.example.pokemonapp.domain.dtos.pokemon.GenerationV,
    @SerializedName("generation-vi")
    val generationVi: com.example.pokemonapp.domain.dtos.pokemon.GenerationVi,
    @SerializedName("generation-vii")
    val generationVii: com.example.pokemonapp.domain.dtos.pokemon.GenerationVii,
    @SerializedName("generation-viii")
    val generationViii: com.example.pokemonapp.domain.dtos.pokemon.GenerationViii
)
