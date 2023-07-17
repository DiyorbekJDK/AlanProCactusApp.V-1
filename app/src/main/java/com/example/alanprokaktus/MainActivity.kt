package com.example.alanprokaktus

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.alanprokaktus.databinding.ActivityMainBinding
import java.util.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#1CD9F1")

        binding.textView2.setOnClickListener {
            binding.textView2.setTextColor(randomColor())
        }
        binding.button5.setOnClickListener {
            goToLink("http://www.youtube.com/@user-el5ib2sd6r")
        }
        binding.button6.setOnClickListener {
            goToLink("https://t.me/Alan_pro_kaktus")
        }
        binding.button7.setOnClickListener {
            goToLink("https://t.me/Iion_Alan_pro_kaktus")
        }
        binding.button8.setOnClickListener {
            Toast.makeText(this, "Находиться в разработке", Toast.LENGTH_SHORT).show()
        }

    }

    private fun randomColor(): Int {
        val random = Random()
        return Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }

    private fun goToLink(link: String) {
        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}