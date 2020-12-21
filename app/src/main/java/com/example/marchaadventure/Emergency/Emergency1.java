package com.example.marchaadventure.Emergency;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency1 ="ALTITUDE SICKNESS";
        String emergency1_2 ="Mendaki gunung merupakan kegiatan yang menyenangkan dan menyehatkan. Berjalan menyusuri setiap tanjakan demi mencapai ketinggian puncak gunung memberikan sensasi kesenangan tersendiri bagi para pecinta hiking. Gunung-gunung dengan ketinggian beribu-ribu meter merupakan tantangan petualangan yang menyenangkan untuk ditaklukkan. Namun, tahukah anda selain menyehatkan, mendaki di ketinggian itu juga memiliki resiko penyakit berbahaya? Ancaman ini umumnya adalah penyakit ketinggian, atau dikenal dengan nama Altitude Sickness atau juga AMS (Acute Mountain Sickness)."+
                "\n\nApa itu Altitude Sickness?"+
                "\n\nAltitude Sickness adalah penyakit ketinggian yang dapat menyerang seseorang, manakala orang tersebut mendaki di atas ketinggian 2.500 mdpl dengan jangka waktu yang terlalu cepat tanpa ada proses adaptasi tubuh yang cukup. Altitude sickness terjadi karena semakin tinggi suatu dataran, tekanan atmosfer akan semakin menurun, akibatnya ketersediaan oksigen di udara menipis yang membuat paru-paru dan jantung kita bekerja sangat keras untuk mengkompensasi hal tersebut. Jika seseorang terlalu cepat naik ke ketinggian tertentu tanpa adanya proses adaptasi tubuh atau aklamasi, maka penyakit Altitude Sickness atau AMS ini dapat menyerang. Gejalanya berupa rasa mual, sakit kepala, pusing, sesak napas, sulit tidur, dan kelesuan yang hebat. Saat penyakit ini semakin parah, gejala lanjutannya dapat berupa kehilangan keseimbangan/koordinasi tubuh, perilaku irrasional, detak nadi sangat cepat, sakit kepala parah, muntah-muntah dan batuk yang terus menerus."+
                "\n\nBagaimana Cara Menanganinya?"+
                "\nJika gejala awal AMS telah menyerang, lakukanlah beberapa hal berikut ini sebagai penanganan terhadap penyakit yang sangat berbahaya ini. Pertama, jangan memaksakan tubuh untuk naik mendaki ke tempat yang lebih tinggi, beristirahatlah dulu. Minum air sebanyak- banyaknya, disarankan 4 liter sehari. Minumlah obat seperti parasetamol dan tidur. Perlu waktu 2-3 hari istirahat hingga anda telah siap untuk mendaki ke tempat yang lebih tinggi lagi dengan nyaman."+
                "\n\nJika gejala AMS telah parah, turunlah ke tempat yang lebih rendah kurang lebih 500 meter ke bawah. Cari bantuan medis secepatnya. Jika gejala yang timbul telah sangat parah, obat-obatan takkan terlalu berguna, yang dapat anda lakukan hanya turun gunung serendah mungkin hingga kondisi tubuh anda kembali membaik."+
                "\n\nBagaimana Mencegah AMS terjadi?"+
                "\nKunci agar anda terhindar dari AMS saat mendaki gunung tinggi adalah proses adaptasi dan penyesuaian diri terhadap ketinggian secara bertahap. Setiap orang memiliki kemampuan tubuh berbeda-beda dalam proses adaptasi terhadap ketinggian, sehingga tak ada tolok ukur waktu adaptasi yang harus dilakukan. Patuhilah keinginan tubuh anda, manakala anda telah nyaman dan menyesuaikan diri, barulah anda boleh mendaki kembali. Jika proses ini dilakukan dengan baik, resiko terserang AMS akan dapat anda hindari."+
                "\n\nJagalah tubuh anda agar terhidrasi dengan baik, jangan sampai anda salah mengira terkena AMS, padahal tubuh anda hanya menderita dehidrasi. Maka dari itu minumlah yang banyak untuk memenuhi kebutuhan air tubuh anda. Batasi diri anda dari minuman dengan kandungan kafein dan alkohol, karena kedua jenis minuman tersebut dapat meningkatkan dehidrasi pada tubuh."+
                "\n\nNaiklah secara bertahap dengan tidak terburu-buru. Bersemangat boleh-boleh saja, namun bukan berarti anda menjadi terburu- buru, ketenangan diperlukan untuk menjaga tubuh anda tetap sehat dan prima selam pendakian berlangsung."+
                "\n\nJika anda diburu waktu pendakian singkat, sehingga harus cepat sampai tujuan, persiapkanlah obat-obatan sebagai pembantu tubuh anda menghindari serangan AMS. Gunakan diamox selama anda mendaki cepat di ketinggian yang rentan resiko AMS. Gunakan obat ini sesuai dengan resep yang telah diberikan dokter anda.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency1);
        emer1_2.setText(emergency1_2);
    }
}