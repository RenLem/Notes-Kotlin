package hello

fun main(args: Array<String>) {
    
    val mapA = mutableMapOf<Int, Any?>()
    
    val mapB = mutableMapOf(1 to "Gargamel", 2 to 27)
    
    mapA[1] = "Skeletor"
    mapA[2] = 99
    
    println("Velićina mape: ${mapA.size}")
    
    mapA.put(3, "Los Angeles")
    
    mapA.remove(2)
    
    for((x, y) in mapA){
        println("Key: $x  Value: $y")
    }
    
}
