package com.example.jobsheet21sofi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class makananAdapter(private val list:ArrayList<siswa>): RecyclerView.Adapter<makananAdapter.NamaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int  ): NamaViewHolder {
        return NamaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false))
    }

    override fun onBindViewHolder(holder: NamaViewHolder, position: Int) {
        holder.bind(list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class NamaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textNama)
        fun bind(get: siswa){
            nama.text = get.nama
        }
    }
}