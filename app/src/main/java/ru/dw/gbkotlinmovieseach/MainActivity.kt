package ru.dw.gbkotlinmovieseach

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        person = Person("Иван", "Иванов", 23)

        initView()
        onClickTestButton()

        val data = Data(1, 1, 1)
        val data2 = data.copy()
        data2.age = 100

        Log.d("@@@", "Data  age: ${data.age}")
        Log.d("@@@", "Data2 age: ${data2.age}")

        for (one in getArrayList()) {
            Log.d("@@@", "for $one")
        }
        getArrayList().forEach {
            Log.d("@@@", "forEach $it")
        }

        for (i in 1..10){
            Log.d("@@@", "for in 1..10 $i")
        }
        for (i in 1 until 10){
            Log.d("@@@", "for until $i")
        }
        for (i in 10 downTo  1 step 3){
            Log.d("@@@", "for downTo $i")
        }
        var counter = 10
        while (counter-->0){
            Log.d("@@@", "while counter $counter")
        }
        counter = 10
        do {
            Log.d("@@@", "do while counter $counter")
        }while (counter-->0)

    }

    private fun onClickTestButton() {
        button.setOnClickListener {
            Toast.makeText(this, person.printPerson(), Toast.LENGTH_SHORT).show()
            Log.d("@@@", person.printPerson())
        }
    }

    private fun initView() {
        button = findViewById(R.id.main_activity_test_button)
    }

    fun getArrayList() = listOf(1, 2, 3, 4, 5, 8)
}