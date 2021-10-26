package com.example.pokedex.feature.register.ui.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
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
import com.example.pokedex.ui.components.LabelAndOutlinedTextField
import com.example.pokedex.ui.components.RadioButtonSex
import com.example.pokedex.ui.components.TextButtonPrincipal
import com.example.pokedex.ui.theme.POKEDEXTheme

class RegisterScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POKEDEXTheme {
                RegisterScreen()
            }
        }
    }
}

@Composable
fun RegisterScreen() {

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(all = 32.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            "Registro",
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.primary,
            textAlign = TextAlign.Start,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
        ) {
            LabelAndOutlinedTextField(
                Modifier.weight(1f),
                labelTop = "Nombre(s)",
                labelInfo = "Nombres"
            )
            Spacer(modifier = Modifier.weight(0.2f))
            LabelAndOutlinedTextField(Modifier.weight(1f), "Apellido(s)", labelInfo = "Apellidos")
        }

        LabelAndOutlinedTextField(
            Modifier,
            labelTop = "Teléfono",
            labelInfo = "Número de teléfono a 10 dígitos"
        )
        LabelAndOutlinedTextField(
            Modifier,
            labelTop ="E-mail",
            labelInfo = "Ejemplo: correo.Usuario@gmail.com"
        )
        LabelAndOutlinedTextField(
            Modifier,
            labelTop ="Contraseña",
            labelInfo = "Debe contener al menos 6 dígitos"
        )
        LabelAndOutlinedTextField(
            Modifier,
            labelTop ="Repetir contraseña",
            labelInfo = "Repita su contraseña"
        )

        RadioButtonSex(selected = true, onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth())

        LabelAndOutlinedTextField(Modifier, "Edad", labelInfo = "Digite su edad")

        TextButtonPrincipal(labelOfButton = "REGISTRARME")


    }


}

@Preview(showBackground = true)
@Composable
fun RegisterScreenView() {
    POKEDEXTheme {

        RegisterScreen()

    }
}