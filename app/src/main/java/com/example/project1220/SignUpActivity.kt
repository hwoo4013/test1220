package com.example.project1220

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun showToast(message:String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun onSignupClick(view: View) {
        val username = findViewById<EditText>(R.id.edit_name).text.toString()
        val userid = findViewById<EditText>(R.id.edit_id).text.toString()
        val userpwd = findViewById<EditText>(R.id.edit_pwd).text.toString()

        if(username.isNotEmpty() && userid.isNotEmpty() && userpwd.isNotEmpty()) {
            startActivity(Intent(this, HomeActivity::class.java))
        }
        else {
            showToast("입력되지 않은 정보가 있습니다.")
        }

    }
}