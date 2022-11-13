package com.example.petshoppinng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petshoppinng.databinding.ActivityNosotrosBinding
import com.example.petshoppinng.databinding.ActivityProductosBinding

class Productos : AppCompatActivity() {
    private lateinit var binding: ActivityProductosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProductosBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        binding.Venta.setOnClickListener{startActivity(Intent(this, Nosotros::class.java))}
        binding.Compra.setOnClickListener{startActivity(Intent(this, Nosotros::class.java))}
    }
}