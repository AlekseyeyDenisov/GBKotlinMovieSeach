package ru.dw.gbkotlinmovieseach


class Person(private val firstName: String, private val lastName: String, private val age: Int) {
    fun printPerson(): String {
        return "Имя: $lastName " +
                "Фамили: $firstName " +
                "его возраст: " +
                "$age через один год ему будет:${inAYear(age)}"

    }

    private fun inAYear(age: Int) = age + 1

}