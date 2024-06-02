package com.example.arbeid

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.arbeid.ui.activities.HomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        /* TODO: Create method for checking if the client user is currently logged */
        val isUserLogged = true
        /*
        * adasdasdasda
        * */
        if (isUserLogged) {
            Intent(applicationContext, HomeActivity::class.java).also {
                startActivity(it)
            }
        } else {
            /* TODO: Replace this with intent to access the login activity  */
        }
    }
}
