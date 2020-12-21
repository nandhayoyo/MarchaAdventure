package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi18 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Alat navigasi memang sebuah alat yang mungkin bagi sebagian orang dianggap sepeleh."+
                "\n\nMerk tas gunung: The North Face, Deuter, Eiger, Karrimor, Avtech, Consina, Alpine"+
                "\nNamun bagi para pendaki, alat ini wajib untuk dibawa"+
                "\nTerutama jika tempat yang didaki masing asing atau bahkan jarang ‘dijamah’ manusia"+
                "\n\nTentu saja alat ini sangat penting dalam memandu pendaki. Walau sudah ada pendamping atau smartphone, namun alangkah baiknya kita mempersiapkan alat navigasi konvensional semacam kompas dan peta sebagai jaga-jaga bila tersesat.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
