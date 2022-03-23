package com.example.starter_pack_hybride_flutter_app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.starter_pack_hybride_flutter_app.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(){
    private lateinit var binding : ActivitySecondBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val backButton = findViewById<Button>(R.id.back_to_flutter_button)
        backButton.setOnClickListener {
            finish()
        }
    }

}