package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;

public class Emergency5 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency5 ="JATUH / PINGSAN";
        String emergency5_6 ="Pingsan adalah hilangnya kesadaran sementara yang terjadi secara tiba-tiba dan sering menyebabkan orang terjatuh."+
                "\n\nKondisi yang memiliki istilah medis ‘sinkop’ ini termasuk umum terjadi dan cenderung dialami oleh orang-orang berusia 40 tahun ke bawah."+
                "\n\nPemeriksaan oleh dokter perlu dilakukan apabila seseorang mengalami pingsan setelah berusia 40 tahun, karena hal tersebut bisa mengindikasikan adanya masalah kesehatan yang serius." +
                "\n\nPingsan dapat terjadi saat seseorang duduk, berdiri, atau karena terlalu cepat bangkit berdiri. "+
                "\nKesadaran penderita akan kembali dalam waktu singkat, yaitu umumnya dalam beberapa detik. "+
                "\n\nJika ada orang yang tidak kunjung sadar setelah 1 hingga 2 menit, segera hubungi rumah sakit."+
                "\n\nSetelah tersadar, biasanya orang yang baru saja pingsan akan merasa kebingungan disertai lemas selama kurang lebih 30 menit."+
                "\nSelain itu, juga terkadang tidak bisa mengingat apa yang dilakukannya sebelum pingsan terjadi.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency5);
        emer1_2.setText(emergency5_6);
    }
}