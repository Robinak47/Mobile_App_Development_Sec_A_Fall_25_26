package com.example.practiseclass

class Calculator: BasicCalculator() {

    var val1:Int=0
    var val2:Int=0
    override fun sum()
    {
        println(this.val1+this.val2)
    }

    override fun sub()
    {
        println(this.val1-this.val2)
    }

    override fun div()
    {
        println(this.val1/this.val2)
    }

    override fun mul()
    {
        println(this.val1*this.val2)
    }
}

fun main()
{
    var cal: Calculator= Calculator()
    cal.val1=20
    cal.val2=30

    cal.sum()
    cal.sub()
    cal.mul()
    cal.div()
}