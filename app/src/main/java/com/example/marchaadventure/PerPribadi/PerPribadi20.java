package com.example.marchaadventure.PerPribadi;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;


import com.example.marchaadventure.R;


public class PerPribadi20 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TAS GUNUNG/CARRIER";
        String pribadi ="Tas gunung tentunya peralatan paling utama jika kita akan melakukan pendakian. Tas gunung biasa dipanggil “Tas Carrier” atau “Carrier” saja. Tas gunung memiliki desain yang sudah disesuaikan dengan ergonomi badan manusia dan sudah disesuaikan pula khusus untuk membawa beban yang berat. Tas gunung dilengkapi dengan kantong- kantong yang banyak dan banyak tali-tali yang mengait. Tas gunung ada banyak merk dan banyak ukurannya. Tiap merk memiliki kelebihannya masing-masing. Ada yang memiliki besi di punggung bagian dalam tas supaya bisa menopang punggung manusia yang membopongnya. Adapula yang bisa dilipat, memiliki saku yang banyak, dan lain sebagainya."+
                "\n\nMerk tas gunung: The North Face, Deuter, Eiger, Karrimor, Avtech, Consina, Alpine"+
                "\nJenis berdasar ukuran: 40, 60, 80, 100 dan 120 (Liter)"+
                "\nHarga: berkisar Rp 250.000 – Rp 1juta-an tergantung merk dan ukuran"+
                "\n\nAdalah tas yang dapat menampung segala peralatan dalam jumlah yang banyak atau besar. Tas ini biasanya dipakai oleh para petualang seperti pendaki atau para traveller. Tas Carrier didesign secara khusus untuk membawa barang yang banyak dan berat dan juga membuat para pemakainya merasa nyaman pada bagian pundak dan punggungnya meski membawa barang berkilo-kilo. Tas Carrier biasanya terdapat busa yang tebal pada bagian pundak dan punggung, dan ada juga yang memakai allumunium pada bagian punggungnya agar tas dapat menempel atau melekat pada punggung si pemakai sehingga tas yang dibawa tetap stabil karena menyatu dengan punggung si pemakai."+
                "\n\nTas Carrier memiliki banyak kantong pada bagian luarnya dan ada juga tali khusus untuk menempelkan matras pada tas tersebut. Ukuran tas ini biasanya di tentukan dengan ukuran Liter, mulai dari 40 liter hingga 100 liter. Para pendaki biasanya tidak menempatkan matras pada bagian luar tas, melainkan ditempatkan pada bagian dalam sehingga dapat membentuk tas lebih rapi.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);

        TextView jdl=(TextView)findViewById(R.id.textViewJudul);
        TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
        gamb1.setBackgroundResource(R.drawable.pribadilogo);

        jdl.setText(judul); prbd.setText(pribadi);
    }
}
