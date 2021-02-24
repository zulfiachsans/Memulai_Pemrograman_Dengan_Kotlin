open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia!")
    }

    override fun eat(){
        println("$name sedang memakan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}

class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {

    fun swim() {
        println("$name Sedang berenang")
    }

    override fun eat(){
        println("$name sedang memakan pelet!")
    }

    override fun sleep() {
        println("$name sedang tidur di air!")
    }
}

fun main(){
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
    val dicodingFish = Fish("Dicoding Fish", 5.0, 5, false, "any", 0)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
    print("\n")
    dicodingFish.swim()
    dicodingFish.eat()
    dicodingFish.sleep()
}