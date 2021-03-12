package com.dicoding.firstapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListMotorAdapter(private val listMotor: ArrayList<Motor>): RecyclerView.Adapter<ListMotorAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_motor, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMotor.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val motor = listMotor[position]
        Glide.with(holder.itemView.context)
                .load(motor.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.imgPhoto)

        holder.tvName.text = motor.name
        holder.tvDetail.text = motor.detail

        holder.itemView.setOnClickListener{
            val tcontext = holder.itemView.context
            val motorDetailActivity = Intent(tcontext, DetailMotor::class.java)
            motorDetailActivity.putExtra(DetailMotor.EXTRA_NAMA,motor.name)
            motorDetailActivity.putExtra(DetailMotor.EXTRA_DETAIL,motor.detail)
            motorDetailActivity.putExtra(DetailMotor.EXTRA_GAMBAR,motor.photo)

            tcontext.startActivity(motorDetailActivity)
        }
    }
}