package com.example.birthday_greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View)
    {
        val name = nameInput.editableText.tostring()
        Toast.makeText(applicationContext,"name is $name", Toast.LENGTH_LONG).show()
    }
}