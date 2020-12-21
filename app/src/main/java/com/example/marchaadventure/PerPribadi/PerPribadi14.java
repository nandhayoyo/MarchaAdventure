package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi14 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="GAITERS"+
                "\n\nSelain memerlukan fisik yang tangguh, aktivitas mendaki gunung juga memerlukan peralatan yang memadai, salah satunya adalah gaiters."+
                "\nPerlengkapan pribadi ini berfungsi sebagai pelindung sepatu dan kaos kaki supaya tidak kotor terkena lumpur dan debu"+
                "\nGaiters juga bisa melindungi sepatu dari masuknya pasir, kerikil, ranting kecil, hingga mencegah gigitan hewan."+
                "\n\nSaat ini ada banyak gaiters keluaran produsen outdoor gear ternama seperti Kalibre, AVTECH, Naturehike, dan masih banyak lagi";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
