package com.example.pokemonapp.domain.dtos.pokemon

data class Pokemon(
    val abilities: List<com.example.pokemonapp.domain.dtos.pokemon.Ability>,
    val base_experience: Int,
    val forms: List<com.example.pokemonapp.domain.dtos.pokemon.Form>,
    val game_indices: List<com.example.pokemonapp.domain.dtos.pokemon.GameIndice>,
    val height: Int,
    val held_items: List<com.example.pokemonapp.domain.dtos.pokemon.HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokemonapp.domain.dtos.pokemon.Move>,
    val name: String,
    val order: Int,
    val past_types: List<Any>,
    val species: com.example.pokemonapp.domain.dtos.pokemon.Species,
    val sprites: com.example.pokemonapp.domain.dtos.pokemon.Sprites,
    val stats: List<com.example.pokemonapp.domain.dtos.pokemon.Stat>,
    val types: List<com.example.pokemonapp.domain.dtos.pokemon.Type>,
    val weight: Int
)
