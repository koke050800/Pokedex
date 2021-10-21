package com.example.pokedex.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme


import androidx.compose.material.MaterialTheme

import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.style.TextAlign


@Composable
fun TextButtonPrincipal(
    //onClick: () -> Unit,
    labelOfButton: String = "Button"
) {
    Button(
        onClick = { /* Do something! */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 32.dp)
            .background(
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(16.dp)
            ),
        colors = ButtonDefaults.textButtonColors(backgroundColor = MaterialTheme.colors.primary),
        shape = RoundedCornerShape(16.dp)
    ) {
        Text(
            labelOfButton,
            style = MaterialTheme.typography.button,
            color = MaterialTheme.colors.onPrimary
        )
    }
}

@Composable
fun OutlinedTextButton(labelOfButton: String = "Button", onClick: () -> Unit) {
    OutlinedButton(
        onClick = { onClick() },
        modifier = Modifier
            .padding(top = 32.dp)
            .background(
                color = getCurrentTheme().divider,
                shape = RoundedCornerShape(4.dp)
            ),
        colors = ButtonDefaults.textButtonColors(backgroundColor = MaterialTheme.colors.background),
        shape = RoundedCornerShape(4.dp)

    ) {
        Text(
            labelOfButton,
            style = MaterialTheme.typography.button,
            color = MaterialTheme.colors.primary
        )
    }
}

@Composable
fun RadioButtonSex(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: RadioButtonColors = RadioButtonDefaults.colors()
) {

    var state by remember { mutableStateOf(false) }
    Column(
        modifier = modifier.padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            "Sexo",
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.primary,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Row(Modifier.selectableGroup(), Arrangement.Center) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {


                RadioButton(
                    selected = state,
                    onClick = { state = true },
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    enabled = true

                    )


                Text(
                    text = "HOMBRE",
                    style = MaterialTheme.typography.overline,
                    modifier = Modifier.padding(4.dp),
                    color = MaterialTheme.colors.primary
                )

            }

            Spacer(modifier = Modifier.width(48.dp))

            Column(horizontalAlignment = Alignment.CenterHorizontally) {


                RadioButton(
                    selected = !state,
                    onClick = { state = false },
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    enabled = true

                )


                Text(
                    text = "MUJER",
                    style = MaterialTheme.typography.overline,
                    modifier = Modifier.padding(4.dp),
                    color = MaterialTheme.colors.primary
                )

            }

        }
    }
}




@Preview(showBackground = true)
@Composable
fun RadioButtonSexView(){
    POKEDEXTheme() {
        RadioButtonSex(selected = true, onClick = { /*TODO*/ })
    }
}


@Preview(showBackground = true)
@Composable
fun OutlinedTextButtonView(){
    POKEDEXTheme {
        //OutlinedTextButton()
    }
}

@Preview(showBackground = true)
@Composable
fun TextButtonPrincipalView(){
    POKEDEXTheme() {
        TextButtonPrincipal()
    }
}