package com.ws.skelton.recyclerviewdemo1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val fruitList = listOf(Fruit("망고","통"),Fruit("사과","조"),Fruit("바나나","석"),Fruit("구아바","석"),Fruit("레몬","석"),Fruit("복숭아","석"),Fruit("오렌지","석"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRecyclerV = findViewById<RecyclerView>(R.id.mRecyclerV)
        mRecyclerV.setBackgroundColor(Color.YELLOW)
        mRecyclerV.layoutManager = LinearLayoutManager(this)
        mRecyclerV.adapter = MyRecyclerViewAdapter(fruitList, {selectedFruitItem:Fruit -> listItemClicked(selectedFruitItem)})

    }

    private fun listItemClicked(fruit: Fruit){
        Toast.makeText(this@MainActivity, "Supplier name is ${fruit.supplier}", Toast.LENGTH_LONG).show()
    }

}