package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi6 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailperlengkapan);
        String judul="PAKAIAN GANTI";
        String pribadi="Mendaki gunung adalah aktivitas yang menguras keringat"+
                "\n\nNamun suhu yang dingin membuat tubuh cepat menyerap keringat."+
                "\nTapi, tetap saja baju yang terpapar keringat dapat memicu tubuh terkena jamur, bila tak kunjung diganti."+
                "\nApalagi bagi yang bau badan, tidak mengganti pakaian dapat mengganggu teman seperjalanan.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}