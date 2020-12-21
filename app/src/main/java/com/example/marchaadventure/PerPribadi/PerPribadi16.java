package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi16 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Mandi adalah salahsatu kegiatan wajib untuk menjaga kesehatan tubuh"+
                "\n\nMendaki gunung adalah kegiatan yang menyita tenaga dan menguras keringat dari tubuh"+
                "\nMaka dariitu perlatan mandi wajib kamu bawa saat mendaki gunung, tidak direkomendasikan untuk membawa full perlengkapan mandi"+
                "\nCukup bawa seperlunya seperti sabun mandi, sikat gigi kecil, dan pasta gigi";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
