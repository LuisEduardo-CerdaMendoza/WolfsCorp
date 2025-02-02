package com.tesji.wolfscorp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.tesji.wolfscorp.model.CalculoPrestaciones

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNombre = findViewById<EditText>(R.id.txNombre);
        val txtAnio = findViewById<EditText>(R.id.txAno);
        val txtPagoDia = findViewById<EditText>(R.id.txPagoDia);
        val enero = findViewById<EditText>(R.id.txEnero);
        val febrero = findViewById<EditText>(R.id.txFebrero);
        val marzo = findViewById<EditText>(R.id.txMarzo);
        val abril = findViewById<EditText>(R.id.txAbril);
        val mayo = findViewById<EditText>(R.id.txMayo);
        val junio = findViewById<EditText>(R.id.txJunio);
        val julio = findViewById<EditText>(R.id.txJulio);
        val agosto = findViewById<EditText>(R.id.txAgosto);
        val septiembre = findViewById<EditText>(R.id.txSeptiembre);
        val octubre = findViewById<EditText>(R.id.txOctubre);
        val noviembre = findViewById<EditText>(R.id.txNoviembre);
        val diciembre = findViewById<EditText>(R.id.txDiciembre);
        val btnCalcular = findViewById<Button>(R.id.btCalcular);
        val resultado = findViewById<TextView>(R.id.txResultado);

        btnCalcular.setOnClickListener{
            if(txtNombre.text.toString().trim().isEmpty()){
                txtNombre.setError("\uD83D\uDCCC")
            }else if(txtAnio.text.toString().trim().isEmpty()){
                txtAnio.setError("\uD83D\uDCCC")
            }else if(txtPagoDia.text.toString().trim().isEmpty()){
                txtPagoDia.setError("\uD83D\uDCCC")
            }else if(enero.text.toString().trim().isEmpty()){
                enero.setError("\uD83D\uDCCC")
            }else if(febrero.text.toString().trim().isEmpty()){
                febrero.setError("\uD83D\uDCCC")
            }else if(marzo.text.toString().trim().isEmpty()){
                marzo.setError("\uD83D\uDCCC")
            }else if(abril.text.toString().trim().isEmpty()){
                abril.setError("\uD83D\uDCCC")
            }else if(mayo.text.toString().trim().isEmpty()){
                mayo.setError("\uD83D\uDCCC")
            }else if(junio.text.toString().trim().isEmpty()){
                junio.setError("\uD83D\uDCCC")
            }else if(julio.text.toString().trim().isEmpty()){
                julio.setError("\uD83D\uDCCC")
            }else if(agosto.text.toString().trim().isEmpty()){
                agosto.setError("\uD83D\uDCCC")
            }else if(septiembre.text.toString().trim().isEmpty()){
                septiembre.setError("\uD83D\uDCCC")
            }else if(octubre.text.toString().trim().isEmpty()){
                octubre.setError("\uD83D\uDCCC")
            }else if(noviembre.text.toString().trim().isEmpty()){
                noviembre.setError("\uD83D\uDCCC")
            }else if(diciembre.text.toString().trim().isEmpty()){
                diciembre.setError("\uD83D\uDCCC")
            }
            else{
                val terreno = CalculoPrestaciones()
                terreno.nombre = txtNombre.text.toString()
                terreno.anosident = txtAnio.text.toString().toInt()
                terreno.pagoHora = txtPagoDia.text.toString().toDouble()
                terreno.mesenero = enero.text.toString().toInt()
                terreno.mesfebrero = febrero.text.toString().toInt()
                terreno.mesmarzo = marzo.text.toString().toInt()
                terreno.mesabril = abril.text.toString().toInt()
                terreno.mesmayo = mayo.text.toString().toInt()
                terreno.mesjunio = junio.text.toString().toInt()
                terreno.mesjulio = julio.text.toString().toInt()
                terreno.mesagosto = agosto.text.toString().toInt()
                terreno.meseptiembre = septiembre.text.toString().toInt()
                terreno.mesoctubre = octubre.text.toString().toInt()
                terreno.mesnoviembre = noviembre.text.toString().toInt()
                terreno.mesdiciembre= diciembre.text.toString().toInt()
                //applicationContext o this
                resultado.setText( terreno.calcularVenta())
            }
        }

    }
}