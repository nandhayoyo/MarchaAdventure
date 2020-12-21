package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailperlengkapan);
        String judul="JAKET";
        String pribadi ="Jaket adalah hal wajib yang harus dipunyai para pendaki."+
                "\n\nNamun bukan sekadar jaket biasa atau jaket yang dipakai sehari-hari melainkan jaket khusus yang tahan angin dan suhu dingin."+
                "\nSeperti halnya tas gunung, jaket gunung juga memiliki merk dan kelebihan masing-masing."+
                "\nAda yang tahan angin saja, ada pula yang tahan angin dan air."+
                "\n\nMerk: EIGER, NORDWAND, DEUTER,KARRIMOR, CONSINA"+
                "\n\nHarga: Rp 130.000 – Rp 1jt-an";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
