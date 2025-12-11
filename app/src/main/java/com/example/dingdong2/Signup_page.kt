package com.example.dingdong2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dingdong2.databinding.ActivityLoginPageBinding
import com.example.dingdong2.databinding.ActivitySignupPageBinding

class Signup_page : AppCompatActivity() {
    private val binding: ActivitySignupPageBinding by lazy{
        ActivitySignupPageBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.alreadyhaveaccount.setOnClickListener {
            intent = Intent(this , Login_page::class.java)
            startActivity(intent)
        }
        binding.createaccount.setOnClickListener {
            intent = Intent(this , Login_page::class.java)
            startActivity(intent)
        }

    }
}