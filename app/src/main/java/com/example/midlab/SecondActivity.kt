package com.example.midlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_second.*
import java.text.DecimalFormat

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data =intent.extras
        var newBlackPink=data?.getParcelable<BlackPink>("empData")
        nameText.text = "Name : ${newBlackPink?.name}"
        genderText.text = "Gender : ${newBlackPink?.gender}"
        zoneText.text = "Zone : ${newBlackPink?.Zone}"
        numberText.text = "Number Zone : ${newBlackPink?.Number}"
        dateText.text = "Date : ${newBlackPink?.Date}"
        priceText.text = "Price : "  + DecimalFormat ("#.###").format (newBlackPink?.Zone.toString().toInt()*newBlackPink?.Number.toString().toInt()) + "      Bath"
    }
    fun onClickClose(view: View){
        finish()
    }
}

