package com.example.baitap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ViewModel.TaskViewModel
import View.TaskListScreen
import View.AddTaskScreen





class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<TaskViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "list") {
                composable("list") { TaskListScreen(navController, viewModel) }
                composable("add") { AddTaskScreen(navController, viewModel) }
            }
        }
    }
}