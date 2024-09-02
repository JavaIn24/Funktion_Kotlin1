package Task3

fun main (){
    println( "Наибольший общий делитель для введенных чесел равен ${determine(2 , 4)}")
}
fun determine (a : Int, b : Int) : Int {

    if (b == 0){
        return a
    }
    return determine(b, a % b)
    println("Введенные числа $a и $b")
}