package com.example.petshoppinng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petshoppinng.databinding.ActivityHomeBinding
import com.example.petshoppinng.databinding.ActivityNosotrosBinding

class Nosotros : AppCompatActivity() {
    private lateinit var binding: ActivityNosotrosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNosotrosBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.UbicaciN.setOnClickListener{startActivity(Intent(this, Ubicacion::class.java))}
        binding.Productos.setOnClickListener{startActivity(Intent(this, Productos::class.java))}
        binding.Clientes.setOnClickListener{startActivity(Intent(this, Clientes::class.java))}
        binding.Homego.setOnClickListener{startActivity(Intent(this, Home::class.java))}
    }
}