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

public class egebolgesi extends AppCompatActivity {

    TextView bilgi;
    ScrollView scrollView;
    ImageButton Gdon5;
    ImageButton btngelibolu;
    ImageButton btnurla;
    ImageButton btnefes;
    ImageButton btncesme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egebolgesi);



        Gdon5=findViewById(R.id.Gdon5);
        Gdon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(egebolgesi.this,MainActivity.class);
                startActivity(intent);

            }
        });

        btngelibolu=findViewById(R.id.btngelibolu);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btngelibolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aege,new GeliboluFragment()).commit();

            }
        });
        btnurla=findViewById(R.id.btnurla);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btnurla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aege,new UrlaFragmnet()).commit();

            }
        });

        btnefes=findViewById(R.id.btnefes);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btnefes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aege,new EfesFragment()).commit();

            }
        });
        btncesme=findViewById(R.id.btncesme);
//ımage  butona tıklanınca fragmeta  geçiş butonu
        btncesme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aege,new CesmeFragmnet()).commit();

            }
        });
    }
}