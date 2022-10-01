package com.example.movieexpv1.core.utils

import android.content.Context
import android.view.View
import androidx.annotation.ColorInt
import androidx.core.content.ContextCompat
import com.example.movieexpv1.R
import com.google.android.material.snackbar.Snackbar

object SnackBarUtils {
    fun displaySnackBar(view: View, s: String, context: Context) {

        Snackbar.make(view, s, Snackbar.LENGTH_LONG)
            .withColor(ContextCompat.getColor(context, R.color.white))//red
            .setTextColor(ContextCompat.getColor(context, R.color.white))
            .show()

    }

    private fun Snackbar.withColor(@ColorInt colorInt: Int): Snackbar {
        this.view.setBackgroundColor(colorInt)
        return this
    }
}