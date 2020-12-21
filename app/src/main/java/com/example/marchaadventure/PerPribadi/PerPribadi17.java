package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi17 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Peralatan makan dan minum wajib kamu bawa jika kamu ingin memasak di gunung."+
                "\n\nlat makan tersebut antara lain piring, gelas, sendok, pisau kecil, kompor gas kecil, nesting, dan lain sebagainya."+

                "\nNamun, jika sekiranya kamu tidak perlu memasak makanan di gunung, barang-barang ini juga tidak perlu dibawa karena lumayan memperberat barang bawaan";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
