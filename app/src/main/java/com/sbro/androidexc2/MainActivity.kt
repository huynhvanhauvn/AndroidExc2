package com.sbro.androidexc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide();
    }

    fun start(view: View) {
        val intent = Intent(this,ConnexionActivity::class.java);
        startActivity(intent);
    }
}
