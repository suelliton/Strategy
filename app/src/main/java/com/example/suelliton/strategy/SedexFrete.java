package com.example.suelliton.strategy;

import android.util.Log;

/**
 * Created by suelliton on 08/11/2017.
 */

public class SedexFrete implements Frete {
    @Override
    public double calculaPreco(int distancia) {
        double preco = distancia * 1.20 + 12;
        Log.i("mensagens","Preco do frete sedex : "+ preco);
        return preco;
    }
}
