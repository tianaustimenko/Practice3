import kotlin.random.Random
import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //1
    val myAge = 18

    val isTeenager = if (myAge >= 13 && myAge <=19) {
        println("Возраст находится в промежутке от 13 до 19 лет")
    }
    else {
        println("Возраст не находится в промежутке от 13 до 19 лет")
    }

    //2
    val  theirAge = 30
    val bothTeenagers = if (theirAge >= 13 && theirAge <=19) {
        println("Подросток")
    }
    else {
        println("Не подросток")
    }

    //3
    val reader = "Tatiana"
    val author = "Richard Lucas"
    val  authorIsReader = if(reader == author){
        println("Совпадает")
    }else{
        println("Не совпадает")
    }

    //4
    val  readerBeforeAuthor = if(reader < author){
        println("следует по алфавиту")
    }
    else{
        println("не следует по алфавиту")
    }

    //5
    val myAge2 = 18
    if (myAge2 >= 13 && myAge2 <=19) {
        println("Подросток")
    }
    else {
        println("Не подросток")
    }

    //6
    val answer = if(myAge2 >= 13 && myAge2 <=19) println("Подросток") else println("Не подросток")

    //7
    var counter : Int =0
    while (counter<10) {
        println("X= $counter")
        counter +=1
    }

    //8
    counter = 0
    var roll : Int = 0
    do {
        roll == Random().nextInt(6)
        counter += 1
        println("После $counter бросков, roll равен $roll")
    } while (counter != 0)

    //9
    val range : IntRange = 1..10
    for ( i in range){
        val square = i*i
        println(square)
    }

    //10
    for (i in range){
        val square = sqrt(i.toDouble())
    }

    //11
    var sum: Int = 0
    for (row in 1 until 8 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)
}