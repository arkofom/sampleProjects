package com.app.moretv.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.app.moretv.R
import com.app.moretv.customControls.EventTableAdapter
import com.app.moretv.interfaces.Displayable
import com.app.moretv.utils.DataGenerator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val items = DataGenerator.generateDummyData()
        val lv = findViewById<ListView>(R.id.eventList)
        val adapter = EventTableAdapter(this,
            items,
        ) {
            openDetailsActivity(it)
        }
        lv.adapter = adapter
    }
    private fun openDetailsActivity(item: Displayable) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("EVENT",  item)
        startActivity(intent)
    }
}