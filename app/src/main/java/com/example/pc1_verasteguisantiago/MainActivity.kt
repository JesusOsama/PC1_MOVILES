package com.example.pc1_verasteguisantiago

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_valor_1: EditText = findViewById(R.id.et_valor_1)
        val et_valor_2: EditText = findViewById(R.id.et_valor_2)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            this.sendvalor1(et_valor_1.text.toString(),et_valor_2.text.toString() );
        }
    }

    private fun sendvalor1(message1: String, message2: String){
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("param1", message1)
        intent.putExtra("param2", message2)
        startActivity(intent)
    }

}