package com.example.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.bottomnavigationview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNav.selectedItemId = R.id.sav1
       binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.save -> {
                    Toast.makeText(this, "save", Toast.LENGTH_SHORT).show()
                }
                R.id.sav1 -> {
                    Toast.makeText(this, "sav1", Toast.LENGTH_SHORT).show()
                }
                R.id.sav2 -> {
                    Toast.makeText(this, "sav2", Toast.LENGTH_SHORT).show()
                }
                R.id.sav3 -> {
                    Toast.makeText(this, "sav3", Toast.LENGTH_SHORT).show()
                }


            }

            true
        }


    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu,menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.save -> {
//                Toast.makeText(this, "save", Toast.LENGTH_SHORT).show()
//            }
//            R.id.sav1 -> {
//                Toast.makeText(this, "sav1", Toast.LENGTH_SHORT).show()
//            }
//            R.id.sav2 -> {
//                Toast.makeText(this, "sav2", Toast.LENGTH_SHORT).show()
//            }
//            R.id.sav3 -> {
//                Toast.makeText(this, "sav3", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//
//
//
//        return true
//    }


}