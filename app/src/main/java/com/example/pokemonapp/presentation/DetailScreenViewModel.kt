package com.example.pokemonapp.presentation

import androidx.lifecycle.ViewModel
import com.example.pokemonapp.domain.usecases.GetPokemonInfoUseCase
import com.example.pokemonapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailScreenViewModel @Inject constructor(
    private val getPokemonInfoUseCase: GetPokemonInfoUseCase
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<com.example.pokemonapp.domain.dtos.pokemon.Pokemon> {
        return getPokemonInfoUseCase(pokemonName)
    }
}
