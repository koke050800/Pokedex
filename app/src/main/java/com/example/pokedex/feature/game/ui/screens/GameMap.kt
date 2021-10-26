package com.example.pokedex.feature.game.ui.screens

import androidx.compose.foundation.indication
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.ui.components.ImageMap
import com.example.pokedex.ui.components.ImagePokeballInCorner
import com.example.pokedex.ui.components.ImagePokemonInCard
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme

@Composable
fun GameMapPokemons(numberPokeballs: Int) {
    Column(
        modifier = Modifier
            .padding(all = 32.dp)
            .fillMaxSize()
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            /*.weight(1f)*/) {
            Text(
                "A jugar !!",
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.primary,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(bottom = 32.dp)
            )
            Spacer(modifier = Modifier.weight(0.1f))

            Box() {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    ImagePokeballInCorner()
                    Text(
                        "$numberPokeballs",
                        style = MaterialTheme.typography.h5,
                        color = getCurrentTheme().primaryText,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(8.dp)
                    )
                }

            }

        }

        Box(){
            ImageMap()
            Column() {
                ImagePokemonInCard(namePokemon = "Pikachu")
                ImagePokemonInCard(namePokemon = "Pikachu")
                ImagePokemonInCard(namePokemon = "Pikachu")

            }

        }
        ImagePokemonInCard(namePokemon = "Pikachu")

    }

}

@Preview(showBackground = true)
@Composable
fun GameMapPokemonsView(){
    POKEDEXTheme() {
        GameMapPokemons(49)
    }
}
