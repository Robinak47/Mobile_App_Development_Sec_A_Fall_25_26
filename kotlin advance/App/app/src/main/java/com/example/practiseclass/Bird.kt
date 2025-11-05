package com.example.practiseclass

data class Bird(var name:String, var noOfWings:Int, var color:String)
{
    var noOfLegs:Int=0
    fun showDetails()
    {
        println("Name: "+this.name)
        println("No Of Wings: "+this.noOfWings)
        println("Color: "+this.color)
        println("No of Legs: "+this.noOfLegs)
    }



}

fun main()
{
    var bird:Bird=Bird("Magpie", 2,"Green")
    bird.noOfLegs=2
    bird.showDetails()

    println(bird.toString())

    var bird1:Bird=bird.copy()
    println(bird1.toString())
}
