package com.example.marchaadventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.marchaadventure.Emergency.Emergency1;
import com.example.marchaadventure.Emergency.Emergency2;
import com.example.marchaadventure.Emergency.Emergency3;
import com.example.marchaadventure.Emergency.Emergency4;
import com.example.marchaadventure.Emergency.Emergency5;
import com.example.marchaadventure.Emergency.Emergency6;
import com.example.marchaadventure.Emergency.Emergency7;
import com.example.marchaadventure.Emergency.Emergency8;


public class DaftarEmergency extends AppCompatActivity {
    private ListView lvItem;
    private String[] daftaremergency = new String[]{
            "ALTITUDE SICKNESS","DEHIDRASI","HEAT STROKE","HIPOTERMIA","JATUH/PINGSAN","KRAM","SAMBARAN PETIR","TERSESAT",};
//mendeklarasikan listview var dan menginisialasi array tipe data string
//Step 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftaremergency);

        lvItem = (ListView) findViewById(R.id.list_view3);
        //Isi ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,daftaremergency);
        lvItem.setAdapter(adapter); lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                if (position == 0) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency1.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 1) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency2.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 2) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency3.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 3) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency4.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 4) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency5.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 5) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency6.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 6) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency7.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
                else if (position == 7) {
                    Intent int0 = new Intent(getApplicationContext(), Emergency8.class);
                    int0.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(int0);
                }
            }
        });
    }
}

