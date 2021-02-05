package com.enigmacamp.shoppinglist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.shoppinglist.R
import com.app.shoppinglist.models.ItemShop

//class untuk layout
//custom layout
class ShoppingListViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(itemShop: ItemShop) {
        val itemName = view.findViewById<TextView>(R.id.itemName_textView)
        val itemQty = view.findViewById<TextView>(R.id.itemQty_textView)
        val itemNotes = view.findViewById<TextView>(R.id.itemNotes_textView)

        itemName.setText(itemShop.itemName)
        itemQty.setText(itemShop.itemQty)
        itemNotes.setText(itemShop.itemNotes)
    }
}