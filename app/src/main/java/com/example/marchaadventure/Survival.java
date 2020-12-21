package com.example.marchaadventure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Survival extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_survival);
        String survival ="Apa itu survival dan apa hubungannya dengan mendaki gunung?. Survival artinya adalah bertahan hidup dalam situasi kritis, satu kondisi yang dekat sekali dengan kematian, sehingga kamu harus berjuang supaya bisa keluar dari kondisi itu dan menyelamatkan hidupmu.\n" +
                "\n" +
                "Hubungannya dengan mendaki gunung, jelas, kemampuan bertahan hidup, bisa juga disebut survival skill, sangat dibutuhkan oleh para pendaki, karena, walau bagaimanapun, kegiatan mendaki gunung bukanlah kegiatan yang aman-aman saja, ada banyak resiko yang harus dihadapi saat kamu melakukan sebuah pendakian.\n" +
                "\n" +
                "Dalam sebuah pendakian, kamu bisa kapan saja terjebak ke dalam situasi kritis yang membutuhkan kemampuan survival, seperti tersesat di tengah hutan, ditinggal teman sependakian, terjebak kebakaran hutan atau situasi-situasi lainnya.\n" +
                "\n" +
                "Sekarang, kamu tahukan apa itu survival dan betapa pentingnya kemampuan survive bagi para pendaki? Apabila kamu ingin mempelajari sedikit ilmu tentang bertahan hidup di gunung atau survival skill, di bawah ini merupakan beberapa pengetahuan tentang survival skill.";
        TextView sur =(TextView)findViewById(R.id.textViewSur); sur.setText(survival);

        String survival1 ="1. Mental yang Sehat";
        String survival1_2 ="Saat kamu berhadapan dengan situasi kritis, hal yang paling kamu butuhkan adalah mental yang sehat. Mental menjadi salah satu penentu tindak-tanduk kamu saat berada dalam situasi kritis."+
                "\nKebanyakan para pendaki, mereka akan merasa panik dan cemas saat terjebak dalam situasi kritis, sehingga mereka akan melakukan tindakkan yang akan memperparah keadaan."+
                "\nNamun, ketika kamu mempunyai mental sehat, tangguh dan kuat, hatimu akan tenang dan pikiranmu jernih tidak terpengaruhi oleh rasa panik dan cemas. Dengan suasana pikiran yang jernih, kamu akan lebih mudah berfikir dan mencari jalan keluarnya.";
        TextView sur1 =(TextView)findViewById(R.id.textViewSur1); TextView sur1_2 =(TextView)findViewById(R.id.textViewSur1_2); sur1.setText(survival1);
        sur1_2.setText(survival1_2);

        String survival2 ="2. Semangat Untuk Mempertahankan Hidup";
        String survival2_2 ="Meskipun keadaan sangat buruk, namun semangat bertahan hidup harus senantiasa kamu tasbihkan, jangan putus asa dan menyerah kepada situasi kritis, pertahankanlah hidupmu seperti kamu mempertahankan orang-orang yang kamu cintai.";
        TextView sur2 =(TextView)findViewById(R.id.textViewSur2); TextView sur2_2 =(TextView)findViewById(R.id.textViewSur2_2); sur2.setText(survival2);
        sur2_2.setText(survival2_2);

        String survival3 = "3. Pengalaman dari Pelatihan";



        String survival3_2 ="Bukan hanya gaya-gayaan, masuk dalam komunitas para pendaki gunung mempunyai manfaat yang sangat banyak. Salah satunya adalah pengalaman bertahan hidup dalam keadaan kritis di tengah hutan belantara dari pelatihan yang pernah kamu dapatkan bersama komunitas pendaki gunung."+
                "\nMempunyai pengalaman dari latihan akan membuatmu sedikit terbiasa hidup di tengah hutan, jadi, kamu tidak terlalu terkejut dan tegang saat berada dalam kondisi kritis yang membutuhkan survival skill.";
        TextView sur3 =(TextView)findViewById(R.id.textViewSur3); TextView sur3_2 =(TextView)findViewById(R.id.textViewSur3_2); sur3.setText(survival3);
        sur3_2.setText(survival3_2);

        String survival4 = "4. Memiliki Pengetahuan Tentang Survival Skill";
        String survival4_2 ="Sebetulnya, kamu bisa mendapatkan pengetahuan dalam diskusi bersama komunitas-komunitas pendaki gunung yang tersebar di seluruh Indonesia. Namun, buat kamu yang tidak sempat belajar dan berdiskusi tentang survival skill, silahkan klik tombol berikut.";
        TextView sur4 =(TextView)findViewById(R.id.textViewSur4); TextView sur4_2 =(TextView)findViewById(R.id.textViewSur4_2); sur4.setText(survival4);
        sur4_2.setText(survival4_2);

 //       Button Act_Survival2 = (Button) findViewById(R.id.buttonSurvival2);
 //       Act_Survival2.setOnClickListener(new View.OnClickListener() { @Override
 //       public void onClick(View view) {
 //           Intent survivalIntent = new Intent(Survival.this, Survival2.class); survivalIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); startActivity(survivalIntent);
 //       }
 //       });

    }
}
