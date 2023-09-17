package com.example.barbeariaapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.barbeariaapp.adapter.ServicosAdapter.*
import com.example.barbeariaapp.databinding.ActivityMainBinding
import com.example.barbeariaapp.databinding.ServicosItemBinding
import com.example.barbeariaapp.model.Servicos

class ServicosAdapter(private val context: Context,private val listaServicos:MutableList<Servicos>):
    RecyclerView.Adapter<ServicosAdapter.ServicosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ServicosViewHolder {
        val itemLista = ServicosItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ServicosViewHolder(itemLista)
    }
    override fun getItemCount() = listaServicos.size

    override fun onBindViewHolder(holder: ServicosViewHolder, position: Int) {
        holder.imgServicos.setImageResource(listaServicos[position].img!!)
        holder.txtServico.text = listaServicos[position].nome
    }
    inner class ServicosViewHolder(binding: ServicosItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgServicos = binding.imgServicos
        val txtServico = binding.txtServico
    }
}