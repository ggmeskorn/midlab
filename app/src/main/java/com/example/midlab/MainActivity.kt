package com.example.midlab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var subject: String= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val subjectSpinner: Spinner = spiner_subject;
        val subjectArray = resources.getStringArray(R.array.SelectSize_array)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, subjectArray)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        subjectSpinner.adapter = arrayAdapter

        subjectSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                 subject = subjectArray[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }
    }
        fun onClickShowDetail(v: View) {
            var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
            var selectedId: Int = radioGroup.checkedRadioButtonId
            var radioButton: RadioButton = findViewById(selectedId)
            val intent = Intent(this, SecondActivity::class.java)
            val putExtra = intent.putExtra(
                "empData",
                BlackPink(
                    nameEDT.text.toString(),
                    radioButton.text.toString(),
                    subject.toString(),
                    numberEDT.text.toString().toInt(),
                    emailEDT.text.toString()
                )
            )
            startActivity(intent)
        }

        fun reset(v: View) {
            nameEDT.text.clear()
            radioGroup.clearCheck()
            emailEDT.text.clear()
            numberEDT.text.clear()
            spiner_subject.setSelection(0)
        }
    }


