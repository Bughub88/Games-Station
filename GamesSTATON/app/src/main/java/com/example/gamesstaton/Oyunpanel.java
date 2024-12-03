package com.example.gamesstaton;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Oyunpanel extends AppCompatActivity {
    Button btnyazitura;
    Button btneslestirme;
    Button btntaskamak;
    Button btnsos;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyunpanel);
        btnyazitura =(Button) findViewById(R.id.yazitura);
        btneslestirme =(Button) findViewById(R.id.Eşleştirme);
        btntaskamak =(Button) findViewById(R.id.taskamak);
        btnsos =(Button) findViewById(R.id.sos);
        btnyazitura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oyunpanel.this, test.class);
                startActivity(intent);
            }
        });
        btneslestirme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oyunpanel.this, eslestirme.class);
                startActivity(intent);
            }
        });
        btntaskamak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oyunpanel.this, taskamak.class);
                startActivity(intent);
            }
        });
        btnsos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oyunpanel.this, XOX.class);
                startActivity(intent);
            }
        });


    }
}
