package com.example.pokemonapp.domain.usecases

import com.example.pokemonapp.domain.dtos.Repository
import com.example.pokemonapp.util.Resource
import javax.inject.Inject

class GetPokemonInfoUseCase @Inject constructor(
    private val repository: Repository
) {
    suspend operator fun invoke(
        name: String
    ): Resource<com.example.pokemonapp.domain.dtos.pokemon.Pokemon> =
        repository.getPokemonInfo(name)
}
