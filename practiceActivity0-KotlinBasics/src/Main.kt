
fun main() {

    println("Hello, This is my program for Activity 0 - Kotlin Basics")

    println("*****Pounds(lbs) to Kilograms(kg)*****")
    var pounds: Double = 300.0
    println("Weight in Pounds (lbs): $pounds")
    println("Weight converted to Kilograms (kg): " + pounds*.45359237)
    println()
    println("*****Miles(mi) to Kilometer(km)*****")
    var miles: Double=21.0
    var kilometers: Double = miles * 1.609344
    println("Length in Miles (mi): $miles")
    println("Length in Kilometers (km): $kilometers")
    println()
    println("*****Fahrenheit(°F) to Celsius(°C)*****")
    var farenheit: Double = 9900.0
    var celsius: Double = (farenheit-32)/1.8
    println("Temperature in Farenheit (°F): $farenheit")
    println("Temperature in Celsius (°C): $celsius")
    println()
    println("*********************")
    var studentAge = listOf(18.0,17.0,20.0,19.0,24.0,23.0,25.0,15.0,20.0,22.0)
    var sumAge: Double = studentAge.sum()
    var averageAge: Double = sumAge/studentAge.count()
    for ((index,element) in studentAge.withIndex()){
        println("Age of Student: ${index+1} : $element")
    }
    println("The Average age of the students is: $averageAge")
    println(" ")
    println("***********************************")

    var mainCharacter:String = "Batman"
    var butler:String = "Alfred"
    var loveTeam: String = "Catwoman"
    var police: String = "Gordon"
    var enemy: String = "Ridler"

    println("2 years after he started roaming the streets of Gotham at night, $mainCharacter has become a noctournal animal. \nNow, a new pattern of crime is starting. $mainCharacter and $police is investigating the death of Mayor Mitchell.\nA riddle was left for the $mainCharacter. At home, $mainCharacter and $butler has a conversation. $butler,being good at ciphers, solved partially the problem.\nTogether, they solved and identified the suspect. This was the $enemy's way of introducing himself. After a few days, a girl was missing. $mainCharacter deduced that this dissapearance is related to the death of the mayor.\nThis girl was also a coworker of $loveTeam. While $mainCharacter was investigating, he noticed $loveTeam going to the crime scene, the place where the mayor died. ")



}