package com.example.viewmodelejemplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider //NUEVO
import kotlinx.android.synthetic.main.activity_main.* //NUEVO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // view model instance
        val viewModel: MainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // setting text view
        textView.text = viewModel.getNumber().toString()

        //handling button click event
        button.setOnClickListener {
            viewModel.addOne()
            textView.text = viewModel.getNumber().toString()
        }
    }
}