package com.sbro.androidexc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide();
    }

    fun login(view: View) {
        val intent = Intent(this,LoginActivity::class.java);
        startActivity(intent);
    }
}
