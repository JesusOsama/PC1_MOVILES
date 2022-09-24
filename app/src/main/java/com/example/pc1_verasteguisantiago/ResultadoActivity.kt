package com.example.pc1_verasteguisantiago

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val valor1 = intent.getStringExtra("param1").toString()
        val valor2 = intent.getStringExtra("param2").toString()

        val num1 : Int = valor1.toInt()
        val num2 : Int = valor2.toInt()


        val suma = findViewById<TextView>(R.id.r_suma)
        val resta = findViewById<TextView>(R.id.r_resta)
        val multi = findViewById<TextView>(R.id.r_multi)
        val div = findViewById<TextView>(R.id.r_div)


        suma.text = (num1+num2).toString()
        resta.text = (num1-num2).toString()
        multi.text = (num1*num2).toString()
        div.text = (num1/num2).toString()

    }
}