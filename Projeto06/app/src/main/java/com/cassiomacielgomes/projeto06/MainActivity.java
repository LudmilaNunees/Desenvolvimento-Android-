package com.cassiomacielgomes.projeto06;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    String[] frases = {
            "Cada passo conta na sua jornada.",
            "Acredite: o melhor ainda está por vir!",
            "Desafios são oportunidades disfarçadas."
    };

    public void gerarFrase(View view){
        TextView texto = findViewById(R.id.text_result);
        int numeroAleatorio = new Random().nextInt(3);

        String frase = frases[numeroAleatorio];

        texto.setText(frase);
    }

    public void exibirTodas(View view){
        TextView texto = findViewById(R.id.text_result);

        String textoResultado = " ";

        for(String frase : frases){
            textoResultado = textoResultado + frase + "\n \n";
        }

        texto.setText(textoResultado);
    }
}