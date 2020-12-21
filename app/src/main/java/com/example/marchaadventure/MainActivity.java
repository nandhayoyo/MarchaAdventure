package com.example.marchaadventure;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static long back_pressed;
    private Toast toast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);

//untuk menset default theme

        setContentView(R.layout.activity_main);

        Button gunung = (Button) findViewById(R.id.buttonGunung);
        gunung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gunungIntent = new Intent(MainActivity.this, DaftarGunungJawa.class);
                gunungIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(gunungIntent);
            }
        });

        Button perlengkapan = (Button) findViewById(R.id.buttonPerlengkapan);
        perlengkapan.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            Intent perlengkapanIntent = new Intent(MainActivity.this, Perlengkapan.class);

            perlengkapanIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(perlengkapanIntent);
        }
        });

        Button logistik = (Button) findViewById(R.id.buttonLogistik); logistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logistikIntent = new Intent(MainActivity.this, Logistik.class);
                logistikIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(logistikIntent);
            }
        });

        Button emergency = (Button) findViewById(R.id.buttonEmergency); emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emergencyIntent = new Intent(MainActivity.this, DaftarEmergency.class);

                emergencyIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(emergencyIntent);
            }
        });

        Button survival = (Button) findViewById(R.id.buttonSurvival); survival.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent survivalIntent = new Intent(MainActivity.this, Survival.class);
                survivalIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(survivalIntent);
            }
        });

        Button tentang = (Button) findViewById(R.id.buttonTentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tentangIntent = new Intent(MainActivity.this, Tentang.class);
                tentangIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(tentangIntent);
            }
        });
    }

    public void onBackPressed() {
        BackButtonHandler(); return;
    }

    private void BackButtonHandler() { AlertDialog.Builder dialog = new
            AlertDialog.Builder(MainActivity.this); dialog.setTitle("Konfirmasi"); dialog.setMessage("Apakah anda yakin ingin keluar?");

        dialog.setIcon(R.drawable.logo); dialog.setPositiveButton("Ya", new
                DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) { MainActivity.this.finish();
                    }
                });
        dialog.setNegativeButton("Tidak",



                new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) { dialog.cancel();
                    }
                });
        dialog.show();
    }
}
