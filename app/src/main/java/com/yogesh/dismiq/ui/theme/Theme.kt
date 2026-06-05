
package com.yogesh.dismiq.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


/* Other default colors to override
background = Color(0xFFFFFBFE),
surface = Color(0xFFFFFBFE),
onPrimary = Color.White,
onSecondary = Color.White,
onTertiary = Color.White,
onBackground = Color(0xFF1C1B1F),
onSurface = Color(0xFF1C1B1F),
*/

private val ColorScheme = lightColorScheme(
    primary = EmeraldGreen,
    secondary = NavyBlue,
    background = LightBackground,
    surface = CardBackground
)

@Composable
fun DismiQTheme( content:@Composable ()-> Unit)
{
    MaterialTheme(
        colorScheme =ColorScheme,
        typography = Typography,
        content = content
    )




}

