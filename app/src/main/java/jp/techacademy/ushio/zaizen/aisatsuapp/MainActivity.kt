package jp.techacademy.ushio.zaizen.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TimePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text="button"
        button1.setOnClickListener(this)
    }

    override fun onClick(v:View){
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener {view, hour, minute->
                greeting(hour, minute)
            },
            13, 0, true)
        timePickerDialog.show()
    }

    private fun greeting(hour:Int, minute:Int) {
        if (hour>=2 && hour<10) textView.text= "おはよう"
        if (hour>=10 && hour<18) textView.text= "こんにちは"
        if (hour>=18 || hour<2) textView.text="こんばんは"
    }
}