package com.eaj.ufrn.joane.cartaodevacina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "Extra" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void telaInicial( View view){
        Intent abrirTelaInicial = new Intent(this, tela_inicio.class);
       // abrirTelaInicial.putExtra(EXTRA_MESSAGE, true);
        startActivity(abrirTelaInicial);
    }
}
