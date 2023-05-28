package com.example.pokemonapp.domain.dtos.pokemon

data class Pokemon(
    val abilities: List<com.example.pokemonapp.domain.dtos.pokemon.Ability>,
    val baseExperience: Int,
    val forms: List<com.example.pokemonapp.domain.dtos.pokemon.Form>,
    val gameIndices: List<com.example.pokemonapp.domain.dtos.pokemon.GameIndice>,
    val height: Int,
    val heldItems: List<com.example.pokemonapp.domain.dtos.pokemon.HeldItem>,
    val id: Int,
    val isDefault: Boolean,
    val locationAreaEncounters: String,
    val moves: List<com.example.pokemonapp.domain.dtos.pokemon.Move>,
    val name: String,
    val order: Int,
    val pastTypes: List<Any>,
    val species: com.example.pokemonapp.domain.dtos.pokemon.Species,
    val sprites: com.example.pokemonapp.domain.dtos.pokemon.Sprites,
    val stats: List<com.example.pokemonapp.domain.dtos.pokemon.Stat>,
    val types: List<com.example.pokemonapp.domain.dtos.pokemon.Type>,
    val weight: Int
)
