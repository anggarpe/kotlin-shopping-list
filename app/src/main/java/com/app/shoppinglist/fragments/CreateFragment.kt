package com.app.shoppinglist.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.app.shoppinglist.activities.MainActivity
import com.app.shoppinglist.R
import com.app.shoppinglist.models.ItemShop

class CreateFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create, container, false)
        val buttonAdd = view.findViewById<Button>(R.id.addItem_button)
        buttonAdd.setOnClickListener {
            val shoppingDate = view.findViewById<EditText>(R.id.shoppingDate_editText)
            val itemName = view.findViewById<EditText>(R.id.itemName_editText)
            val itemQty = view.findViewById<EditText>(R.id.itemQty_editText)
            val itemNotes = view.findViewById<EditText>(R.id.itemNotes_editText)

            if (shoppingDate.text.toString().isEmpty() || itemName.text.toString()
                    .isEmpty() || itemQty.text.toString().isEmpty() || itemNotes.text.toString()
                    .isEmpty()
            ) Toast.makeText(requireContext(), "Value can't be empty", Toast.LENGTH_SHORT).show()
            else {
                MainActivity.shoppingListItem.add(
                    ItemShop(
                        shoppingDate = shoppingDate.text.toString(),
                        itemName = itemName.text.toString(),
                        itemQty = itemQty.text.toString(),
                        itemNotes = itemNotes.text.toString()
                    )
                )
                shoppingDate.setText("")
                itemName.setText("")
                itemQty.setText("")
                itemNotes.setText("")
                Toast.makeText(requireContext(), "Success Add Item", Toast.LENGTH_SHORT).show()

            }
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = CreateFragment()
    }

}