package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency6 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency6 ="KRAM";
        String emergency6_7 ="Penyebab kaki kram ada bermacam-macam, walaupun terkadang kaki kram juga bisa terjadi tanpa diketahui penyebab pastinya."+
                "\n\nPenyebab kaki kram ada bermacam-macam, walaupun terkadang kaki kram juga bisa terjadi tanpa diketahui penyebab pastinya."+
                "\n\nKram otot, baik yang terjadi pada area kaki atau area lainnya, merupakan kontraksi atau menegangnya otot dengan kuat dan secara tiba-tiba."+
                "\n\n Kram bisa berlangsung selama beberapa detik hingga beberapa menit, dan umum terjadi pada kaki."+
                "\nKram kaki di malam hari sering kali mengenai otot betis, dan biasanya terjadi ketika Anda baru saja tertidur atau baru terbangun.";        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency6);
        emer1_2.setText(emergency6_7);
    }
}