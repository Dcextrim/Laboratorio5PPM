
package com.uvg.laboratorio4
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.uvg.laboratorio4.ui.theme.Laboratorio4Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio4Theme {
                EmergencyContactsScreen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun Prueba1() {
    Laboratorio4Theme {
        EmergencyContactsScreen()
    }
}