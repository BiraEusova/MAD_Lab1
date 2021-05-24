package com.example.laba1

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class DialogKlass: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it,R.style.SpikeTheme2)
            builder.setTitle("Почти готово!")
                .setMessage("На ваш почтовый ящик отправлена инструкция по восстановлению пароля")
                .setPositiveButton("ЗАКРЫТЬ") {
                        dialog, id ->  dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
