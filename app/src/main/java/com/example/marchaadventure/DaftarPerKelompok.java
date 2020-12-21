package com.example.marchaadventure;

import android.content.Intent; import android.os.Bundle;
import android.support.v7.app.AppCompatActivity; import android.view.View;
import android.widget.AdapterView; import android.widget.ArrayAdapter; import android.widget.ListView;

import com.example.marchaadventure.PerlengkapanKelompok.PerKelompok1;
import com.example.marchaadventure.PerlengkapanKelompok.PerKelompok2;
import com.example.marchaadventure.PerlengkapanKelompok.PerKelompok3;
import com.example.marchaadventure.PerlengkapanKelompok.PerKelompok4;
import com.example.marchaadventure.PerlengkapanKelompok.PerKelompok5;


public class DaftarPerKelompok extends AppCompatActivity {

    private ListView lvItem2;
    private String[] daftarperkelompok = new String[]{ "TENDA DOME","LOGISTIK/MAKANAN","P3K",
            "PERALATAN KOMUNIKASI","PERALATAN MEMASAK"};
//mendeklarasikan listview var dan menginisialasi array tipe data string
//Step 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarperlengkapan);


        lvItem2 = (ListView) findViewById(R.id.list_view1);

        //Isi ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftarperkelompok);
        lvItem2.setAdapter(adapter); lvItem2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                if (position == 0) {
                    Intent int0 = new Intent(getApplicationContext(), PerKelompok1.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 1) {
                    Intent int0 = new Intent(getApplicationContext(), PerKelompok2.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 2) {
                    Intent int0 = new Intent(getApplicationContext(), PerKelompok3.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 3) {
                    Intent int0 = new Intent(getApplicationContext(), PerKelompok4.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 4) {
                    Intent int0 = new Intent(getApplicationContext(), PerKelompok5.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
            }
        });
    }
}
