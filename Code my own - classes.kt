package hello

fun main(args: Array<String>) {
    
    val sova = Animal("Atena", 70.0, 3.9)
    sova.getInfo()
    
}

open class Animal(val name: String,
                 var height: Double,
                 var weight: Double) {
    
    init{
        val regex = Regex(".*\\d+.*")
        
        require(!name.matches(regex)){"Životinja se ne može zvati brojem!"}
        
        require(height > 0){"Životinja mora biti viša od nule!"}
        require(weight > 0){"Životinja mora biti viša od nule!"}
        }
    
    open fun getInfo(): Unit {
        println("$name je $height visoka i teži $weight.")
    }
}
