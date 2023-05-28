package com.example.pokemonapp.domain.dtos

import com.example.pokemonapp.domain.dtos.pokemonList.PokemonList
import com.example.pokemonapp.util.Resource

interface Repository {
    suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): Resource<PokemonList>
    suspend fun  getPokemonInfo(
        name: String
    ): Resource<com.example.pokemonapp.domain.dtos.pokemon.Pokemon>
}
