package com.app.moretv.customControls

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.app.moretv.interfaces.Displayable

class EventTableAdapter(
    private val context: Context,
    val items: List<Displayable>,
    val onCellClicked: ((item: Displayable) -> Unit)? = null
) : BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view = convertView ?: LayoutInflater
            .from(context)
            .inflate(
                android.R.layout.simple_list_item_1,
                parent,
                false
            )
        var name = "${items[position].getDisplayName()} - Details"
        view.findViewById<TextView>(android.R.id.text1).text = name
        view.setOnClickListener {
            this.onCellClicked?.invoke(items[position])
        }
        return view
    }
}