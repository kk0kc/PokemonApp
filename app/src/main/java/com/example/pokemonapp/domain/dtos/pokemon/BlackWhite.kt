package com.example.pokemonapp.domain.dtos.pokemon

data class BlackWhite(
    val animated: com.example.pokemonapp.domain.dtos.pokemon.Animated,
    val backDefault: String,
    val backFemale: Any,
    val backShiny: String,
    val backShinyFemale: Any,
    val frontDefault: String,
    val frontFemale: Any,
    val frontShiny: String,
    val frontShinyFemale: Any
)
