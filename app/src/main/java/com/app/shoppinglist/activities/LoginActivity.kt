package com.app.shoppinglist.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.app.shoppinglist.R
import com.app.shoppinglist.utils.onAlertDialog
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    companion object{
        const val USER_NAME = "USER_NAME"
    }

    override fun onClick(v: View?) {

    }


    private fun validationLogin(username: String, password: String): Boolean {
        return etUsername.text.toString() == username && etPassword.text.toString() == password
    }

    fun onClickLogin(view: View) {
        if(validationLogin("u", "")){
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(USER_NAME, etUsername.text.toString())
            startActivity(intent)
        }else onAlertDialog(view, "Failed!", "Username or Password is Wrong")
    }
}