package com.example.yu_proje_odevi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class akdenizbolgesi extends AppCompatActivity {
    ImageButton BtnIsparta;
    ImageButton BtnBurdur;
    ImageButton btnMersin;
    ImageButton Btnantalya;
    ImageButton Gdon;
    ImageButton geri;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akdenizbolgesi);
        HwAds.init(this);

        BannerView bottomBannerView = findViewById(R.id.hw_banner_view);
        AdParam adParam = new AdParam.Builder().build();
        bottomBannerView.loadAd(adParam);

        // Call new BannerView(Context context) to create a BannerView class.
        BannerView topBannerView = new BannerView(this);
        topBannerView.setAdId("testw6vs28auh3");
        topBannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        topBannerView.loadAd(adParam);

        RelativeLayout rootView = findViewById(R.id.Aanasayfa);
        rootView.addView(topBannerView);

        btnMersin=findViewById(R.id.btnMersin);
// ımage  butona tıklanınca fragmeta  geçiş butonu
        btnMersin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.Aanasayfa,new mersinFragment()).commit();

            }
        });
// bir onceki sayfaya dondurme işlemi
        geri=findViewById(R.id.geridon);
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(akdenizbolgesi.this,MainActivity.class);
                startActivity(intent);

            }
        });
        //
        BtnIsparta=findViewById(R.id.BtnIsparta);
        BtnIsparta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aanasayfa,new IspartaFragment()).commit();
            }
        });

        BtnBurdur=findViewById(R.id.BtnBurdur);
        BtnBurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aanasayfa,new BurdurFragmnet()).commit();
            }
        });


        Btnantalya=findViewById(R.id.Btnantalya);
        Btnantalya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.Aanasayfa,new AntalyaFragment()).commit();
            }
        });








    }
}