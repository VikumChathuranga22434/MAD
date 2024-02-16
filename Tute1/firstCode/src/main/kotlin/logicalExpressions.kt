fun main() {
    var x = 1
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("Otherwise")
    }

    val y = 0

    // range in the when
    when (y) {
        in 1..10 -> println("The value between in the 1 to 10 range")
        else -> println("Out of range")
    }

    // for
    for (i in 2..10 step 2){
        print("$i ")
    }

    // downTo
    for (i in 10 downTo 2){
        print("$i ")
    }
}