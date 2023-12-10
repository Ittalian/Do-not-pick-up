package com.example.ittalian.dontpicktup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ittalian.dontpicktup.databinding.ActivityMainBinding

open class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                val intent = Intent(this, AlarmService::class.java)
                startService(intent)
            } else {
                val intent = Intent(this, AlarmService::class.java)
                stopService(intent)
            }
        }
    }
}