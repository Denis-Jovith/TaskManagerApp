package com.example.taskmanagerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerapp.ui.theme.TaskManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerAppTheme {
                Surface()  {
                    TaskDone(
                        description = "All tasks completed",
                        congratulation = "Nice Work!"
                    )
                }
            }
        }
    }
}

@Composable
fun TaskDone(description: String,congratulation: String,modifier: Modifier=Modifier){
    Column (
        verticalArrangement= Arrangement.Center,
        modifier= Modifier
            .fillMaxSize()

    ){
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null,
            modifier= Modifier
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = description,
            fontWeight = Bold,
            modifier= Modifier
                .padding(top = 24.dp, bottom = 8.dp)
                .align(Alignment.CenterHorizontally)


        )
        Text(
            text=congratulation,
            fontSize = 16.sp,
            modifier= Modifier
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerAppTheme {
        TaskDone(description = "All tasks completed", congratulation = "Nice work!")
    }
}