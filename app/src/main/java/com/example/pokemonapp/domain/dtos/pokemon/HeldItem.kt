package com.example.pokemonapp.domain.dtos.pokemon

data class HeldItem(
    val item: com.example.pokemonapp.domain.dtos.pokemon.Item,
    val versionDetails: List<com.example.pokemonapp.domain.dtos.pokemon.VersionDetail>
)
