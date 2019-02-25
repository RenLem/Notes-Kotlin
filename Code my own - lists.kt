package hello

fun main(args: Array<String>) {
    
    var list: MutableList<Int> = mutableListOf(1,2,3,4,5)
    
    list.add(6)
    
    println("Prvi je: ${list.first()}")
    println("Zadnji je: ${list.last()}")
    println("Drugi je: ${list[1]}")
    
    var mutList = list.subList(0, 3)
    
    println("Koliko je duga mutirana: ${mutList.size}")
    println("Koliko je duga obićna: ${list.size}")
    
    mutList.clear()
    
    list.remove(1)
    
    list.removeAt(1)
    
    list.forEach { n -> println("Ovo je lista: $n")}
    
    
}
