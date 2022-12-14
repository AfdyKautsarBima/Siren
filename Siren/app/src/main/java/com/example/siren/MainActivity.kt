package com.example.siren

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.siren.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

enum class ProviderType{
    BASIC
}
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav: BottomNavigationView = binding.bottomNavigationView
        val navHost = supportFragmentManager.findFragmentById(R.id.navHostFragment)
        val navController = navHost!!.findNavController()
        bottomNav.setupWithNavController(navController)
    }
}