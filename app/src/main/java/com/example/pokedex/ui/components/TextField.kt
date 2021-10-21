package com.example.pokedex.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pokedex.ui.theme.POKEDEXTheme
import com.example.pokedex.ui.theme.getCurrentTheme

@Composable
fun SimpleOutlinedTextField(
    labelHint: String = "...",
    style: TextStyle = MaterialTheme.typography.h6,
    modifier: Modifier = Modifier
        .padding(top = 16.dp)
        .fillMaxWidth()
        .fillMaxWidth()
        .background(
            color = MaterialTheme.colors.surface,
            shape = RoundedCornerShape(16.dp)
        )
) {
    var valueInTextField by remember { mutableStateOf("") }

    OutlinedTextField(
        value = valueInTextField,
        onValueChange = { valueInTextField = it },
        label = null,
        placeholder = {
            Text(
                labelHint,
                style = style,
                color = getCurrentTheme().hintText
            )
        },
        modifier = modifier,
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        textStyle = TextStyle(textAlign = TextAlign.Center)
    )
}

@Composable
fun LabelAndOutlinedTextField(
    modifier: Modifier = Modifier,
    labelTop: String = "Label",
    labelInfo: String = "...",
    style: TextStyle = MaterialTheme.typography.body2

) {
    Column(modifier = modifier.padding(top = 24.dp)) {

        Text(
            labelTop,
            style = MaterialTheme.typography.body1,
            color = MaterialTheme.colors.primary
        )
        SimpleOutlinedTextField(labelInfo, style = style)
    }
}

@Preview(showBackground = true)
@Composable
fun LabelAndOutlinedTextFieldView() {
    POKEDEXTheme {
        LabelAndOutlinedTextField(Modifier, "Nombre", "Nombresito", MaterialTheme.typography.body2)
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleOutlinedTextFieldView() {
    POKEDEXTheme {
        Column() {
            SimpleOutlinedTextField()
            SimpleOutlinedTextField()
        }

    }
}