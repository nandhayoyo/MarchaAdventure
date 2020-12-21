package com.example.marchaadventure.PerlengkapanKelompok;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;

import com.example.marchaadventure.R;


public class PerKelompok4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailperlengkapan);
        String judul="PERALATAN MASAK";
        String pribadi ="Peralatan masak yang diyakinin salah satu inti barang yang harus dibawa"+
                "\n\nKarena jika sampai ketinggalan alat ini akan terjadi kekacauan dalam suatu grup pendakian";

        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pendakikelompok);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
