package com.example.yu_proje_odevi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class MainActivity extends AppCompatActivity {
    TextView akdenizb;
    TextView karadenizb;
    TextView egeb;
    TextView guneydogub;
    TextView doguanadolub;
    TextView marmarab;
    TextView icanadolub;
    ImageButton akdeniz;
    ImageButton karadeniz;
    ImageButton ege;
    ImageButton guneydogu;
    ImageButton doguanadolu;
    ImageButton marmara;
    ImageButton icanadolu;
    ImageButton travel;
    private TextView tvToken;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        akdenizb=findViewById(R.id.akdenizb);
        karadenizb=findViewById(R.id.karadenizb);
        egeb=findViewById(R.id.egeb);
        guneydogub=findViewById(R.id.guneydoguanadolub);
        doguanadolub=findViewById(R.id.doguanadolub);
        marmarab=findViewById(R.id.marmarab);
        icanadolub=findViewById(R.id.icanadolub);


        akdeniz=findViewById(R.id.akdeniz);
        travel=findViewById(R.id.travel);
        karadeniz=findViewById(R.id.karadeniz);
        ege=findViewById(R.id.ege);
        guneydogu=findViewById(R.id.guneydoguanadolu);
        doguanadolu=findViewById(R.id.doguanadolu);
        marmara=findViewById(R.id.marmara);
        icanadolu=findViewById(R.id.icanadolu);





// Image Button'a tıklandıgında yeni  bir activity sayfasına yönlendirisin
        guneydogu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,guneydogubolgesi.class);
                startActivity(intent);

            }
        });

        icanadolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,icanadolu.class);
                startActivity(intent);

            }
        });



        marmara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,marmarabolgesi.class);
                startActivity(intent);

            }
        });

        doguanadolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,doguanadolubolgesi.class);
                startActivity(intent);

            }
        });

        karadeniz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,karadenizbolgesi.class);
                startActivity(intent);

            }
        });

        ege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,egebolgesi.class);
                startActivity(intent);

            }
        });



        akdeniz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this,akdenizbolgesi.class);
                startActivity(intent);



            }
        });
// activitye geri donme fonksiyonu
       /* mersinFragment fragment =new mersinFragment();
        FragmentManager mg=getSupportFragmentManager();
        mg.beginTransaction().add(R.id.anasayfa1,fragment).commit();



        */
        /*
        Push kit token alıp ekrana yazdırsın
         */
        tvToken = findViewById(R.id.tv_log);
        MyReceiver receiver = new MyReceiver();
        IntentFilter filter=new IntentFilter();
        filter.addAction("com.example.yu_proje_odevi.ON_NEW_TOKEN");
        MainActivity.this.registerReceiver(receiver,filter);
    }

    public class MyReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("com.example.yu_proje_odevi.ON_NEW_TOKEN".equals(intent.getAction())) {
                String token = intent.getStringExtra("token");

            }
        }
    }





    }
