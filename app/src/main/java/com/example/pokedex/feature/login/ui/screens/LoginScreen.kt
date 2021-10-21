package com.example.pokedex.feature.login.ui.screens

import android.content.Intent
import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.feature.register.ui.screens.RegisterScreenActivity
import com.example.pokedex.ui.components.ImagePokeball
import com.example.pokedex.ui.components.OutlinedTextButton
import com.example.pokedex.ui.components.SimpleOutlinedTextField
import com.example.pokedex.ui.components.TextButtonPrincipal
import com.example.pokedex.ui.theme.POKEDEXTheme


@Composable
fun LoginScreen() {

    Column(
        modifier = Modifier
            .padding(all = 32.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            "POKÉDEX", //Titulo de la aplicacion
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colors.primary,
            textAlign = TextAlign.End,
        )

        ImagePokeball()


        SimpleOutlinedTextField("E-mail / Teléfono")
        SimpleOutlinedTextField("Digite su contraseña")

        TextButtonPrincipal("USAR POKÉDEX")

        val context = LocalContext.current
        OutlinedTextButton("REGISTRARSE"
        ) { context.startActivity(Intent(context, RegisterScreenActivity::class.java)) }

    }

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun LoginScreenPreview() {
    POKEDEXTheme {
        LoginScreen()
    }
}

