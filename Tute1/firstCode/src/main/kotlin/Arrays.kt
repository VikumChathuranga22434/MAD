fun main() {
    var clothingBrand = arrayOf("Nike", "Fila", "Addidas", "Tommy", "ZARA") // adding a array

    // printing the size
    println("Array Size: " + clothingBrand.size)

    // getting the elements
    println(clothingBrand[4])

    // replacing a element
    clothingBrand[0] = "levis's"
    println(clothingBrand[0])
    println(clothingBrand[1])

    //getting the elements by forEach
    for (i in clothingBrand){
        println(i)
    }

}