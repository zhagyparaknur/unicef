package com.cronocode.intentrecyclerview.database

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Child(
    val childSrc : Int,
    val childBac : Int,
    val childName: String,
    val childAge: String

) : Parcelable