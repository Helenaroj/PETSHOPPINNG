package com.example.petshoppinng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petshoppinng.databinding.ActivityClientesBinding
import com.example.petshoppinng.databinding.ActivityProductosBinding

class Clientes : AppCompatActivity() {
    private lateinit var binding: ActivityClientesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityClientesBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)
        binding.Return.setOnClickListener{startActivity(Intent(this, Home::class.java))}
    }
}