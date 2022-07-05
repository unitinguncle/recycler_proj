package com.developer.recycler_proj

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.developer.recycler_proj.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val stdObjects :MutableList<student> = mutableListOf<student>()
        stdObjects.add(student("Student 1","Roll No. 01"))
        stdObjects.add(student("Student 2","Roll No. 02"))
        stdObjects.add(student("Student 3","Roll No. 03"))
        stdObjects.add(student("Student 4","Roll No. 04"))
        stdObjects.add(student("Student 5","Roll No. 05"))
        stdObjects.add(student("Student 6","Roll No. 06"))
        stdObjects.add(student("Student 7","Roll No. 07"))
        stdObjects.add(student("Student 8","Roll No. 08"))
        stdObjects.add(student("Student 9","Roll No. 09"))
        stdObjects.add(student("Student 10","Roll No. 10"))
        stdObjects.add(student("Student 11","Roll No. 11"))


        studlist.adapter = MyAdapter(stdObjects)
        studlist.layoutManager = LinearLayoutManager(this)

        }

    }