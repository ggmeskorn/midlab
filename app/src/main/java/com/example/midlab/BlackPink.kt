package com.example.midlab

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BlackPink(val name: String, val gender: String, val Zone: String, val Number: Int,val Date: String) : Parcelable {
}