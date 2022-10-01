package com.example.movieexpv1.di.app.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Show(
    val id: Long,
    val name: String,
    val image: Image,
    val summary: String
) : Parcelable

@Parcelize
data class Image(
    val medium: String,
    val original: String
) : Parcelable