package com.example.pokemonapp.domain.dtos.pokemon

data class Ability(
    val ability: com.example.pokemonapp.domain.dtos.pokemon.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)
