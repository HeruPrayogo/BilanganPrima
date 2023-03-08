fun cek(number: Int): Boolean {
        if (number <= 1) {
            return false
        }

        for (i in 2..number / 2) {
            if (number % i == 0) {
                return false
            }
        }

        return true

    }

fun main() {
    println("masukkan angka: ")
    val number = readln()!!.toInt()

    if (cek(number)) {
        println("$number adalah bilangan prima")
    } else {
        println("$number bukan bilangan prima")
    }
}


