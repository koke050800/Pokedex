package com.example.pokedex.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Obtiene el tema segun la configuracion del sistema
 * @param darkTheme En caso de forzar los colores del tema
 * @return El tema segun si es oscuro o claro
 * @see DarkTheme
 * @see LightTheme
 */
@Composable
fun getCurrentTheme(darkTheme: Boolean = isSystemInDarkTheme()) = if (darkTheme) DarkTheme else LightTheme

/**
 * Aplica el tema de GMAR a el contenido de este [Composable]
 * @param statusBarColor Aplica este color al StatusBar al hacer la primera composicion
 * @param content Contenido a aplicar el tema GMAR
 * @see [SystemUiController]
 * @see [MaterialTheme]
 */
@Composable
fun POKEDEXTheme(
    updateStatusBar: Boolean = true,
    statusBarColor: Color = Color.Transparent,
    content: @Composable (SystemUiController) -> Unit
) {
    val theme = getCurrentTheme()

    MaterialTheme(
        colors = theme.colors,
        typography = Typography(theme),
        shapes = Shapes
    ){
        val uiController = rememberSystemUiController()

        if(updateStatusBar){
            uiController.setStatusBarColor(
                statusBarColor,
                !isSystemInDarkTheme()
            )
        }

        uiController.setNavigationBarColor(
            theme.toolbar
        )

        content(uiController)
    }
}