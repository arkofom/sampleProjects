package com.app.moretv.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.app.moretv.R
import com.app.moretv.interfaces.Displayable

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
    }

    override fun onStart() {
        super.onStart()
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        (intent.getSerializableExtra("EVENT") as? Displayable)?.let {
            findViewById<TextView>(R.id.title).text = "${it.getDisplayName()} Details"
            findViewById<TextView>(R.id.details).text = it.getDetails()
        }
    }

}