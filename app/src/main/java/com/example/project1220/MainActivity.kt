package com.example.project1220

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun onLoginClick(view: View) {

        val userid = findViewById<EditText>(R.id.edit_id).text.toString()
        val userpwd = findViewById<EditText>(R.id.edit_pwd).text.toString()

        if(userid.isNotEmpty() && userpwd.isNotEmpty()) {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        else {
            showToast("아이디/비밀번호를 확인해주세요.")
        }

    }

    fun onSignUp(view: View) {
        startActivity(Intent(this, SignUpActivity::class.java))
    }
}