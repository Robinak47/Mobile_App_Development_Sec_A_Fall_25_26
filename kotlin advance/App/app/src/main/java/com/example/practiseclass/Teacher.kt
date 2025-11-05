package com.example.practiseclass

class Teacher:Human() {

    var specialization:String=""
    override fun showDetails()
    {
        super.showDetails()
        println("Specialization: "+this.specialization)
    }

    fun sayMyName()
    {
        println("Name: "+this.name)

    }

    fun sayMyName(name: String)
    {
        println("Name: "+name)
    }
}

fun main()
{
    var teacher:Teacher=Teacher()
    teacher.name="Mr. XYZ"
    teacher.age=30
    teacher.gender='m'
    teacher.specialization="AI"
    teacher.showDetails()
    teacher.sayMyName()
    teacher.sayMyName("Meow Meow")

}