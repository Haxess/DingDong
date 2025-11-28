package com.example.dingdong2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.dingdong2.databinding.ActivityStartScreenBinding

class Start_Screen : AppCompatActivity() {
    private val binding: ActivityStartScreenBinding by lazy{
        ActivityStartScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Use the root of the binding object as the content view
        setContentView(binding.root)
        binding.nextbutton.setOnClickListener{
            val intent = Intent(this , Login_page::class.java)
            startActivity(intent)
        }
    }
}
