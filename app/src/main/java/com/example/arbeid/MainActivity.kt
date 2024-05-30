package com.example.arbeid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        /* TODO: Create method for checking if the client user is currently logged */
        val isUserLogged = true

        if (isUserLogged) {
            setContentView(R.layout.activity_home)
        } else {
            /* TODO: Replace this with the login activity  */
            setContentView(R.layout.activity_main)
        }
    }
}
