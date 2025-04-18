package com.example.memocalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
    var displayValue by remember { mutableStateOf("0") }

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
                    onClick = { displayValue = "(" },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = ")",
                    onClick = { displayValue = ")" },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "%",
                    onClick = {
                        if (displayValue.last() != '+' && displayValue.last() != '-' && displayValue.last() != '×' && displayValue.last() != '÷') {
                            displayValue += "%"
                        } else {
                            displayValue = displayValue.dropLast(1) + "%"
                        }
                    },
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
                    onClick = { 
                        if (displayValue == "0") {
                            displayValue = "7"
                        } else {
                            displayValue += "7"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "8",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "8"
                        } else {
                            displayValue += "8"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "9",
                    onClick = {
                         if (displayValue == "0") {
                            displayValue = "9"
                        } else {
                            displayValue += "9"
                        }                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "÷",
                    onClick = {
                        if (displayValue.last() != '÷' && displayValue.last() != '×' && displayValue.last() != '-' && displayValue.last() != '+') {
                            displayValue += "÷"
                        } else {
                            displayValue = displayValue.dropLast(1) + "÷"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "4",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "4"
                        } else {
                            displayValue += "4"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "5",
                    onClick = {
                        if ( displayValue == "0") {
                            displayValue = "5"
                        } else {
                            displayValue += "5"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "6",
                    onClick = {
                        if ( displayValue == "0") {
                            displayValue = "6"
                        } else {
                            displayValue += "6"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "×",
                    onClick = {
                        if (displayValue.last() != '×' && displayValue.last() != '÷' && displayValue.last() != '-' && displayValue.last() != '+') {
                            displayValue += "×"
                        } else {
                            displayValue = displayValue.dropLast(1) + "×"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "1",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "1"
                        }
                        else {
                            displayValue += "1"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "2",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "2"
                        }
                        else {
                            displayValue += "2"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "3",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "3"
                        }
                        else {
                            displayValue += "3"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "-",
                    onClick = {
                        if (displayValue.last() != '-' && displayValue.last() != '+' ) {
                            displayValue += "-"
                        } else {
                            displayValue = displayValue.dropLast(1) + "-"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                CalculationButton(
                    label = "0",
                    onClick = {
                        if (displayValue == "0") {
                            displayValue = "0"
                        } else {
                            displayValue += "0"
                        }
                    },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = ".",
                    onClick = { displayValue += "." },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "=",
                    onClick = { displayValue = "=" },
                    modifier = Modifier.weight(1f)
                )
                CalculationButton(
                    label = "+",
                    onClick = {
                        if (displayValue.last() != '+' && displayValue.last() != '-' && displayValue.last() != '×' && displayValue.last() != '÷') {
                            displayValue += "+"
                        } else {
                            displayValue = displayValue.dropLast(1) + "+"
                        }
                    },
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
            .size(132.dp)
            .padding(4.dp)
    ) {
        Text(
            text = label,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
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
            )
        }
    }
}
