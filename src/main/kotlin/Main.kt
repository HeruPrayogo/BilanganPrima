fun main() {
    print("masukkan angka: ")
    val a = readln()!!.toInt()
        if(a % 2 == 1 && a / a == 1){
            println("$a adalah bilangan prima")
        }else{
            println("$a bukan bilangan prima")
        }
}
