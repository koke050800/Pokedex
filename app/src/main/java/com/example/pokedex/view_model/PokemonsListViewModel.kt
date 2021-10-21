package com.example.pokedex.view_model

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.TypePokemon

/**
 * ViewModel de la lista de Pokemones
 */
class PokemonsListViewModel:  ViewModel(){
    val pokemonsList = mutableStateListOf<Pokemon>()

    init {
        pokemonsList.addAll(populateList())
    }
    /**
     * Agrega un pokemon a la lista de pokemones
     * @param pokemon Pokemon a agregar a lista
     */
    fun addPokemon(pokemon: Pokemon){
        pokemonsList.add(pokemon)
    }

    /**
     * Agrega una lista inicial de pokemons al ViewModel
     * @return ArrayList de pokemones
     */
     private fun populateList() = arrayListOf(
        Pokemon(
            name = "Pikachu",
            weight = 14.5f,
            type = TypePokemon.Eléctrico
        ),
        Pokemon(
            name = "Charmander",
            weight = 13.25f,
            type = TypePokemon.Fuego
        ),
        Pokemon(
            name = "Squirtle",
            weight = 16.35f,
            type = TypePokemon.Agua
        ),
        Pokemon(
            name = "Pikachu",
            weight = 14.5f,
            type = TypePokemon.Eléctrico
        ),
        Pokemon(
            name = "Charmander",
            weight = 13.25f,
            type = TypePokemon.Fuego
        ),
        Pokemon(
            name = "Squirtle",
            weight = 16.35f,
            type = TypePokemon.Agua
        )

    )
}