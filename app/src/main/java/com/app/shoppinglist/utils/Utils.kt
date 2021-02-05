package com.app.shoppinglist.utils

import android.view.View
import androidx.appcompat.app.AlertDialog

fun onAlertDialog(view: View, title: String, message: String) {
    //Instantiate builder variable
    val builder = AlertDialog.Builder(view.context)
    // set title
    builder.setTitle(title)
    //set content area
    builder.setMessage(message)
    //set negative button
    builder.setPositiveButton(
        "Ok"
    ) { dialog, id ->
        // User clicked Update Now button
//            Toast.makeText(this, "Updating your device",Toast.LENGTH_SHORT).show()
    }

    //set positive button
//        builder.setNegativeButton(
//            "Cancel") { dialog, id ->
//            // User cancelled the dialog
//        }

    //set neutral button
//        builder.setNeutralButton("Reminder me latter") {dialog, id->
//            // User Click on reminder me latter
//        }
    builder.show()
}
