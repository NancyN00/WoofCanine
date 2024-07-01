package com.example.woofcanine.dogcomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.woofcanine.viewmodel.DogsViewModel

@Composable
fun DogListScreen(){


    Box(modifier = Modifier.fillMaxWidth()){

      Text(text = "I am dog.")

    }


}