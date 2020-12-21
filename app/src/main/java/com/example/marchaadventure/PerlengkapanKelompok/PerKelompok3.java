package com.example.marchaadventure.PerlengkapanKelompok;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;

import com.example.marchaadventure.R;


public class PerKelompok3 extends Activity { @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detailperlengkapan);
    String judul="PERALATAN KOMUNIKASI";
    String pribadi ="Alat komunikasi juga berperan penting untuk menjaga antar pendaki"+
            "\n\nKarena kemungkinan terjadi adalah pembagian grup dalam suatu regu"+
            "\n\nAda yang berjalan menyusuri track pendakian terlebih dahulu yang terdiri dari 3-4 orang dan sisanya menunggu komando yang diberikan oleh grup yang pertama";

    ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
    TextView jdl=(TextView)findViewById(R.id.textViewJudul);
    TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
    gamb1.setBackgroundResource(R.drawable.pendakikelompok);

    jdl.setText(judul); prbd.setText(pribadi);
}
}