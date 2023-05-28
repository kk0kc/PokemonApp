package com.example.pokemonapp.domain.dtos.pokemon

data class VersionGroupDetail(
    val levelLearnedAt: Int,
    val moveLearnMethod: com.example.pokemonapp.domain.dtos.pokemon.MoveLearnMethod,
    val versionGroup: com.example.pokemonapp.domain.dtos.pokemon.VersionGroup
)
