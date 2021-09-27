package com.example.appbar_datepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class DatePicker : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)
        supportActionBar!!.title = "Testando Menu"
        supportActionBar!!.subtitle = "Apredendo a lidar com menus"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_teste, menu)
        return true
    }
}