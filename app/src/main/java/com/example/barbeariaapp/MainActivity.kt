package com.example.barbeariaapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.barbeariaapp.databinding.ActivityMainBinding
import com.example.barbeariaapp.view.Home
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
                    mensagem(it,"Coloque Seu Nome!")
                }
                senha.isEmpty() ->{
                    mensagem(it,"Digite sua senha!")
                }
                senha.length <= 5 -> {
                    mensagem(it,"A senha precisa ter pelo menos 6 caracteres!")
                }
                else ->{
                    navegarPraHome(nome)
                }
            }
        }
    }
    private fun mensagem(view: View, mensagem: String){
        val snackbar = Snackbar.make(view,mensagem,Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
        snackbar.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.show()
    }
    private fun navegarPraHome(nome: String){
        val intent = Intent(this,Home::class.java)
        intent.putExtra("nome",nome)
        startActivity(intent)
    }
}