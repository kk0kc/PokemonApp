package com.example.pokemonapp.domain.dtos.pokemon

data class Ability(
    val ability: com.example.pokemonapp.domain.dtos.pokemon.AbilityX,
    val isHidden: Boolean,
    val slot: Int
)
