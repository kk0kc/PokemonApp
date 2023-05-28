package com.example.pokemonapp.domain.dtos.pokemon

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokemonapp.domain.dtos.pokemon.MoveLearnMethod,
    val version_group: com.example.pokemonapp.domain.dtos.pokemon.VersionGroup
)
