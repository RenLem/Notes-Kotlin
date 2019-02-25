package hello

fun main(args: Array<String>) {
    
    val list = 1..20
    
    val zbrojList = list.reduce { x, y -> x + y }
    println("Reduce: $zbrojList")
    
    val ybrojList = list.fold(5) { x, y -> x + y }
    println("Fold: $ybrojList")
    
    println("Ima li koji - any: ${list.any { it % 2 == 0}}")
    println("Jesu li svi - all: ${list.all { it % 2 == 0}}")
    
    val big7 = list.filter { it > 7 }
    big7.forEach { n -> println("Veći je od 7: $n")}
    
    val times10 = list.map { it * 10}
    times10.forEach { n -> println("Deset puta veći: $n")}
    
    
    
    
}
