package com.example.marchaadventure.Emergency;


import android.app.Activity; import android.os.Bundle;
import android.widget.ImageView; import android.widget.TextView;
import com.example.marchaadventure.R;
// import ahmadzaohar.jojoadventure.R;

public class Emergency7 extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailemergency);
        String emergency7 ="SAMBARAN PETIR";
        String emergency7_8 ="Petir, kilat, atau halilintar adalah gejala alam yang biasanya muncul pada musim hujan saat langit memunculkan kilatan cahaya sesaat yang menyilaukan."+
                "\n\nPetir merupakan gejala alam yang bisa dianalogikan dengan sebuah kondensator raksasa, saat lempeng pertama berupa awan (bisa lempeng negatif atau lempeng positif) dan lempeng keduanya adalah bumi (dianggap netral)"+
                "\n\nMendaki gunung memang bukan kegiatan tanpa risiko. Para pendaki harus siap berhadapan dengan hipotermia, cedera akibat jalur yang licin, hingga diserang binatang buas. Saat hujan, yang paling ditakuti pendaki adalah petir."+
                "\n\nNamun, ada beberapa cara yang bisa dilakukan untuk menghindari tersambar petir saat berada di gunung."+
                "\n1. Jika memang terpaksa mendaki dalam kondisi hujan, maka siasati dengan mencari tahu kondisi cuaca di gunung yang akan didaki. Salah satu cara yang bisa dilakukan adalah menghubungi tim di basecamp setempat."+
                "\n\n2. Jangan berada di padang rumput yang luas, puncak, atau punggungan gunung yang terbuka."+
                "\n\n3. Hindari berlindung di bawah pohon yang tinggi, karena saat petir menyambar pohon, aliran listrik akan merambat ke tanah dan berbahaya bagi pendaki. Jika terpaksa, pendaki bisa berlindung pada pohon yang berdiri lebih rendah."+
                "\n4. Mematikan alat-alat yang memancarkan atau menerima gelombang seperti telepon seluler, HT (Handy Talky), GPS atau radio. Gelombang yang dipancarkan peralatan ini bisa memancing petir untuk menyambar. Ponsel bisa dinyalakan asal dengan mode pesawat."+
                "\n\n5. Jika mendirikan tenda di tempat terbuka, pilih daerah lembah atau daerah rendah lainnya."+
                "\n\n6. Hindari aksesori berbahan logam. Jenis bahan ini adalah penghantar listrik sekaligus bisa menangkap kilat."+
                "\n\n7. Alasi tubuh dengan ransel, matras atau bahan anti konduktor lain. Hal ini untuk menghindari tubuh agar tidak bersentuhan langsung dengan tanah.";
        ImageView gamb1 = (ImageView)findViewById(R.id.gambar1);
        TextView emer1 = (TextView)findViewById(R.id.textViewJudul);
        TextView emer1_2 =(TextView)findViewById(R.id.textViewEmer1_2);
        gamb1.setBackgroundResource(R.drawable.emergency1);
        emer1.setText(emergency7);
        emer1_2.setText(emergency7_8);
    }
}
