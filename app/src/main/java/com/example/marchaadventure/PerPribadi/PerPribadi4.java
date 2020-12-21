package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailperlengkapan);
        String judul="MATRAS";
        String pribadi="Matras dibentang dalam tenda sebagai alas tidur pengganti tikar"+
                "\n\nDengan matras, tubuh tidak langsung menempel di lantai tenda yang begitu tipis"+
                "\n Tanpa matras, suhu dingin dari tanah bisa langsung menusuk tubuh."+
                "\nApalagi dalam keadaan hujan, matras jadi pelindung dari rembesan air tanah";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
