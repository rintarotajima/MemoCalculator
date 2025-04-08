package com.example.memocalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.memocalculator.ui.theme.MemoCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MemoCalculatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CalculationApp(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CalculationApp(modifier: Modifier = Modifier) {
    val displayValue by remember { mutableStateOf("0") }

    Column(modifier = modifier) {
        CalculationField(
            value = displayValue,
            modifier = Modifier.weight(1f)
        )
        Column(
            modifier = Modifier.weight(4f)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "(",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = ")",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "%",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "AC",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "7",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "8",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "9",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "÷",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "4",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "5",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "6",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "×",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "1",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "2",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "3",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "-",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "0",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = ".",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "=",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "+",
                    onClick = { /*TODO*/ },
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}


@Composable
fun CalculationField(
    value: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.LightGray)
            .padding(2.dp),
        contentAlignment = Alignment.BottomEnd
    ) {
        Text(
            text = value,
            fontSize = 48.sp,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Composable
fun CalculationButton(
    label: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
//            .fillMaxHeight()
            .size(60.dp)
            .padding(4.dp)
    ) {
        Text(
            text = label,
            fontSize = 28.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CalculationAppPreview() {
    MemoCalculatorTheme {
        Scaffold { innerPadding ->
            CalculationApp(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
//                    .background(Color.LightGray)
            )
        }
    }
}
