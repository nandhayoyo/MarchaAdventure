package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency3 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency3 ="HEAT STROKE";
        String emergency3_4 ="Bagi Anda yang hidup di negara tropis, seperti Indonesia, tentunya sudah sangat akrab dengan cuaca panas. "+
                "\n\nApa itu Heat Stroke?"+
                "\n\nHeatstroke adalah kondisi ketika tubuh mengalami peningkatan suhu secara drastis hingga mencapai 40 derajat Celcius atau bahkan lebih"+
                "\n\nHeatstroke biasanya terjadi saat seseorang menerima paparan suhu panas dari lingkungan sekitar di luar batas toleransi tubuhnya, misalnya saat cuaca sedang sangat terik."+
                "\nSelain itu, olahraga atau aktivitas fisik berlebih juga bisa menjadi penyebab munculnya kondisi tersebut."+
                "\n\nKarena heatstroke merupakan kondisi gawat darurat yang memerlukan penanganan segera, maka penting bagi Anda untuk mengetahui tanda-tanda dari kondisi tersebut dan bagaimana cara menanganinya."+
                "\n\nJika seseorang mengalami tanda-tanda heatstroke, segera berikan pertolongan pertama guna mencegah munculnya komplikasi serius yang bisa mengancam jiwa."+
                "\n1. Pindahkan ke tempat yang lebih dingin"+
                "\n\n2. Kompres seluruh tubuh"+
                "\n\n3. Berikan minum air putih yang banyak";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency3);
        emer1_2.setText(emergency3_4);
    }
}