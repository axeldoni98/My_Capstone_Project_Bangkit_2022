package com.cc22_ps197.nutrichild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cc22_ps197.nutrichild.databinding.ActivityInputDataBinding

class InputDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInputDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val confirmButton = binding.btnAddData

        confirmButton.setOnClickListener {
            moveToHomePage()
        }
    }

    private fun moveToHomePage() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}