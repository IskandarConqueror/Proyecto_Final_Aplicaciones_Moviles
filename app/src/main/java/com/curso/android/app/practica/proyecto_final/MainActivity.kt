package com.curso.android.app.practica.proyecto_final

import Comparartext.TextComparisonViewModel
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: TextComparisonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[TextComparisonViewModel::class.java]

        val compareButton = findViewById<Button>(R.id.compareButton)
        compareButton.setOnClickListener {
            compareTexts()
        }
    }

    private fun compareTexts() {
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)

        val text1 = editText1.text.toString()
        val text2 = editText2.text.toString()

        val textsAreEqual = viewModel.compareTexts(text1, text2)

        val message = if (textsAreEqual) {
            "Los textos son iguales (TextView)"
        } else {
            "Los textos son diferentes (No TextView)"
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}