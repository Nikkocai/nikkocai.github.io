package com.curso.android.app.practica.proyectofinal.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practica.proyectofinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.inputResult.observe(this) {
            binding.resultOutput.text = if (it.cmp) "Son iguales" else "No son iguales"
        }

        binding.cmpBtn.setOnClickListener{
            mainViewModel.compareTextFields(
                binding.textField1.text.toString(),
                binding.textField2.text.toString()
            )
        }

    }
}
