package com.example.micalculadorav3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1, numero2;
    private CheckBox checksuma, checkrestar, checkmultiplica, checkdividir;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.txtnumero1);
        numero2 = (EditText) findViewById(R.id.txtnumero2);
        checksuma = (CheckBox) findViewById(R.id.cbsumar);
        checkrestar  = (CheckBox) findViewById(R.id.cbrestar);
        checkmultiplica = (CheckBox) findViewById(R.id.cbmultiplicar);
        checkdividir = (CheckBox) findViewById(R.id.cbdividir);
        resultado = (TextView) findViewById(R.id.textView2);


    }

    public void calcular(View view){

        int numero1 = (Integer) (Integer.parseInt(this.numero1.getText().toString()));
        int numero2 = (Integer) (Integer.parseInt(this.numero2.getText().toString()));
        String resultado = "";
        if(checksuma.isChecked() == true){
            resultado = "Suma : "+  (numero1 + numero2);
        }
        if(checkrestar.isChecked()){
            resultado = resultado + " /  Resta : " + (numero1 - numero2);

        }
        if(checkmultiplica.isChecked()){
            resultado = resultado + " / Multiplicar : " + (numero1*numero2);
        }
        if(checkdividir.isChecked()){
            if(numero2 != 0){
                resultado = resultado + " Dividir : " + (numero1 / numero2);
            }
            else{
                resultado = resultado + " Dividir : La división no es valida";
            }

        }

        this.resultado.setText(resultado);
    }
}