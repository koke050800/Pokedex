package com.example.pokedex.feature.pokemon_list.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pokedex.ui.components.CardPokemon
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.view_model.PokemonsListViewModel


@Composable
fun PokemonListNew(pokemonsListViewModel: PokemonsListViewModel = viewModel()) {

    LazyColumn {
        item {

            Text(
                "Mis Pokemón",
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.primary,
                modifier = Modifier.padding(top = 32.dp, start = 16.dp, bottom = 8.dp)
            )


        }

        items(pokemonsListViewModel.pokemonsList) { pokemon ->
            CardPokemon(pokemon = pokemon, pokemonsListViewModel)
        }
    }
}
