package com.example.practiseclass

open class Human {

    var name:String=""
    var age:Int=0
    var gender: Char='m'

    init {
        println("Human Created!")
    }


    open fun showDetails()
    {
        println("Name: "+this.name)
        println("age: "+this.age)
        println("Gender: "+this.gender)
    }
}

fun main()
{
    var hu1:Human=Human()
    hu1.name="Mr. Tom"
    hu1.age=30
    hu1.gender='m'

    hu1.showDetails()
}