fun main() {
println("Bitte gib eine Zahl ein und drücke anschließend Enter um ein Ergebnis zu erhalten")
    val eingabeZahl = readln().toInt()
    println(primzahlPruefer(eingabeZahl))
    if (primzahlPruefer(eingabeZahl) == false) {
        println("Die Zahl $eingabeZahl ist keine Primzahl")
    } else {
        println("Die Zahl $eingabeZahl ist eine Primzahl")
    }
}

fun primzahlPruefer(number: Int) : Boolean {
    if (number < 2) return false
    for (i in 2 until number /2) {
        if (number % i == 0) return false
    }
    return true
}