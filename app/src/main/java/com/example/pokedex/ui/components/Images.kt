package com.example.pokedex.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.R
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.TypePokemon
import com.example.pokedex.ui.theme.getCurrentTheme

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
fun ImagePokeballInCorner(){
    Image(
        painter = painterResource(R.drawable.pokebola),
        contentDescription = "Contact profile picture",
        modifier = Modifier.size(36.dp)


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
            .clip(RectangleShape)

    )

}

@Composable
fun ImagePokemonInInfo(namePokemon: String) {
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
            .size(364.dp)
            .clip(RectangleShape)

    )

}

@Composable
fun IconTypePokemon(type: TypePokemon){
    Icon(
        painter = when(type){
            TypePokemon.Eléctrico -> painterResource(R.drawable.electrico)
            TypePokemon.Fuego-> painterResource(R.drawable.fuego)
            TypePokemon.Agua -> painterResource(R.drawable.agua)
            else -> painterResource(R.drawable.error)
        },
        contentDescription = "Tipo: ${type.name}",
        modifier = Modifier
            // Coloca el tamaño de la imagen a 40 dp
            .size(16.dp)
            // Le da forma de circulo a la imagen
            .clip(RectangleShape),
        tint = when (type) {
            TypePokemon.Eléctrico -> getCurrentTheme().warning
            TypePokemon.Fuego -> Color.Red
            TypePokemon.Agua -> Color.Blue
            else -> Color.Black
        }
    )

}

@Composable
fun ImageMap(){

    Image(
        painter = painterResource(R.drawable.mapa),
        contentDescription = "MapOfPokemons",
        modifier = Modifier.height(548.dp).fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
fun ImageMapView(){
    ImageMap()
}
