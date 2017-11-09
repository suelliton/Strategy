package com.example.suelliton.strategy;

import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by suelliton on 08/11/2017.
 */

public class NormalFrete implements Frete {
    @Override
    public double calculaPreco(int distancia) {
        double preco = distancia * 0.70 + 10;
        Log.i("mensagens","Preco do frete normal : "+ preco);
        return preco;
    }


}
