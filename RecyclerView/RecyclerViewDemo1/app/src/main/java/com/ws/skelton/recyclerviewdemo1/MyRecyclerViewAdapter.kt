package com.ws.skelton.recyclerviewdemo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(val fruitList: List<Fruit>) : RecyclerView.Adapter<MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val fruit = fruitList.get(position)

        holder.name.text = fruit.name
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }

}

class MyViewHolder(val view : View) : RecyclerView.ViewHolder(view){
    val name = view.findViewById<TextView>(R.id.textView)
}


