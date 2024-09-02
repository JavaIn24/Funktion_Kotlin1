package Task1

fun main (){
    println(step(2, 3))
}

fun step (a: Int, n : Int) : Int {
    var b = 1
    for (i in 1..n) b *= a
    return b
}
