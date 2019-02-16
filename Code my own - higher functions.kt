// HIGHER FUNCTIONS

package hello

fun main() {
    val mult3 = naprFunc(3)
    println("9 pomnoži 3 puta je ${mult3(9)}")
    
    val mult2 = {num1: Int -> num1 * 2}
    val brList2 = arrayOf(1,2,3,4,5)
    funcNaListi(brList2, mult2)
}

fun naprFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}

fun funcNaListi(brList: Array<Int>, myFunc: (br: Int) -> Int){
    for(br in brList){
    println("Funkcija umnožava polje - ${myFunc(br)}")
    }
}
