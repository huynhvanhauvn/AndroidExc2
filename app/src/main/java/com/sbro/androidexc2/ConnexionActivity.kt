package com.sbro.androidexc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ConnexionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connexion)
        supportActionBar?.hide();
    }

    fun create(view: View) {
        val intent = Intent(this,SignUpActivity::class.java);
        startActivity(intent);
    }
    fun login(view: View) {
        val intent = Intent(this,LoginActivity::class.java);
        startActivity(intent);
    }
}
