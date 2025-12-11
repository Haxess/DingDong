package com.example.dingdong2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dingdong2.databinding.ActivityLocationBinding

class Location : AppCompatActivity() {
    private val binding: ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val LocationList: Array<String> = arrayOf("Choose Location","Jaipur","Delhi","Mumbai","Kolkata","Mumbai","Jodhpur")
        val adapter = ArrayAdapter(this , android.R.layout.simple_list_item_1,LocationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}