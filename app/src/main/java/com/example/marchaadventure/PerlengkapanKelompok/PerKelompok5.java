package com.example.marchaadventure.PerlengkapanKelompok;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;

import com.example.marchaadventure.R;


public class PerKelompok5 extends Activity { @Override



protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_detailperlengkapan); String judul="TENDA DOME";
    String pribadi ="Tenda adalah peralatan kelompok yang wajib dibawa. Tenda untuk pendakian gunung ada banyak sekali macam- macamnya. Dari merk yang bagus hingga medium. Dan ukurannya juga bervariasi."+
            "\n\nMerk : Eiger, Bestway, Lafuma, Montana, Rei, dll"+ "\nKapasitas : 2 orang, 4 orang, 6 orang, dst"+
            "\n\nManusia mulai mengenal Tenda setidaknya sejak Jaman Besi, Tenda tradisional telah digunakan oleh orang-orang di beberapa belahan dunia, seperti penduduk asli Amerika, Mongolia, Turki dan Nomad Tibet serta Badui. Kebanyakan Tenda tradisional menggunakan bahan dari kulit hewan, Seperti yang digunakan oleh Tentara Romawi dimasa lampau yang mana desain dari tenda itu akan menjadi cikal bakal dari Tenda Modern. Jika anda tidak percaya cobalah mengetikan keta “Sewa Tenda Romawi” pada beberapa search engine, Anda akan menemukan cukup banyak penyedia Jasa Sewa Tenda Romawi Yang tentunya tidak lagi berbahan kulit, hanya desainnya saja." +
            "\n\nTenda tradisonal banyak digunakan oleh para pengelana dan para peternak kambing atau domba yang tempat tinggalnya jauh dari padang rumput. Beberapa rumah tradisonal Di Indonesia juga ada yang terlihat menyerupai Tenda tradisonal, Namun itu hanya desain yang terlihat mirip saja, Namanya juga rumah yang pembuatannya permanen atau semi permanen, walaupun bisa diangkat dan di pindah-pindah tetapi mengangkatnya diperlukan bantuan beberapa orang, Sementara yang dinamakan Tenda itu pembuatannya tidak permanen dan mudah untuk di bawa-bawa apalagi di pindah.";
    ImageView gamb1 = (ImageView)findViewById(R.id.gambar1); TextView jdl=(TextView)findViewById(R.id.textViewJudul);
    TextView prbd=(TextView)findViewById(R.id.textViewPerlengkapan);
    gamb1.setBackgroundResource(R.drawable.pendakikelompok);

    jdl.setText(judul); prbd.setText(pribadi);
}
}
