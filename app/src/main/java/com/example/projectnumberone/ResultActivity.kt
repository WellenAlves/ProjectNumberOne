package com.example.projectnumberone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvresult = findViewById<TextView>(R.id.textview_result)
        val tvclassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val result = intent.getFloatExtra("Extra_Result", 0.1f)

        tvresult.text = result.toString()

        val classificacao = if(result < 18.5f) {
            "Abaixo do peso"
        } else if (result in 18.5f..24.9f) {
            "Peso Normal"
        } else if (result in 25f..29.9f) {
            "Sobrepeso"
        } else {
            "Obesidade"
        }
        tvclassificacao.text= getString(R.string.message_classificaçao,classificacao)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}