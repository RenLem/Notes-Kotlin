package hello

fun main(args: Array<String>) {
    
    val djelitelj = 0
    
    try {
        if(djelitelj == 0) {
            throw IllegalArgumentException("Nemoš podjelt sa nulom!")
        } else {
            println("9 djeljeno sa $djelitelj = ${9/djelitelj}")
        }
    } catch(e: IllegalArgumentException) {
        println("${e.message}")
    }   
}

