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

public class icanadolu extends AppCompatActivity {

    ImageButton geri;
    ImageButton btnnevsehir;
    ImageButton btnankara;
    ImageButton btnsivas;
    ImageButton btncorum;
    ImageButton Gdon;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icanadolu);
        btnnevsehir=findViewById(R.id.btnevsehir);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnnevsehir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.icanadolu,new kapadokya_frag()).commit();

            }
        });
        btnankara=findViewById(R.id.btnankara);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnankara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.icanadolu,new anitkabir_fragment()).commit();

            }
        });
        btncorum=findViewById(R.id.btncorum);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btncorum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.icanadolu,new alaca_fragment()).commit();

            }
        });
        btnsivas=findViewById(R.id.btnsivas);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnsivas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.icanadolu,new divrigi_fragment()).commit();

            }
        });

        geri=findViewById(R.id.geridon);



        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(icanadolu.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}