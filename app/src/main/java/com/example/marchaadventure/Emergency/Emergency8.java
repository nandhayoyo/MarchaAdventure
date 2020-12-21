package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency8 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency8 ="TERSESAT";
        String emergency8_9 ="Berkegiatan di alam bebas memang sangat menyenangkan, apalagi alam menyajikan berbagai pemandangan yang asri dan indah. Sayangnya tak semua kegiatan alam berakhir indah. Banyak sekali kasus tersesatnya pendaki dan penggiat alam saat bertualang di gunung"+
                "\n\nLalu, apa sajakah yang wajib dipersiapkan oleh seorang penggiat alam agar tidak tersesat di gunung dan alam bebas? Berikut ini tips simpelnya!"+
                "\n\n1. Memahami simbol-simbol tertentu"+
                "\n\nSebelum terjun ke alam ada beberapa simbol yang perlu diperhatikan oleh seorang penggiat alam agar tidak tersesat, Kamu harus memperhatikan simbol-simbol sepele tersebut."+
                "\n2. Selalu berjalan di area dengan bekas jejak kaki manusia"+
                "\n\nAgar tidak tersesat di gunung atau alam bebas lebih baik perhatikan jalan dengan benar, sebisa mungkin hindari jalan yang masih tertutup rumput dan pepohonan. Ikuti jalan dengan bekas jejak kaki manusia, dipastikan Kamu tidak akan tersesat saat bertualang di alam bebas."+
                "\n\n3. Jika itu pengalaman pertama, usahakan membawa guide atau selalu berjalan bersamaan dengan rombongan"+
                "\nJika Kamu baru pertama mendaki gunung, agar lebih aman, lebih baik membawa guide atau pemandu saat bertualang ke alam bebas. Pemandu biasanya hafal track yang akan dilewati termasuk jalan pintasnya."+
                "\n\n4. Pelajari jalur terlebih dahulu."+
                "\n\nJika memang tidak ada uang untuk menyewa jasa guide alangkah baiknya Kamu mempelajari jalur pendakiannya terlebih dahulu, minimal tanya ke teman atau membaca peta sehingga tidak ada kata ‘tersesat’ saat mendaki gunung atau bertualang ke alam bebas."+
                "\n\n5. Wajib patuhi aturan!"+
                "\n\nSetiap tempat pasti memilik rambu-rambu dan aturan tersendiri. Jika ingin selamat dan sampai di tempat tujuan dengan mudah alangkah baiknya mematuhi aturan yang dipaparkan oleh pengelola. Baca juga plang-plang yang disediakan sehingga tidak ada kata ‘tersesat’ dalam perjalanan.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency8);
        emer1_2.setText(emergency8_9);
    }
}
