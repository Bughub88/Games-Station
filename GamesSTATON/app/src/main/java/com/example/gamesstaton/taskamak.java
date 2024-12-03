package com.example.gamesstaton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class taskamak extends AppCompatActivity {
    ImageView imageViewOyuncu,imageViewBilgisayar;
    TextView textviewOyuncu,textViewBilgisayar;
    Button btnTaş,btnKağıt,btnMakas;


    int[] resimler={R.drawable.t,R.drawable.k, R.drawable.mak};
    int oyuncuPuan,bilgisayarPuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskamak);
        imageViewOyuncu=findViewById(R.id.iv_oyuncu);
        imageViewBilgisayar=findViewById(R.id.iv_bilgisayar);
        textviewOyuncu= findViewById(R.id.tv_oyuncu_puan);
        textViewBilgisayar=findViewById(R.id.tv_bilgisayar_puan);
        btnTaş=findViewById(R.id.btn_taş);
        btnKağıt=findViewById(R.id.btn_kağıt);
        btnMakas=findViewById(R.id.btn_makas);


        oyuncuPuan=0;
        bilgisayarPuan=0;



        btnTaş.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                oyna(0);




            }
        });

        btnKağıt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oyna(1);





            }
        });


        btnMakas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                oyna(2);



            }
        });



    }

    private void oyna(int oyuncuSeçim){


        int bilgisayarSeçim=(int)(Math.random()*3);



        imageViewOyuncu.setImageResource(resimler[oyuncuSeçim]);
        imageViewBilgisayar.setImageResource(resimler[bilgisayarSeçim]);


        if(oyuncuSeçim==bilgisayarSeçim){

            Toast.makeText(this, "Berabere", Toast.LENGTH_SHORT).show();


        }else if(oyuncuSeçim ==0 && bilgisayarSeçim==2 || oyuncuSeçim==1 && bilgisayarSeçim==0 || oyuncuSeçim==2 && bilgisayarSeçim==1){


            oyuncuPuan++;

            Toast.makeText(this, "Kazandınız.", Toast.LENGTH_SHORT).show();

        }
        else{

            bilgisayarPuan++;

            Toast.makeText(this, "Kaybettiniz.", Toast.LENGTH_SHORT).show();

        }


        textviewOyuncu.setText("Oyuncu:"+oyuncuPuan);
        textViewBilgisayar.setText("Bilgisayar:"+bilgisayarPuan);


    }
}