//package com.example.myapi.recycler
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.example.myapi.R
//
//class RequestsAdapter : RecyclerView.Adapter<RequestsAdapter.ViewHolder>() {
//
//    private var requestsList = mutableListOf<RequestsList>()
//
//    fun showList(request: MutableList<RequestsList>) {
//        requestsList = request
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.cell, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.setData(requestsList[position])
//    }
//
//    override fun getItemCount(): Int = requestsList.size
//
//
//    inner class ViewHolder (item: View): RecyclerView.ViewHolder(item) {
//        fun setData(data: RequestsList){
//            itemView.findViewById<TextView>(R.id.cell_info).text = data.request.toString()
//        }
//    }
//
//}