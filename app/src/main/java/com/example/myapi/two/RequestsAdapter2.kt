package com.example.myapi.two

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapi.R
import com.example.myapi.api.CoinInfo

class RequestsAdapter2 : RecyclerView.Adapter<RequestsAdapter2.ViewHolder>() {

    private var requestsList = mutableListOf<CoinInfo>()

    fun showList(list: MutableList<CoinInfo>) {
        this.requestsList = list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(requestsList[position])
    }

    override fun getItemCount(): Int = requestsList.size


    inner class ViewHolder (item: View): RecyclerView.ViewHolder(item) {
        fun setData(data: CoinInfo){
            itemView.findViewById<TextView>(R.id.cell_info).text = data.toString()
        }
    }

}