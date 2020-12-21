package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency2 ="DEHIDRASI";
        String emergency2_3 ="Dehidrasi adalah kondisi ketika tubuh kehilangan lebih banyak cairan daripada yang didapatkan, sehingga keseimbangan zat gula dan garam menjadi terganggu, akibatnya tubuh tidak dapat berfungsi secara normal."+
                "\n\nKandungan air di dalam tubuh manusia yang sehat adalah lebih dari 60% total berat badan. "+
                "\n\nKandungan air yang ideal di dalam tubuh berfungsi untuk membantu kerja sistem pencernaan, mengeluarkan kotoran dan racun dari dalam tubuh, sebagai pelumas dan bantalan untuk persendian, melembapkan jaringan-jaringan pada telinga, tenggorokan, dan juga hidung, serta sebagai media transportasi nutrisi untuk sel-sel tubuh dan menjaga kulit tetap sehat."+
                "\n\nDehidrasi terkadang dianggap sebagai permasalahan kondisi tubuh yang tidak perlu ditangani secara serius, dan kebanyakan anak-anak dan remaja menganggapnya sebagai haus biasa. "+
                "\nNamun, jika gejala awal dehidrasi tidak ditangani dengan baik, dapat mengganggu fungsi tubuh. "+
                "\n\nJika merasa mengalami dehidrasi, minumlah banyak cairan"+
                "\n\nAnda bisa minum air putih atau jus buah yang diencerkan."+
                "\nUsahakan untuk menghindari minuman yang mengandung kafein dan minuman bersoda."+
                "\n\nJika tidak tertangani, dehidrasi bisa menyebabkan kejang, kerusakan otak, dan bahkan kematian.";

        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency2);
        emer1_2.setText(emergency2_3);
    }
}