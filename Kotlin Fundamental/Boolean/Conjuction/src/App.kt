// main function
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now >= officeOpen && now <= officeClosed
    val isClose = now < officeOpen && now > officeClosed

    println("Office is close : $isClose")
    print("Office is open : $isOpen")
}