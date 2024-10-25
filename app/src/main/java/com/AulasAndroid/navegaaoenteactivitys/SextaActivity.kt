package com.AulasAndroid.navegaaoenteactivitys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.AulasAndroid.navegaaoenteactivitys.ui.theme.NavegacaoEnteActivitysTheme

class SextaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement =Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column {
                    Row {
                        Text(text ="*                     *        ", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="*                      *   ", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="*                      *   ", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="*                      *", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="*                      *", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="*                     *   ", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="     *            * ", color = Color.DarkGray)
                    }

                    Row {
                        Text(text ="        *    *  ", color = Color.DarkGray)
                    }
                }
            }

        }
    }
}
