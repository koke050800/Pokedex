package com.example.pokedex.ui.components

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
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme


@Composable
fun CardPokemon(pokemon: Pokemon) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable { },
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
                    TypePokemon.Eléctrico -> Color.Yellow
                    TypePokemon.Fuego -> Color.Red
                    TypePokemon.Agua -> Color.Blue
                    else -> Color.Black
                }, thickness = 1.dp
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardPokemon(){
    POKEDEXTheme() {
        val pikapika = Pokemon(name = "Pikachu", weight = 14.5f, type = TypePokemon.Eléctrico)
        CardPokemon(pikapika)
    }

}



/*@Composable
fun CardPOKEMON(namePokemon: String = "nombrePokemon", tipo: String = "tipoPokemon") {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .clickable { },
        elevation = 16.dp
    ) {
        Column() {
            Row(
                modifier = Modifier.padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImagePokemon(namePokemon = namePokemon)
                // Añade espacio horizontal entre la imagen y la columna
                Spacer(modifier = Modifier.width(8.dp))

                // InfoPokemonInCard(namePokemon = namePokemon, tipo = tipo)

                Column(modifier = Modifier.weight(1f)) {

                    Text(
                        text = namePokemon,
                        style = MaterialTheme.typography.subtitle1,
                        color = getCurrentTheme().primaryText
                    )
                    Text(
                        text = tipo,
                        style = MaterialTheme.typography.subtitle2,
                        color = getCurrentTheme().secondaryText
                    )
                }




                IconoTipo(tipo = tipo)


            }

            //Esta abajo de todoo

            Divider(
                color = when (tipo) {
                    "Eléctrico" -> Color.Yellow
                    "Electrico" -> Color.Yellow
                    "eléctrico" -> Color.Yellow
                    "electrico" -> Color.Yellow

                    "Fuego" -> Color.Red
                    "fuego" -> Color.Red

                    "Agua" -> Color.Blue
                    "agua" -> Color.Blue

                    else -> Color.Magenta
                }, thickness = 1.dp
            )

        }


    }
}*/
/*@Preview(showBackground = true)
@Composable
fun PreviewCardPOKEMON(){
    POKEDEXTheme() {
        CardPOKEMON(namePokemon = "Pikachu", tipo = "Eléctrico")
    }

}*/



