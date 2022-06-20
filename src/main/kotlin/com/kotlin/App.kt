fun main() {
    //Char indentify by '' where can only one char
//    var text = '-'
//    println(text++)
//    println(text++)
//    println(text++)
//    println(text++)
//    println(text++)
    //String indetify by ""
    val text = "Hello World"
//    println(text[1])

    //Looping in kotlin
    for (x in text) {
        println("character $x in $text")
    }

    //Multiline, use """ string here """, trimIndend() used for remove empty space , try to tidy up the code
val multiline = """
    Hello
    I am
    Multiline
""".trimIndent()
    println(multiline)

    //Function, use Unit type to tell that it will not return anything
    //Common Function
    fun myFirstFunction(fName:String, lName: String):String {
        return fName + " " + lName
    }
    //Shorcut Function with direct return
    fun addNumber(y:Int, x:Int) = x + y

    println(myFirstFunction("Ferdy", "Aqliyansyah"))
    println(addNumber(1,2))
}
