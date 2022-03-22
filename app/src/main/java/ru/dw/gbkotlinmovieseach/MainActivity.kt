package ru.dw.gbkotlinmovieseach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var button:Button
    private lateinit var person:Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        person = Person("Иван", "Иванов",23)

        initView()
        onClickTestButton()

        val data = Data(1,1,1)
        val data2 = data.copy()
        data2.age = 100

        Log.d("@@@","Data  age: ${data.age}")
        Log.d("@@@","Data2 age: ${data2.age}")



    }

    private fun onClickTestButton() {
       button.setOnClickListener {
           Toast.makeText(this, person.printPerson(), Toast.LENGTH_SHORT).show()
           Log.d("@@@",person.printPerson())
       }
    }

    private fun initView() {
        button = findViewById(R.id.main_activity_test_button)
    }
}