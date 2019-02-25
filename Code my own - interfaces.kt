package hello

fun main(args: Array<String>) {
    
    val sova = Animal("Atena", 70.0, 3.9)
    sova.getInfo()
    
    val jagoda = Koza("Jagoda", 120.9, 22.0, "Mister Jozo")
    jagoda.getInfo()
    
    val šiško = Bat("Šiško")
    šiško.fly(99.0)
    
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

class Koza(name: String,
          height: Double,
          weight: Double,
          var owner: String): Animal(name, height, weight){
    
    override fun getInfo(): Unit{
        println("$name je $height visoka i teži $weight & vlasnik joj je $owner.")
    }
}

interface Flyable{
    var flies: Boolean
    fun fly(distMiles: Double): Unit
}

class Bat constructor(val name: String,
                     override var flies: Boolean = true)
: Flyable/*Type of return*/{
    override fun fly(distMiles: Double): Unit{
        if(flies) {
            println("$name leti $distMiles milja.")
        }
    }
}
