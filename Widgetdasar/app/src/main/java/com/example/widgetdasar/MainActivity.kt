package com.example.widgetdasar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onRbCliked(view: View){
        if(view is RadioButton){
            val checked = view.isChecked
            val rb_pria: RadioButton = findViewById(R.id.rb_pria)
            val rb_wanita: RadioButton = findViewById(R.id.rb_wanita)

            when(view.getId()){
                R.id.rb_pria ->
                    if(checked){
                        Toast.makeText(applicationContext,
                            "On click : ${rb_pria.text}",
                            Toast.LENGTH_SHORT).show()
                    }
                R.id.rb_wanita ->
                    if(checked){
                        Toast.makeText(applicationContext,
                        "On click : ${rb_wanita.text}",
                        Toast.LENGTH_SHORT).show()
                    }
            }
        }
    }

    fun onCbClicked(view: View){
        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            val cbcoding: CheckBox = findViewById(R.id.cd_coding)
            val cbtraveling: CheckBox = findViewById(R.id.cd_traveling)
            val cbcooking: CheckBox = findViewById(R.id.cd_cooking)

            when (view.getId()){
                R.id.cd_coding ->{
                    if (checked){
                        Toast.makeText(applicationContext,
                        "On click : ${cbcoding.text} terpilih",
                        Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(applicationContext,
                        "On click : ${cbcoding.text} tidak terpilih",
                        Toast.LENGTH_SHORT).show()
                    }
                }

                R.id.cd_traveling ->{
                    if (checked){
                        Toast.makeText(applicationContext,
                            "On click : ${cbtraveling.text} terpilih",
                            Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(applicationContext,
                            "On click : ${cbtraveling.text} tidak terpilih",
                            Toast.LENGTH_SHORT).show()
                    }
                }

                R.id.cd_cooking ->{
                    if (checked){
                        Toast.makeText(applicationContext,
                            "On click : ${cbcooking.text} terpilih",
                            Toast.LENGTH_SHORT).show()
                    } else{
                        Toast.makeText(applicationContext,
                            "On click : ${cbcooking.text} tidak terpilih",
                            Toast.LENGTH_SHORT).show()
                    }
                }

            }
        }
    }
    fun onBtnProsesClicked(view : View){
        val tvPesan: TextView = findViewById(R.id.tv_pesan)
        val cbCoding: CheckBox = findViewById(R.id.cd_coding)
        val cbTraveling: CheckBox = findViewById(R.id.cd_traveling)
        val cbCooking: CheckBox = findViewById(R.id.cd_cooking)
        val rb_pria: RadioButton = findViewById(R.id.rb_pria)
        val rb_wanita: RadioButton = findViewById(R.id.rb_wanita)
    }
}