// FUNCTIONS

package hello

fun main() {
    fun add(num1: Int, num2: Int): Int = num1 + num2
    println("${add(7, 2)}")
    
    fun subtract(num1: Int = 1, num2: Int = 2) = num1 - num2
    println("${subtract(10, 9)}")
    
    println("${subtract(num2 = 7, num1 = 2)}")
    
    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Sanco")
    
    
    val (two, three) = backTwo(2)
    println("Ovo vraća $two $three")
    
}

fun backTwo(num: Int) : Pair<Int, Int> {
    return Pair(num + 1, num + 7)
}

package hello

fun main() {
    println("Suma je ${getSum(1,2,3,4,5)}")
    
}

fun getSum(vararg br: Int) : Int {
    var sum = 0
    br.forEach{n -> sum += n}
    return sum
}

package hello

fun main() {
    
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("Multipliciran 9 sa 8 je ${multiply(9, 8)}")
    
    println("7! je ${factoriel(7)}")
    
}

fun factoriel(f: Int) : Int{
    tailrec fun factTail(d: Int, b: Int) : Int{
        if(d == 0) return b
        else return factTail(d -1, d * b)
    }
    return factTail(f, 1)
}

package hello

fun main() {
    val brList = 1..27
    
    val filterList = brList.filter{ it % 9 == 0}
    filterList.forEach{ n -> println(n) }
}
