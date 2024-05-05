package com.example.jcuiapp7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcuiapp7.ui.theme.AppBackground1
import com.example.jcuiapp7.ui.theme.AppBackground2
import com.example.jcuiapp7.ui.theme.AppWhiteOpacity
import com.example.jcuiapp7.ui.theme.JCUIApp7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JCUIApp7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainView(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        AppBackground1, AppBackground2
                    )
                )
            )
    ) {
        Column(Modifier.fillMaxSize()) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(25.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, AppWhiteOpacity),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.size(50.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.dashboard),
                        contentDescription = "Dashboard",
                        tint = Color.White,
                        modifier = Modifier.fillMaxSize()
                    )
                }
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, AppWhiteOpacity),
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = Color.Transparent,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.size(50.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_settings),
                        contentDescription = "Settings",
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JCUIApp7Theme {
        MainView()
    }
}