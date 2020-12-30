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

public class marmarabolgesi extends AppCompatActivity {
    ImageButton geri;
    ImageButton btnavsa;
    ImageButton btnbozca;
    ImageButton btnmarmar;
    ImageButton btnulug;
    ImageButton Gdon;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marmarabolgesi);

        geri=findViewById(R.id.geridon);
        btnavsa=findViewById(R.id.btnavsa);
        btnavsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.marmaray,new avsa_fragment()).commit();
            }
        });
        btnbozca=findViewById(R.id.btnbozca);
        btnbozca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.marmaray,new bozcaad_fragment()).commit();
            }
        });
        btnmarmar=findViewById(R.id.btnmarmar);
        btnmarmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.marmaray,new marmaraadasi_fragment()).commit();
            }
        });
        btnulug=findViewById(R.id.btnulug);
        btnulug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.marmaray,new uludag_fragment()).commit();
            }
        });
      


        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(marmarabolgesi.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}