package com.example.pokedex.data

data class Pokemon(
    var name: String = "nombrePokemon",
    var weight: Float = 0.0f,
    var type: TypePokemon = TypePokemon.UNKNOW
)

