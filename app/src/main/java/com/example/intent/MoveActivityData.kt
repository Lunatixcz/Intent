package com.example.intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveActivityData : AppCompatActivity() {

    companion object {
        const val EXTRA_AGE = "extra_age"
        const val  EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_data)

        val tvDataReceived : TextView = findViewById(R.id.tv_data_received)

        val age = intent.getStringExtra(EXTRA_AGE)
        val name = intent.getStringExtra(EXTRA_NAME)

        val text = "Name : $name, Your age : $age"
        tvDataReceived.text = text
    }
}