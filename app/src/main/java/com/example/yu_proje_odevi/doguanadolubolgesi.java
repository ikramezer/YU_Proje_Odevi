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

public class doguanadolubolgesi extends AppCompatActivity {


    ImageButton btngır;
    ImageButton btnakdamar;
    ImageButton btnorduzu;
    ImageButton btnharput;
    ImageButton Gdon;
    ImageButton geri;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doguanadolubolgesi);

        geri=findViewById(R.id.geridon2);

        btngır=findViewById(R.id.btngır);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btngır.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.doguu,new girlevikFragment()).commit();

            }
        });
        btnakdamar=findViewById(R.id.btnakdamar);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnakdamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.doguu,new akdamarFragment()).commit();

            }
        });
        btnharput=findViewById(R.id.btnharput);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnharput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.doguu,new harputFragment()).commit();

            }
        });
        btnorduzu=findViewById(R.id.btnorduzu);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnorduzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.doguu,new orduzuFragment()).commit();

            }
        });



        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(doguanadolubolgesi.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}