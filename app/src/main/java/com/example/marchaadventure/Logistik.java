package com.example.marchaadventure;

import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
public class Logistik extends Activity { @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_logistik);
    String logistik1 ="1. Nasi";
    String logistik1_2 ="Terdapat banyak sekali manfaat bagi tubuh kita karena mengkonsumsi nasi. Nasi merupakan sumber energi, tak heran banyak penduduk dunia makanan pokonya adalah nasi. Kandungan karbohidrat dan kalori pada nasi adalah sumber tenaga yang tidak tergantikan.";
    ImageView gamb1 = (ImageView)findViewById(R.id.gambar1); TextView log1 =(TextView)findViewById(R.id.textViewLog1); TextView log1_2 =(TextView)findViewById(R.id.textViewLog1_2); gamb1.setBackgroundResource(R.drawable.logistik1); log1.setText(logistik1);
    log1_2.setText(logistik1_2);

    String logistik2 ="2. Roti";
    String logistik2_2 ="Roti juga merupakan makanan yang wajib dibawa untuk para pendaki. Selain praktis dibawa roti juga tidak begitu menambah beban berat pada tas yang hendak dibawa. Tingginya serat dalam roti juga sangat baik untuk sistem pencernaan. Penelitian menunjukkan bahwa roti bisa memberikan lebih banyak energi, karbohidrat, kalsium, protein, fosfor, dan besi dibandingkan dengan nasi putih.";
    ImageView gamb2 = (ImageView)findViewById(R.id.gambar2); TextView log2 =(TextView)findViewById(R.id.textViewLog2); TextView log2_2 =(TextView)findViewById(R.id.textViewLog2_2); gamb2.setBackgroundResource(R.drawable.logistik2); log2.setText(logistik2);
    log2_2.setText(logistik2_2);

    String logistik3 ="3. Mie Instan";
    String logistik3_2 ="Selain simpel dan praktis mie instan juga menjadi makanan favorit pendaki ketika menikmati udara dingin dikala sedang didalam tenda. Tetapi lebih baik kurangi mengkonsumsi mie instan saat pendakian, dikarenakan jika berlebihan akan berdampak kurang baik pada tubuh.";
    ImageView gamb3 = (ImageView)findViewById(R.id.gambar3); TextView log3 =(TextView)findViewById(R.id.textViewLog3); TextView log3_2 =(TextView)findViewById(R.id.textViewLog3_2);

    gamb3.setBackgroundResource(R.drawable.logistik3); log3.setText(logistik3);
    log3_2.setText(logistik3_2);

    String logistik4 ="4. Cokelat";
    String logistik4_2 ="Ketika akan mendaki coklat ikut andil peran dalam memberikan semangat yang hilang dikarenakan lelah setelah melewati medan yang cukup lumayan menguras tenaga. Rasa manis pada coklat dapat memulihkan tenaga yang hilang dengat cepat.";
    ImageView gamb4 = (ImageView)findViewById(R.id.gambar4); TextView log4 =(TextView)findViewById(R.id.textViewLog4); TextView log4_2 =(TextView)findViewById(R.id.textViewLog4_2); gamb4.setBackgroundResource(R.drawable.logistik4); log4.setText(logistik4);
    log4_2.setText(logistik4_2);

    String logistik5 ="5. Buah-Buahan";
    String logistik5_2 ="Buah yang segar dan bermanfaat bagi tubuh seperti apel, pir, pisang dll dapat menambah stamina dan asupan gizi pada tubuh. Buah yang sering saya bawa saat mendaki gunung adalah pisang, karena menurut penelitian pisang dapat menambah energi pada tubuh.";
    ImageView gamb5 = (ImageView)findViewById(R.id.gambar5); TextView log5 =(TextView)findViewById(R.id.textViewLog5); TextView log5_2 =(TextView)findViewById(R.id.textViewLog5_2); gamb5.setBackgroundResource(R.drawable.logistik5); log5.setText(logistik5);
    log5_2.setText(logistik5_2);

    String logistik6 ="6. Nugget, Telur, Sosis";
    String logistik6_2 ="Untuk menambah rasa nikmat nasi pasangan yang cocok untuk lauk pauknya adalah Nugget, Telur, Sosis, karena makanan tersebut dapat dengan mudah kita beli di supermatket tanpa harus repot membuat lauk pauk yang cocok untuk mendampingi nasi ketika mendaki gunug.";
    ImageView gamb6 = (ImageView)findViewById(R.id.gambar6); TextView log6 =(TextView)findViewById(R.id.textViewLog6); TextView log6_2 =(TextView)findViewById(R.id.textViewLog6_2); gamb6.setBackgroundResource(R.drawable.logistik6); log6.setText(logistik6);
    log6_2.setText(logistik6_2);

    String logistik7 ="7. Sarden";
    String logistik7_2 ="Ikan Sarden adalah ikan kecil, dan tergolong kedalam kelompok ikan berminyak, termasuk ke dalam keluarga ikan yang disebut Clupeidae. Sarden umumnya dikenal sebagai ikan kaleng, dan memang banyak dipasarkan sebagai ikan sarden kalengan. Meskipun sarden dianggap sebagai satu spesies, sebenarnya ada 21 jenis ikan yang bisa dikategorikan sebagai ikan sarden.";
    ImageView gamb7 = (ImageView)findViewById(R.id.gambar7); TextView log7 =(TextView)findViewById(R.id.textViewLog7); TextView log7_2 =(TextView)findViewById(R.id.textViewLog7_2); gamb7.setBackgroundResource(R.drawable.logistik7); log7.setText(logistik7);
    log7_2.setText(logistik7_2);

    String logistik8 ="8. Kopi";
    String logistik8_2 ="Kopi instan memang merupakan pilihan yang lebih nyaman sekaligus enak bagi para penikmat kafein. Selain karena harganya yang lebih murah dibandingkan dengan kopi yang ditumbuk langsung dari biji kopinya, juga lantaran kemudahan dalam membuat dan mempersiapkannya. Meski begitu, Anda sebaiknya tidak terlalu tergantung pada kopi instan.";
    ImageView gamb8 = (ImageView)findViewById(R.id.gambar8); TextView log8 =(TextView)findViewById(R.id.textViewLog8); TextView log8_2 =(TextView)findViewById(R.id.textViewLog8_2); gamb8.setBackgroundResource(R.drawable.logistik8); log8.setText(logistik8);
    log8_2.setText(logistik8_2);

    String logistik9 ="9. Susu";
    String logistik9_2 ="Susu sangat baik bagi kesehatan, sering mengkonsumsi susu disaat masih remaja baik untuk masa tua, Kebiasaan sehat minum susu bisa memiliki efek jangka panjang terhadap pengurangan risiko seorang perempuan terkena diabetes. Remaja putri yang rajin minum susu diketahui bermanfaat mengurangi risiko terkena penyakit diabetes.";
    ImageView gamb9 = (ImageView)findViewById(R.id.gambar9); TextView log9 =(TextView)findViewById(R.id.textViewLog9); TextView log9_2 =(TextView)findViewById(R.id.textViewLog9_2); gamb9.setBackgroundResource(R.drawable.logistik9); log9.setText(logistik9);
    log9_2.setText(logistik9_2);

    String logistik10 ="10. Madu";
    String logistik10_2 ="Bila rajin mengonsumsi madu, seseorang dapat merasakan khasiatnya bagi tubuh. Selain dapat dijadikan pemanis alami makanan, madu juga bisa digunakan untuk kecantikan. Sebab, madu kaya kandungan antioksidan dan vitamin C, yang baik bagi tubuh, dilihat dari segi kesehatan maupun kecantikan.";
    ImageView gamb10 = (ImageView)findViewById(R.id.gambar10); TextView log10 =(TextView)findViewById(R.id.textViewLog10); TextView log10_2



            =(TextView)findViewById(R.id.textViewLog10_2); gamb10.setBackgroundResource(R.drawable.logistik10); log10.setText(logistik10); log10_2.setText(logistik10_2);

    String logistik11 ="11. Tolak Angin";
    String logistik11_2 ="Tolak Angin dikemas dalam bentuk sachet yang sangat mudah ditemukan dan praktis dibawa kemana saja. Jamu ini termasuk jenis obat yang bisa diminum tanpa membutuhkan resep dari dokter. Bahan – bahan yang digunakan terdiri dari enam macam rempah- rempah utama yaitu biji adas, kayu ules, jahe, daun cengkeh, daun mint, madu, dan beberapa bahan lain. Obat ini berbentuk cairan coklat bening dan sama sekali tidak mengandung ekstrak bubuk karena bagian rempah yang diambil sebagai bahan hanya berupa zat aktif saja.";
    ImageView gamb11 = (ImageView)findViewById(R.id.gambar11); TextView log11 =(TextView)findViewById(R.id.textViewLog11); TextView log11_2
            =(TextView)findViewById(R.id.textViewLog11_2); gamb11.setBackgroundResource(R.drawable.logistik11); log11.setText(logistik11); log11_2.setText(logistik11_2);

    String logistik12 ="12. Telur";
    String logistik12_2 ="Telur dapat kita jadikan cara termudah, termurah, dan paling serbaguna, untuk mendapatkan asupan protein. Telur juga mengandung asam amino, antioksidan, dan zat besi. Tapi apakah Anda mengetahui lima manfaat yang diberikan telur bagi tubuh kita?";
    ImageView gamb12 = (ImageView)findViewById(R.id.gambar12); TextView log12 =(TextView)findViewById(R.id.textViewLog12); TextView log12_2
            =(TextView)findViewById(R.id.textViewLog12_2); gamb12.setBackgroundResource(R.drawable.logistik12); log12.setText(logistik12); log12_2.setText(logistik12_2);

    String logistik13 ="13. Gula Jawa";
    String logistik13_2 ="Gula jawa, atau beberapa orang menyebutnya dengan sebutan gula merah karena memang memiliki warna merah agak kecoklatan. Sebutan gula jawa sendiri berasal dari sejarah gula ini yang konon katanya ditemukan pertama kali oleh orang jawa, sehingga dikenal dengan sebutan gula jawa. Gula jawa biasanya digunakan sebagai bumbu pelengkap masakan agar masakan memiliki rasa yang manis dan lebih nikmat. Selain memiliki rasa yang manis dan melezatkan makanan, gula jawa juga mengandung beberapa zat di dalamnya yang dapat memberikan manfaat yang baik untuk kesehatan.";
    ImageView gamb13 = (ImageView)findViewById(R.id.gambar13);



    TextView log13 =(TextView)findViewById(R.id.textViewLog13); TextView log13_2
            =(TextView)findViewById(R.id.textViewLog13_2); gamb13.setBackgroundResource(R.drawable.logistik13); log13.setText(logistik13); log13_2.setText(logistik13_2);

    String logistik14 ="14. Gula Pasir";
    String logistik14_2 ="Gula pasir merupakan bahan baku masakan yang terbuat dari sari tebu dan dikristalkan membentuk serbuk-serbuk seperti pasir. Berbeda dengan gula halus, gula pasir mempunyai butiran- butiran yang lebih kasar. Gula pasir memiliki rasa yang manis dan mudah larut dalam air terutama air panas. Gula pasir umumnya berwarna putih kekuningan atau sedikit coklat. Gula pasir didapatkan dari ekstraksi sari tebu yang dikristalkan. Gula pasir tidak mempunyai aroma tetapi berbau harum ketika diolah menjad karamel.";
    ImageView gamb14 = (ImageView)findViewById(R.id.gambar14); TextView log14 =(TextView)findViewById(R.id.textViewLog14); TextView log14_2
            =(TextView)findViewById(R.id.textViewLog14_2); gamb14.setBackgroundResource(R.drawable.logistik14); log14.setText(logistik14); log14_2.setText(logistik14_2);

    String logistik15 ="15. Teh Celup";
    String logistik15_2 ="Apabila Anda adalah seorang penikmat teh seperti ribuan orang lainnya di seluruh dunia, dan Anda meminum teh setiap harinya, pernahkah terlintas dalam pikiran Anda mengenai: apa yang bisa dilakukan dengan kantong teh yang sudah dipakai? Masih bisakah kantong-kantong tersebut digunakan untuk hal lain? Jawabannya adalah iya. Kantong-kantong tersebut masih punya fungsi lain setelah Anda menggunakannya untuk membuat secangkir teh. Sebenarnya, banyak yang bisa dilakukan atau didapatkan dengan menggunakan kantong teh yang sudah diapakai.";
    ImageView gamb15 = (ImageView)findViewById(R.id.gambar15); TextView log15 =(TextView)findViewById(R.id.textViewLog15); TextView log15_2
            =(TextView)findViewById(R.id.textViewLog15_2); gamb15.setBackgroundResource(R.drawable.logistik15); log15.setText(logistik15); log15_2.setText(logistik15_2);

    String logistik16 ="16. Minyak Goreng";
    String logistik16_2 ="Minyak Goreng tidak hanya terbuat dari Kelapa melainkan dari Sawit, kacang-kacangan, biji-bijian, kedelai, dan jagung. jadi minyak goreng itu ada banyak sekali macam ragamnya, tapi yang paling umum yang kita temukan di dapur sehari-hari adalah minyak goreng yang terbuat dari sawit, Nah sekarang mari kita langsung saja melihat, manfaat minyak goreng di bawah ini.";
    ImageView gamb16 = (ImageView)findViewById(R.id.gambar16); TextView log16 =(TextView)findViewById(R.id.textViewLog16); TextView log16_2
            =(TextView)findViewById(R.id.textViewLog16_2); gamb16.setBackgroundResource(R.drawable.logistik16); log16.setText(logistik16); log16_2.setText(logistik16_2);

    String logistik17 ="17. Tempe";
    String logistik17_2 ="Bahan dasar tempe adalah kacang kedelai yang memiliki kandungan kaya akan gizi, salah satunya merupakan sumber protein nabati . selain itu karena proses pengolahan tempe sendiri menggunakan fermentasi, maka dari itu tempe memiliki kandungan probiotik yang baik bagi kesehatan pada saluran pencernaan.";
    ImageView gamb17 = (ImageView)findViewById(R.id.gambar17); TextView log17 =(TextView)findViewById(R.id.textViewLog17); TextView log17_2
            =(TextView)findViewById(R.id.textViewLog17_2); gamb17.setBackgroundResource(R.drawable.logistik17); log17.setText(logistik17); log17_2.setText(logistik17_2);

    String logistik18 ="18. Abon";
    String logistik18_2 ="Bagi hampir sebagian besar, bahkan mayoritas masyarakat Indonesia pastilah sudah mengetahui apa itu abon. Bagi Anda yang mungkin belum tahu, abon sendiri merupakan salah satu bahan pangan yang umumnya merupakan bahan olahan yang berbahan dasar dari daging yang telah di suwir halus. Bahan dasar daging ini kemudian diolah dengan cara ditambahkan berbagai macam bumbu, lalu digoreng hingga menjadi kering. Berikut ini adalah beberapa jenis daging yang biasa digunakan sebagai abon :"+
            "\n\n• Daging  sapi"+ "\n•	Daging ayam"+ "\n•	Daging ikan lele"+
            "\n•	Daging ikan patin"+
            "\n•	Daging celeng atau babi"+
            "\n•	Dan beberapa jenis daging, karena pada dasarnya hampir semua daging bisa dimanfaatkan dan diolah menjadi abon.";
    ImageView gamb18 = (ImageView)findViewById(R.id.gambar18);
    TextView log18 =(TextView)findViewById(R.id.textViewLog18); TextView log18_2
            =(TextView)findViewById(R.id.textViewLog18_2);
    gamb18.setBackgroundResource(R.drawable.logistik18); log18.setText(logistik18); log18_2.setText(logistik18_2);
}
}
