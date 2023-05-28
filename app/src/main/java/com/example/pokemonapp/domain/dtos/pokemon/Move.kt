package com.example.pokemonapp.domain.dtos.pokemon

data class Move(
    val move: com.example.pokemonapp.domain.dtos.pokemon.MoveX,
    val versionGroupDetails: List<com.example.pokemonapp.domain.dtos.pokemon.VersionGroupDetail>
)
