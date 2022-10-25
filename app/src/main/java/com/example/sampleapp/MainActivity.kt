package com.example.sampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    lateinit var edtFname: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPhone: EditText
    lateinit var edtAddress: EditText
    lateinit var edtDOB: EditText
    lateinit var rgGender: RadioGroup


    val TAG = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFname = findViewById(R.id.edtFname)
        edtEmail = findViewById(R.id.edtEmail)
        edtPhone = findViewById(R.id.edtPhone)
        edtAddress = findViewById(R.id.edtAddress)
        edtDOB = findViewById(R.id.edtDOB)
        rgGender = findViewById(R.id.rgGender)

    }

    fun save(view:View){
        val state = UComponantState(
            edtFname.text.toString(),
            edtEmail.text.toString(),
            edtPhone.text.toString(),
            edtAddress.text.toString(),
            findViewById<RadioButton>(rgGender.checkedRadioButtonId).text.toString(),
            edtDOB.text.toString()

        )
        Log.i(TAG,state.toString());
    }
}