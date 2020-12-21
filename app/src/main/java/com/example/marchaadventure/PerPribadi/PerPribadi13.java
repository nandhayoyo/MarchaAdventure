package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi13 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Bagi beberapa orang, masker kain atau buff merupakan barang yang lupa mereka bawa."+
                "\n\nPadahal masker penting digunakan selama pendakian. Masker wajib dikenakan ketika kita mendaki gunung yang masih memiliki aktivitas vulkanik yang tinggi."+
                "\nHal tersebut dimaksudkan agar kita terlindung dari asam sulfatara yang dikeluarkan."+
                "\nPada musim kemarau, masker sangat berfungsi untuk melindungi kita dari debu-debu berterbangan yang cukup mengganggu perjalanan."+
                "\n\nBerbagai macam masker banyak dijual di toko ataupun di lapak pinggir jalan."+
                "\n\nPilihlah masker yang multifungsi untuk meminimalis barang bawaan. Seperti masker kain persegi atau buff. Kedua masker jenis itu juga bisa difungsikan sebagai ikat kepala dan penahan keringat.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
