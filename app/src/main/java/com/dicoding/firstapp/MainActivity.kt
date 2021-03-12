package com.dicoding.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    private lateinit var rvMotor: RecyclerView
    private val list = ArrayList<Motor>()
    private var title = "Motor Indonesia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setActionBarTitle(title)
        setContentView(R.layout.activity_main)

        rvMotor = findViewById(R.id.rv_motor)
        rvMotor.setHasFixedSize(true)

        list.addAll(MotorData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        val listMotorAdapter = ListMotorAdapter(list)
        rvMotor.layoutManager = LinearLayoutManager(this)
        rvMotor.adapter = listMotorAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_home -> {
                showRecyclerList()
            }
            R.id.action_about -> {
                title = "Menu About"
                val moveAbout = Intent(this@MainActivity, About::class.java)
                startActivity(moveAbout)
            }
        }
        setActionBarTitle(title)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

}




