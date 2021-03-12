package com.dicoding.firstapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailMotor : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_GAMBAR = "extra_gambar"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail_motor)

        val getNama = intent.getStringExtra(EXTRA_NAMA)
        val getDetail = intent.getStringExtra(EXTRA_DETAIL)
        val getPhoto = intent.getIntExtra(EXTRA_GAMBAR,0)

        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)

        tvName.text = getNama
        tvDetail.text = getDetail
        imgPhoto.setImageResource(getPhoto)

    }
}


