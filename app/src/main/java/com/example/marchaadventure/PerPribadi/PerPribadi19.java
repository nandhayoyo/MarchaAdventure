package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi19 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Siapa bilang wanita yang suka mendaki gunung tak peduli akan penampilan?" +
                "\n\nBeberapa wanita mengatakan, sebagai wanita justru harus menjaga kecantikan diri di manapun berada."+
                "\nPeralatan seperti pelembab wajah, handbody, dan berbagai peralatan kecantikan lainnya terkadang dibawa"+
                "\nKegiatan mendaki gunung akan membuat berkeringat membuat wajah harus mengganti makeup yang waterproof atau tahan air";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
