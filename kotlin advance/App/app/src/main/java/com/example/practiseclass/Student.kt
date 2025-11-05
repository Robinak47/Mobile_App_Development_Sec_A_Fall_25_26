package com.example.practiseclass

class Student() {
    private var name: String=""
    var age:Int=0
    var cgpa:Float=0.0f
    init
    {
        println("Object Created")
    }

    constructor(name:String, age:Int, cgpa:Float):this()
    {
        this.name=name
        this.age=age
        this.cgpa=cgpa
    }

    fun printDetails()
    {
        println("Student Name: "+this.name)
        println("Student age: "+this.age)
        println("Student Cgpa: "+this.cgpa)
    }

    fun setName(name:String)
    {
        this.name=name
    }


}

fun main()
{
    var stu1:Student=Student()
    stu1.setName("Mr.Meow")
    stu1.printDetails()

    var stu2:Student=Student("Mr. Tom",20, 3.94f)
    stu2.printDetails()
}