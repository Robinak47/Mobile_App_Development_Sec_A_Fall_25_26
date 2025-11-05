package com.example.kotlinbasic
fun sum(para1:Int, para2:Int):Int
{
    return para1+para2
}

fun sayMyName(name:String):String
{
    return "Hello "+name
}

fun main()
{
    println("Hello Students")

    var num1="Meow Meow"
    val num2=20

    println("value of num1 is $num1")
    println("value of num1 is $num2")




    println("value of num1 is $num1")
    println("value of num1 is $num2")

    var value1:Int = 10
    var value2:Float=20.4f
    println("value of num1 is $value1")
    println("value of num1 is $value2")


    var value3 =10

    var bool:Boolean = true

    println(bool)

    var ch:Char ='a'
    println(ch)


    var val1: Int =40
    var val2:Int=40

    var sum:Int=val1+val2
    var sub:Int=val1-val2
    var div:Int=val1/val2
    var mul:Int=val1*val2
    var mod:Int=val1%val2

    println("sum is $sum")
    println("sub is $sub")
    println("div is $div")
    println("mul is $mul")
    println("mod is $mod")

    if(val1>val2)
    {
        println("$val1 is grater than $val2")
    }

    else if(val1==val2)
    {
        println("$val1 and $val2 are equal")

        if(val1==30)
        {
            println("hurah")
        }
    }

    else
    {
        println("$val2 is grater than $val1")
    }

    var grade:Char='c'

    when(grade)
    {
        'a'->println("very good")
        'b'->println("you need to improve")
        else->println("you failed")
    }


    for(i in 1..5)
    {
        println(i)
    }

    var fruits = listOf("Apple", "Mango", "Banana")

    println("printing using foreach loop")

    fruits.forEach{fruit->
        println(fruit)
    }


    println("Printing using for Loop")
    for(fruit in fruits)
    {
        println(fruit)
    }


    var variable = 10;

    while(variable>0)
    {
        println(variable)
        variable--
    }


    var variable2 =0

    do
    {
        println(variable2)
        variable2++
    }while(variable2<11)

    println(sum(10,100))
    println(sayMyName("WW"))



}