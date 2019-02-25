package hello

fun main(args: Array<String>) {
    
    var nullBy: String? = null
    
    fun myFun(): String?{
        return null
    }
    
    var nullCd = myFun()
    
    if(nullGo != null){
        println("nullGo.length")
    }
    
    var nullCd = nullGo!!.length
    
    var nullDef: String = myFun() ?: "Not null"
    println("$nullDef")
    
}
