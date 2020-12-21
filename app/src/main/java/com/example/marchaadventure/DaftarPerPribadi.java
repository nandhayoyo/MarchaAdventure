package com.example.marchaadventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.marchaadventure.PerPribadi.PerPribadi1;
import com.example.marchaadventure.PerPribadi.PerPribadi10;
import com.example.marchaadventure.PerPribadi.PerPribadi11;
import com.example.marchaadventure.PerPribadi.PerPribadi12;
import com.example.marchaadventure.PerPribadi.PerPribadi13;
import com.example.marchaadventure.PerPribadi.PerPribadi14;
import com.example.marchaadventure.PerPribadi.PerPribadi15;
import com.example.marchaadventure.PerPribadi.PerPribadi16;
import com.example.marchaadventure.PerPribadi.PerPribadi17;
import com.example.marchaadventure.PerPribadi.PerPribadi18;
import com.example.marchaadventure.PerPribadi.PerPribadi19;
import com.example.marchaadventure.PerPribadi.PerPribadi2;
import com.example.marchaadventure.PerPribadi.PerPribadi20;
import com.example.marchaadventure.PerPribadi.PerPribadi3;
import com.example.marchaadventure.PerPribadi.PerPribadi4;
import com.example.marchaadventure.PerPribadi.PerPribadi5;
import com.example.marchaadventure.PerPribadi.PerPribadi6;
import com.example.marchaadventure.PerPribadi.PerPribadi7;
import com.example.marchaadventure.PerPribadi.PerPribadi8;
import com.example.marchaadventure.PerPribadi.PerPribadi9;


public class DaftarPerPribadi extends AppCompatActivity {
    private ListView lvItem1;
    private String[] daftarperpribadi = new String[]{
            "TAS GUNUNG / CARRIER","JAKET GUNUNG","SLEEPING BAG","MATRAS","JAS HUJAN","PAKAIAN GANTI",
            "SARUNG TANGAN DAN KAOS KAKI PENGGANTI","SENTER","TISU KERING / BASAH","MAKANAN DAN MINUMAN","OOBAT - OBATAN P3K","TRASH BAG","MASKER","GAITER",
            "AKSESORIS PAKAIAN","PERALATAN MANDI","PERALATAN MAKAN","PERALATAN NAVIGASI","PERALATAN MAKEUP","PERALATAN LAIN"};
//mendeklarasikan listview var dan menginisialasi array tipe data string
//Step 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarperlengkapan);

        lvItem1 = (ListView) findViewById(R.id.list_view1);

        //Isi ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftarperpribadi);
        lvItem1.setAdapter(adapter); lvItem1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                if (position == 0){
                    Intent pribadiint1 = new Intent(getApplicationContext(), PerPribadi1.class);
                    pribadiint1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(pribadiint1);
                }
                else if (position == 1){ Intent pribadiint2 = new
                        Intent(getApplicationContext(), PerPribadi2.class);
                        pribadiint2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(pribadiint2);
                }
                else if (position == 2){ Intent pribadiint3 = new
                        Intent(getApplicationContext(), PerPribadi3.class);
                        pribadiint3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(pribadiint3);
                }
                else if (position == 3){ Intent pribadiint4 = new
                        Intent(getApplicationContext(), PerPribadi4.class);
                        pribadiint4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(pribadiint4);
                }
                else if (position == 4){ Intent pribadiint5 = new
                        Intent(getApplicationContext(), PerPribadi5.class);
                        pribadiint5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(pribadiint5);
                }
                else if (position == 5){ Intent pribadiint6 = new
                        Intent(getApplicationContext(), PerPribadi6.class);
                        pribadiint6.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(pribadiint6);
                }
                else if (position == 6){ Intent pribadiint7 = new
                        Intent(getApplicationContext(), PerPribadi7.class);
                pribadiint7.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint7);
                }
                else if (position == 7){ Intent pribadiint8 = new
                        Intent(getApplicationContext(), PerPribadi8.class);
                pribadiint8.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint8);
                }
                else if (position == 8){ Intent pribadiint9 = new
                        Intent(getApplicationContext(), PerPribadi9.class);
                pribadiint9.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint9);
                }
                else if (position == 9){ Intent pribadiint10 = new
                        Intent(getApplicationContext(), PerPribadi10.class);
                pribadiint10.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint10);
                }
                else if (position == 10){ Intent pribadiint11 = new
                        Intent(getApplicationContext(), PerPribadi11.class);
                pribadiint11.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint11);
                }
                else if (position == 11){ Intent pribadiint12 = new
                        Intent(getApplicationContext(), PerPribadi12.class);
                pribadiint12.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint12);
                }
                else if (position == 12){ Intent pribadiint13 = new
                        Intent(getApplicationContext(), PerPribadi13.class);
                    pribadiint13.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(pribadiint13);
                }
                else if (position == 13){ Intent pribadiint14 = new
                        Intent(getApplicationContext(), PerPribadi14.class);
                pribadiint14.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(pribadiint14);
                }
                else if (position == 14){ Intent pribadiint15 = new
                        Intent(getApplicationContext(), PerPribadi15.class);
                pribadiint15.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint15);
                }
                else if (position == 15){ Intent pribadiint16 = new
                        Intent(getApplicationContext(), PerPribadi16.class);
                    pribadiint16.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(pribadiint16);
                }
                else if (position == 16){ Intent pribadiint17 = new
                        Intent(getApplicationContext(), PerPribadi17.class);
                    pribadiint17.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(pribadiint17);
                }
                else if (position == 17){ Intent pribadiint18 = new
                        Intent(getApplicationContext(), PerPribadi18.class);
                    pribadiint18.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(pribadiint18);
                }
                else if (position == 18){ Intent pribadiint19 = new
                        Intent(getApplicationContext(), PerPribadi19.class);
                    pribadiint19.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(pribadiint19);
                }
                else if (position == 19){ Intent pribadiint20 = new
                        Intent(getApplicationContext(), PerPribadi20.class);
                    pribadiint20.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(pribadiint20);
                }
            }
        });
    }
}
