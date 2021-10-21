package com.example.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pokedex.feature.login.ui.screens.LoginScreen
import com.example.pokedex.feature.pokemon_list.ui.screens.PokemonListNew
import com.example.pokedex.ui.theme.POKEDEXTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POKEDEXTheme {
                PokemonListNew()
            }
        }
    }
}












