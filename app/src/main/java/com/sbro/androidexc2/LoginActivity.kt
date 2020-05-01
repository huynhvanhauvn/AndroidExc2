package com.sbro.androidexc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide();
    }

    fun signUp(view: View) {
        val intent = Intent(this,SignUpActivity::class.java);
        startActivity(intent);
    }
}
