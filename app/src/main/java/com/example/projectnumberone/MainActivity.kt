package com.example.projectnumberone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtPeso: EditText= findViewById<EditText>(R.id.edittext_peso)
        val edtAltura: EditText= findViewById<EditText>(R.id.edittext_altura)
        val btncalcular: Button= findViewById<Button>(R.id.btncalcular)


        btncalcular.setOnClickListener {
            val alturaStr=edtAltura.text.toString()
            val pesoStr=edtPeso.text.toString()

            if(alturaStr.isNotEmpty()&&pesoStr.isNotEmpty()){

            val altura: Float=edtAltura.text.toString().toFloat()
            val peso: Float = edtPeso.text.toString().toFloat()

            val alturaFinal: Float = altura * altura
            val result = peso/alturaFinal

            val intent = Intent(this,ResultActivity::class.java)
                .apply {
                    putExtra("Extra_Result", result)

                }

            startActivity(intent)
            } else {
                Toast.makeText(this,"Preencher todos os campos",Toast.LENGTH_LONG).show()
            }


           }



    }
}