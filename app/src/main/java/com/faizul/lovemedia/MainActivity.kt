package com.faizul.lovemedia

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.faizul.lovemedia.data.repository.NewsRepository
import com.faizul.lovemedia.databinding.ActivityMainBinding
import com.faizul.lovemedia.utils.NewsViewModelFactory
import com.faizul.lovemedia.viewmodel.NewsViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: NewsViewModel by viewModels{
        NewsViewModelFactory(NewsRepository())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        installSplashScreen()
        setContentView(binding.root)

        binding.bottomNavView.setupWithNavController(
            (supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
                .navController
        )

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.navController
//
//        binding.bottomNavView.setupWithNavController(navController)
//
//        binding.bottomNavView.setOnNavigationItemReselectedListener { item ->
//            when(item.itemId){
//                R.id.nav_republika -> {
//                    navController.navigate(R.id.nav_republika)
//                }
//            }
//        }
    }
}