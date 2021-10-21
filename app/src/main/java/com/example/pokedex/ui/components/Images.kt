package com.example.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.R
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.TypePokemon

@Composable
fun ImagePokeball(){
    Image(
        painter = painterResource(R.drawable.pokebola),
        contentDescription = "Contact profile picture",
        modifier = Modifier
            .padding(top = 46.dp, bottom = 46.dp)
            .size(224.dp)


    )
}

@Composable
fun ImagePokemonInCard(namePokemon: String) {
    Image(
        painter = when (namePokemon) {
            "Pikachu" -> painterResource(R.drawable.pikachu)
            "Charmander" -> painterResource(R.drawable.charmander)
            "Squirtle" -> painterResource(R.drawable.squirtle)
            else -> painterResource(R.drawable.ic_launcher_foreground)
        },
        contentDescription = "Pokemon: ${namePokemon}",
        modifier = Modifier
            // Coloca el tamaño de la imagen a 40 dp
            .size(72.dp)
            // Le da forma de circulo a la imagen
            .clip(RectangleShape)

    )

}

@Composable
fun IconTypePokemon(type: TypePokemon){
    Image(
        painter = when(type){
            TypePokemon.Eléctrico -> painterResource(R.drawable.electrico)
            TypePokemon.Fuego-> painterResource(R.drawable.fuego)
            TypePokemon.Agua -> painterResource(R.drawable.agua)
            else -> painterResource(R.drawable.error)
        },
        contentDescription = "Tipo: ${type.name}",
        modifier = Modifier
            // Coloca el tamaño de la imagen a 40 dp
            .size(12.dp)
            // Le da forma de circulo a la imagen
            .clip(RectangleShape)
    )

}

/*
@Composable
fun ImagePokemon(namePokemon: String) {
    Image(
        painter = when (namePokemon) {
            "Pikachu" -> painterResource(R.drawable.pikachu)
            "Charmander" -> painterResource(R.drawable.charmander)
            "Squirtle" -> painterResource(R.drawable.squirtle)
            else -> painterResource(R.drawable.ic_launcher_foreground)
        },
        contentDescription = "Pokemon: $namePokemon",
        modifier = Modifier
            // Coloca el tamaño de la imagen a 40 dp
            .size(72.dp)
            // Le da forma de circulo a la imagen
            .clip(RectangleShape)

    )

}*/
/*
@Preview
@Composable
fun IconoTipo(tipo: String = "Error"){
    Image(
        painter = when(tipo){
            "Eléctrico" -> painterResource(R.drawable.electrico)
            "Electrico" -> painterResource(R.drawable.electrico)
            "eléctrico" -> painterResource(R.drawable.electrico)
            "electrico" -> painterResource(R.drawable.electrico)

            "Fuego"-> painterResource(R.drawable.fuego)
            "fuego"-> painterResource(R.drawable.fuego)

            "Agua" -> painterResource(R.drawable.agua)
            "agua" -> painterResource(R.drawable.agua)

            else -> painterResource(R.drawable.error)
        },
        contentDescription = "Tipo: $tipo",
        modifier = Modifier
            // Coloca el tamaño de la imagen a 40 dp
            .size(12.dp)
            // Le da forma de circulo a la imagen
            .clip(RectangleShape)


    )

}*/