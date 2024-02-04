package dev.raez.ecoeats.presentation.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.raez.ecoeats.ui.theme.EcoEatsTheme

@Composable
fun LoginScreen( modifier: Modifier = Modifier) {
    Text(
        text = "Hello !",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    EcoEatsTheme {
        LoginScreen()
    }
}