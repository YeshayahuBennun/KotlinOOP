package com.ybennun.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            20 / 0
        } catch (exception: Exception) {
            exception.printStackTrace()
        }
    }
}