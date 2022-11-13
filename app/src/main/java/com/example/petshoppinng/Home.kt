package com.example.petshoppinng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.petshoppinng.databinding.ActivityHomeBinding
import com.example.petshoppinng.databinding.ActivityMainBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.Nosotros.setOnClickListener{startActivity(Intent(this, Nosotros::class.java))}
        binding.Ingresousuario.setOnClickListener{startActivity(Intent(this, Loginusuario::class.java))}
        binding.Registro.setOnClickListener{startActivity(Intent(this, Registrosario::class.java))}
    }
}