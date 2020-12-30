package com.example.yu_proje_odevi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class karadenizbolgesi extends AppCompatActivity {
    ImageButton Gdo;
    ImageButton btnyoroz;
    ImageButton btnvercenık;
    ImageButton btntorul;
    ImageButton btnpotuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karadenizbolgesi);

        Gdo=findViewById(R.id.Gdo);




        Gdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(karadenizbolgesi.this,MainActivity.class);
                startActivity(intent);

            }


        });
        btnpotuk=findViewById(R.id.btnpotuk);
//ımage  butona tıklanınca fragmeta  geçiş butonu
                btnpotuk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.Akaradeniz,new PotukFragmnet()).commit();

                    }
                });
        btnvercenık=findViewById(R.id.btnvercenık);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btnvercenık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Akaradeniz,new VerFragment()).commit();

            }
        });
        btntorul=findViewById(R.id.btntorul);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btntorul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Akaradeniz,new TorulFragmnet()).commit();

            }
        });
        btnyoroz=findViewById(R.id.btnyoroz);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btnyoroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Akaradeniz,new YorozFragmnet()).commit();

            }
        });


    }
}