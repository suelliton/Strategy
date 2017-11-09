package com.example.suelliton.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Frete freteQualquer = new NormalFrete();

        freteQualquer.calculaPreco(120); //preco normal

        freteQualquer = new SedexFrete();//mudanca de algoritmo em tempo de execuçao

        freteQualquer.calculaPreco(120);//frete sedex



    }
}
