fun main(args: Array<String>) {
    println("Hello ,${args[0]}")

    val isUnit = println("This is an Expression")
    println(isUnit)



    drive()
    drive("Slow")
    temp("Monday",20)

    var waterLevel:Int = 20

    val waterFilter = {level:Int -> level/2}

    println(waterFilter(waterLevel))

    var results: String= "Charles"
    when(results){
        "Chris" -> println("No Results")
        "Tian" ->println("Got Results")
        "Charles"-> println("Too many results")
    }

    val pets = arrayOf("Tabby", "Basha", "Pucci")
    for((index,element) in pets.withIndex()){
        println("Item at $index is $element")
    }

    for (i in 3..6 step 2 ) print(i)
    println()
    var instruments = arrayOf("trumpet","piano", "violin", "trumpet")
    for(elements in instruments)
        println(elements)
    val Instruments = mutableListOf("trumpet","piano", "violin",)
    for (elements in Instruments)
        println(elements)
    Instruments.remove("trumpets")

    var numberOfBooks = 6
    numberOfBooks = numberOfBooks.dec()
    }
}
fun drive(speed:String = "Fast"): Unit{
    println("I am $speed")
}

fun temp(Day:String, Temp:Int){
    println("Today is $Day and the Temperature is $Temp")
}