package com.example.pokedex.ui.components

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.TypePokemon
import com.example.pokedex.feature.pokemon_list.ui.data.PokemonInfoContract
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme
import com.example.pokedex.view_model.PokemonsListViewModel


@Composable
fun CardPokemon(pokemon: Pokemon, pokemonsListViewModel: PokemonsListViewModel) {
    val pokemonInfoLauncher = rememberLauncherForActivityResult(contract = PokemonInfoContract(), onResult = {
        println(it)
        if (it?.isCaught == false){
            pokemonsListViewModel.deletePokemon(it)
        }
    })
    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable {
                       pokemonInfoLauncher.launch(pokemon)
            },
        elevation = 16.dp
    ) {
        Column() {
            Row(
                modifier = Modifier.padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImagePokemonInCard(pokemon.name)
                // Añade espacio horizontal entre la imagen y la columna
                Spacer(modifier = Modifier.width(8.dp))

                Column(modifier = Modifier.weight(1f)) {

                    Text(
                        text = pokemon.name,
                        style = MaterialTheme.typography.subtitle1,
                        color = getCurrentTheme().primaryText
                    )
                    Text(
                        text = "" + pokemon.type,
                        style = MaterialTheme.typography.subtitle2,
                        color = getCurrentTheme().secondaryText
                    )
                }

                IconTypePokemon(type = pokemon.type)

            }

            //Esta abajo de todoo
            Divider(
                color = when (pokemon.type) {
                    TypePokemon.Eléctrico -> getCurrentTheme().warning
                    TypePokemon.Fuego -> Color.Red
                    TypePokemon.Agua -> Color.Blue
                    else -> Color.Black
                }, thickness = 1.dp
            )

        }
    }
}


