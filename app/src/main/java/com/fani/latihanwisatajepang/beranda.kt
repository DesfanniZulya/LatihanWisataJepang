package com.fani.latihanwisatajepang


import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fani.latihanwisatajepang.adapter.AdapterGambar


class beranda: AppCompatActivity() {

    private val imageList = arrayOf(
        R.drawable.jepang_kota,
        R.drawable.jepang1,
        R.drawable.jepang3,
        R.drawable.sakura
    )

    private val title = arrayOf("Shibuya Sky", "Gunung Fuji", "Hachioji", "Sakura")
    private val location = arrayOf(
        "Lokasi : Shibuya, Jepan",
        "Lokasi : Honshu, Jepang",
        "Lokasi : Tokyo, Jepang",
        "Lokasi : Shibuya, Jepang"
    )
    private val tgl = arrayOf(
        "Tgl : 2 - Januari - 2024",
        "Tgl : 22 - Maret - 2024",
        "Tgl : 14 - Oktober - 2024",
        "Tgl : 8 - Desember - 2024"
    )

    private val des = arrayOf(
        "Shibuya Sky adalah sebuah destinasi yang wajib dikunjungi di Tokyo, Jepang. Dengan ketinggian sekitar 230 meter di atas tanah, Shibuya Sky menawarkan pemandangan 360 derajat yang menakjubkan dari berbagai landmark terkenal di Tokyo, seperti Gunung Fuji, Stadion Nasional, Tokyo Sky Tree, Tokyo Tower dan Shibuya Crossing.",
        "Gunung Fuji, terletak di pulau Honshu, adalah gunung tertinggi di Jepang, dengan ketinggian 3.776,24 m. Gunung ini adalah gunung berapi tertinggi kedua yang terletak di sebuah pulau di benua Asia, dan puncak tertinggi ketujuh dari sebuah pulau di Bumi.",
        "Hachioji adalah bagian dari Provinsi Musashi kuno. Hachioji telah menjadi penting titik persimpangan dan shukuba sepanjang Jalan Raya Kōshū, jalan utama yang menghubungkan Edo (sekarang Tokyo) dengan Jepang barat.",
        "Sakura adalah sebutan untuk bunga yang tumbuh dari pohon bergenus Prunus maupun subgenusnya, Cerasus. Genus tersebut merupakan genus pepohonan yang umum dijumpai di Asia Timur, seperti Tiongkok, Korea, dan terutama Jepang."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_beranda)

        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = AdapterGambar(this, imageList, title, location)
        gridView.adapter = adapter

        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, Detail::class.java)
            intent.putExtra("data", imageList[position])
            intent.putExtra("data1", title[position])
            intent.putExtra("data2", location[position])
            intent.putExtra("data3", tgl[position])
            intent.putExtra("data4", des[position])
            startActivity(intent)
        }
    }
}