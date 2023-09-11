package com.example.barbeariaapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.barbeariaapp.R
import com.example.barbeariaapp.databinding.ActivityHomeBinding
import com.example.barbeariaapp.databinding.ActivityMainBinding

class Home : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val nome = intent.extras?.getString("nome")

        binding.txtNomeUsuario?.text ?: "Bem vindo,$nome"
    }
}