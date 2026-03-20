package com.example.lab1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Le compteur est initialisé à zéro
    private int counter = 0;

    // Référence vers le TextView utilisé pour afficher le compteur
    private TextView textCounterr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);// méthode appelée au démarrage de l'activité
        setContentView(R.layout.activity_main);// permet de lier l'interface XML avec le code Java
        // récupération des éléments de l'interface
        textCounterr = findViewById(R.id.text_counterr);
        Button btnToast = findViewById(R.id.buttonMessage);
        Button buttonCounterr = findViewById(R.id.button_counterr);

        // Clic sur le bouton Message va afficher un toast
        btnToast.setOnClickListener(v -> {
            Toast.makeText(this, "Bienvenue, alors c'est parti!", Toast.LENGTH_SHORT).show();
        });

        // Clic sur Incrémenter va met à jour le compteur
        buttonCounterr.setOnClickListener(v -> {
            counter++;
            textCounterr.setText(String.valueOf(counter)); // affiche du nombre mais incremente
        });
    }
}