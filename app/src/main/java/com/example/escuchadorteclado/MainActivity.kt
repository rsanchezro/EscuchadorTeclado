package com.example.escuchadorteclado

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var texto: EditText =findViewById<EditText>(R.id.edittext)
        texto.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                Log.println(Log.INFO,"BEFORE","El caracter que se va a introduir es: ${s.toString()}")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.println(Log.INFO,"ON","El caracter que se va a introduir es: ${s.toString()}")
            }

            override fun afterTextChanged(s: Editable?) {
                Log.println(Log.INFO,"AFTER","El caracter que se va a introduir es: ${s.toString()}")
            }

        })




    }
}