package com.example.lucas_pc.alcoolxgasolina

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var btn_calcular : Button? = null
    private var edt_gasolina : EditText? = null
    private var edt_alcool : EditText? = null
    private var lb_result : TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcular = findViewById(R.id.btn_calcular)
        edt_gasolina = findViewById(R.id.edt_gasolina)
        edt_alcool   = findViewById(R.id.edt_alcool)
        lb_result    = findViewById(R.id.lb_result)

        btn_calcular!!.setOnClickListener{
            if((edt_gasolina?.text.toString() != "") and (edt_alcool?.text.toString() != "")){
                var gasosa : Float = edt_gasolina?.text.toString().toFloat()
                var alcool : Float = edt_alcool?.text.toString().toFloat()
                var resultado : Float = alcool/gasosa

                if(resultado < 0.7){
                    lb_result!!.text = "Usa alcool porra"
                }else{
                    lb_result!!.text = "Usa gasolina porra"
                }
            }else{
                Toast.makeText(this,"Preencha os Campos",Toast.LENGTH_LONG).show()
            }

        }
    }
}
