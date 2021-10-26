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

    fun deletePokemon(pokemon: Pokemon) {
        pokemonsList.removeAll {
            pokemon.id == it.id
        }
    }

    /**
     * Agrega una lista inicial de pokemons al ViewModel
     * @return ArrayList de pokemones
     */
     private fun populateList() = arrayListOf(
        Pokemon(
            name = "Pikachu",
            weight = 14.5f,
            type = TypePokemon.Eléctrico,
            id = "p1"
        ),
        Pokemon(
            name = "Charmander",
            weight = 13.25f,
            type = TypePokemon.Fuego,
            id = "p2"
        ),
        Pokemon(
            name = "Squirtle",
            weight = 16.35f,
            type = TypePokemon.Agua,
            id = "p3"
        ),
        Pokemon(
            name = "Pikachu",
            weight = 14.5f,
            type = TypePokemon.Eléctrico,
            id = "p4"
        ),
        Pokemon(
            name = "Charmander",
            weight = 13.25f,
            type = TypePokemon.Fuego,
            id = "p5"
        ),
        Pokemon(
            name = "Squirtle",
            weight = 16.35f,
            type = TypePokemon.Agua,
            id = "p6"
        )

    )
}