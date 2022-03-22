package ru.dw.gbkotlinmovieseach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        onClickTestButton()
    }

    private fun onClickTestButton() {
       button.setOnClickListener {
           Toast.makeText(this, getString(R.string.test_info_button), Toast.LENGTH_SHORT).show()
       }
    }

    private fun initView() {
        button = findViewById(R.id.main_activity_test_button)
    }
}