package com.app.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.shoppinglist.activities.MainActivity
import com.app.shoppinglist.R
import com.enigmacamp.shoppinglist.ShoppingListViewAdapter

class ListFragment : Fragment() {
    lateinit var shoppingListViewAdapter: ShoppingListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        shoppingListViewAdapter = ShoppingListViewAdapter(MainActivity.shoppingListItem)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val shoppingList = view.findViewById<RecyclerView>(R.id.shoppingList_recyclerView)
        shoppingList.layoutManager = LinearLayoutManager(requireContext())
        shoppingList.adapter = shoppingListViewAdapter
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = ListFragment()
    }
}