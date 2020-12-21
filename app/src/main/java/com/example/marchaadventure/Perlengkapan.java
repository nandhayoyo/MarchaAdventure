package com.example.marchaadventure;

import android.content.Intent; import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity; import android.view.View;
import android.widget.ImageButton;


public class Perlengkapan extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) { super.onCreate(savedInstanceState); setTheme(R.style.AppTheme);
//untuk menset default theme
        setContentView(R.layout.activity_perlengkapan);

        ImageButton pribadi = (ImageButton) findViewById(R.id.buttonPribadi);
        pribadi.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            Intent pribadi = new Intent(Perlengkapan.this, DaftarPerPribadi.class);
            pribadi.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(pribadi);
        }
        });

        ImageButton kelompok = (ImageButton) findViewById(R.id.buttonKelompok);
        kelompok.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            Intent kelompok = new Intent(Perlengkapan.this, DaftarPerKelompok.class);
            kelompok.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(kelompok);
        }
        });
    }
}
