package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency4 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency4 ="HIPOTERMIA";
        String emergency4_5 ="Hipotermia adalah kondisi ketika suhu tubuh menurun drastis hingga di bawah 35oC."+
                "\n\n Ketika suhu tubuh berada jauh di bawah normal (37oC), fungsi sistem saraf dan organ tubuh lainnya akan mengalami gangguan."+
                "\n\nJika tidak segera ditangani, hipotermia dapat menyebabkan gagal jantung, gangguan sistem pernapasan, dan bahkan kematian."+
                "\n\nHipotermia terjadi ketika panas yang dihasilkan tubuh tidak sebanyak panas yang hilang. "+
                "\nHipotermia merupakan kondisi darurat yang harus segera mendapatkan penanganan"+
                "\n\nTindakan awal yang perlu dilakukan ketika bertemu dengan orang yang memiliki gejala hipotermia adalah mencari ada tidaknya denyut nadi dan pernapasan."+
                "\n\nJika denyut nadi dan pernapasan sudah berhenti, maka lakukanlah tindakan resusitasi jantung paru (CPR) dan cari bantuan medis.";

        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency4);
        emer1_2.setText(emergency4_5);
    }
}