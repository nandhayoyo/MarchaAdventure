package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi8 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailperlengkapan);
        String judul="SENTER";
        String pribadi="Tanpa senter, pendaki akan kesulitan berjalan di malam hari."+
                "\n\nSehingga, senter merupakan peralatan wajib yang harus dibawa, agar tidak merepotkan teman seperjalanan.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
