package com.example.pokemonapp.domain.usecases

import com.example.pokemonapp.domain.dtos.Repository
import com.example.pokemonapp.domain.dtos.pokemonList.PokemonList
import com.example.pokemonapp.util.Resource
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        limit: Int,
        offset: Int
    ): Resource<PokemonList> =
        repository.getPokemonList(limit, offset)
}
