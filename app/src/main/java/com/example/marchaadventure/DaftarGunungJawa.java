package com.example.marchaadventure;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import android.view.View;

public class DaftarGunungJawa extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftargunungjawa);

        Button gede = (Button) findViewById(R.id.btnGede);
        gede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gngGede = new Intent(DaftarGunungJawa.this, GunungGede.class);
                gngGede.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(gngGede);
            }
        });

        Button cikurai = (Button) findViewById(R.id.btnCikurai);
        cikurai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gngCikurai = new Intent(DaftarGunungJawa.this, GunungCikuray.class);
                startActivity(gngCikurai);
            }
        });

        Button guntur = (Button) findViewById(R.id.btnGuntur);
        guntur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gngGuntur = new Intent(DaftarGunungJawa.this, GunungGuntur.class);
                gngGuntur.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(gngGuntur);
            }
        });

        Button salak = (Button) findViewById(R.id.btnSalak);
        salak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gngSalak = new Intent(DaftarGunungJawa.this, GunungSalak.class);
                gngSalak.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(gngSalak);
            }
        });

        Button ciremai = (Button) findViewById(R.id.btnCiremai);
        ciremai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gngCiremai = new Intent(DaftarGunungJawa.this, GunungCiremai.class);
                gngCiremai.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(gngCiremai);
            }
        });

    }
}
