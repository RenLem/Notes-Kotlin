package hello

fun main(args: Array<String>) {
    val age = 17
    
    if(age < 5){
        println("Go to Preschool")
    }else if(age == 5){
        println("Go to Kindergarten")
    }else if((age > 5) && (age <= 17)){
        val grade = age -5
        println("Go to Grade $grade")
    }else{
        println("Go to Collage")
    }
    
    when(age){
        0,1,2,3,4 -> println("Go to Preschool")
        5 -> println("Go to Kindergarten")
        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }else -> println("Go to Collage")
    }  
}

package hello

import java.util.Random

fun main(args: Array<String>) {
    for(x in 1..10){
        //println("Note: $x")
    }
    
    val rand = Random()
    val mgc = rand.nextInt(7) + 1
    
    var guess = 0
    
    while(mgc != guess){
        guess += 1
    }  
    
    //println("Pa to je bio $guess")
    
    for(x in 1..20){
        if(x % 2 == 0){
            continue
        }
        
        //println("Nije modul; $x")
        if(x == 9) break
    }
    
    var arrayJ = arrayOf(3, 6, 9)
    
    for(i in arrayJ.indices){
        //println("To je: $arrayJ[i] u $i")
    }
    
    for((index, value) in arrayJ.withIndex()){
        println("Index: $index Value: $value")
    }   
}
