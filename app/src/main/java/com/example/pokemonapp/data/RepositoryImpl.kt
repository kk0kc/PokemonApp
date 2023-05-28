package com.example.pokemonapp.data

import android.util.Log
import com.example.pokemonapp.domain.dtos.Repository
import com.example.pokemonapp.domain.dtos.pokemonList.PokemonList
import com.example.pokemonapp.util.Resource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(
    private val api: PokeApi
) : Repository {

    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            Log.e("Error", "getPokemonList: $e")
            return Resource.Error("Can't fetch pokemon list" + e.message)
        }
        return Resource.Success(response)
    }


    override suspend fun getPokemonInfo(name: String): Resource<com.example.pokemonapp.domain.dtos.pokemon.Pokemon> {
        val response = try {
            api.getPokemonInfo(name)
        } catch (e: Exception) {
            Log.e("Error", "getPokemonInfo: $e")
            return Resource.Error("Can't fetch pokemon list")
        }
        return Resource.Success(response)
    }


}
