package com.example.petshoppinng

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.petshoppinng.databinding.ActivityHomeBinding
import com.example.petshoppinng.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.Ingresar.setOnClickListener{startActivity(Intent(this, Home::class.java))}
    }
}