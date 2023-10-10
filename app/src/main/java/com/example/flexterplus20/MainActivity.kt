package com.example.flexterplus20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flexterplus20.PopularMoviesFragment
import com.example.flexterplus20.R.id
import com.example.flexterplus20.TvShowsFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.movieContent, PopularMoviesFragment(), null)
        fragmentTransaction.replace(id.TvShowContent, TvShowsFragment(), null).commit()

    }
}