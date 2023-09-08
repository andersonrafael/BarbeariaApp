package com.example.barbeariaapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.barbeariaapp.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener {

            val nome = binding.editeNome.text.toString()
            val senha = binding.editeSenha.text.toString()
            when{
                nome.isEmpty() -> {
                    mensagem(it, mensagem:"Coloque Seu Nome!")
                }
            }
        }
    }
    private fun mensagem(view: view, mensagem: String){
        val snackbar = Snackbar.make(view,mensagem,Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor(colorString:"#FF0000"))
        snackbar.setTextColor(Color.parseColor(colorString:"#FFFFFF"))
        snackbar.show()
    }
}