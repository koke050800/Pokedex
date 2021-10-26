package com.example.pokedex.feature.pokemon_list.ui.screens

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.data.Pokemon
import com.example.pokedex.data.TypePokemon
import com.example.pokedex.feature.pokemon_list.ui.data.PokemonInfoContract
import com.example.pokedex.ui.components.ImagePokemonInInfo
import com.example.pokedex.ui.components.LabelAndOutlinedTextField
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme

class PokemonInfoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pokemon =
            intent.getParcelableExtra<Pokemon>(PokemonInfoContract.Input) ?: return finish()



        setContent {
            POKEDEXTheme {

                Scaffold(floatingActionButton = {
                    ExtendedFloatingActionButton(text = {
                        Text(
                            text = "LIBERAR",
                            style = MaterialTheme.typography.button
                        )
                    }, onClick = {
                        pokemon.isCaught = false
                        setResult(Activity.RESULT_OK, intent.putExtra(PokemonInfoContract.Output, pokemon))
                        finish()
                    })
                }) {
                    PokemonInfo(pokemon)
                }
            }
        }
    }
}

@Composable
fun PokemonInfo(pokemon: Pokemon) {
    Column(
        modifier = Modifier
            .padding(all = 32.dp)
            .fillMaxSize()
    ) {
        Text(
            pokemon.name,
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primary,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        ImagePokemonInInfo(pokemon.name)
        Spacer(modifier = Modifier.height(24.dp))

        Row(
            Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
        ) {
            LabelAndOutlinedTextField(
                Modifier.weight(1f),
                labelTop = "TIPO",
                labelInfo = "" + pokemon.type,
                colorLabelTop = getCurrentTheme().secondaryText,
                colorLabelInfo = getCurrentTheme().primaryText,
                styleLabelTop = MaterialTheme.typography.h5,
                styleLabelInfo = MaterialTheme.typography.h6,
                readOnly = true

            )

            Spacer(modifier = Modifier.weight(0.4f))

            LabelAndOutlinedTextField(
                Modifier.weight(1f),
                labelTop = "PESO",
                labelInfo = "" + pokemon.weight + " kg",
                colorLabelTop = getCurrentTheme().secondaryText,
                colorLabelInfo = getCurrentTheme().primaryText,
                styleLabelTop = MaterialTheme.typography.h5,
                styleLabelInfo = MaterialTheme.typography.h6,
                readOnly = true
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PokemonInfoView() {
    POKEDEXTheme {
        val picachu = Pokemon(
            name = "Pikachu",
            weight = 14.75f,
            type = TypePokemon.Eléctrico
        )
        PokemonInfo(picachu)
    }
}