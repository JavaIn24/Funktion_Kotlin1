package Task2
fun main (){
    fact(7,14)
    // for (i in 7..14) println(i)
}
fun fact (a : Int , b : Int ) {
    var c = 1
    if (a < b) {
        for (i in a..b) {
            c *= i
        }
        println("Произведение всех целых чисел от $a до $b равно $c")
    } else println("Первое число больше второго, введите корректые данные")
}
