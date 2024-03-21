package com.example.retrofil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit:Retrofit = Retrofit.Builder()
            .baseUrl("https://botw-compendium.herokuapp.com/api/v3/compendium/all")
            .addConverterFactory(ScalarConverterFactory.create())
            .build()
        val jujuapi:Jujuapi = retrofit.create()
    }
}