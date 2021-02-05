package com.enigmacamp.shoppinglist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.shoppinglist.R
import com.app.shoppinglist.models.ItemShop

class ShoppingListViewAdapter(val items: ArrayList<ItemShop>) :
    RecyclerView.Adapter<ShoppingListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_shop, parent, false)
        return ShoppingListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoppingListViewHolder, position: Int) {
        val shopItem = items.get(position)
        holder.bind(shopItem)
    }

    override fun getItemCount() = items.size
}