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

public class guneydogubolgesi extends AppCompatActivity {

    ImageButton geri;
    ImageButton btndıyar;
    ImageButton btnurfa;
    ImageButton btnmardin;
    ImageButton btnadıyaman;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guneydogubolgesi);

        btndıyar=findViewById(R.id.btndıyar);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btndıyar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.guney,new ongozluFragment()).commit();

            }
        });

        btnurfa=findViewById(R.id.btnurfa);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnurfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.guney,new urfaFragment()).commit();

            }
        });

        btnmardin=findViewById(R.id.btnmardin);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnmardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.guney,new DayrulManastiri()).commit();

            }
        });

        btnadıyaman=findViewById(R.id.btnadıyaman);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnadıyaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.guney,new nemrutFragment()).commit();

            }
        });

        geri=findViewById(R.id.geridon);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(guneydogubolgesi.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}