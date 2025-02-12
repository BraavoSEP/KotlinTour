fun main() {
    val x = 5
    if (x > 0) {
        println("Número positivo")
    } else {
        println("Número negativo ou zero")
    }

    for (i in 1..5) {
        println("Número: $i")
    }

    val resultado = when (x) {
        1 -> "Um"
        2 -> "Dois"
        else -> "Outro número"
    }

    println("Resultado do when: $resultado")
}
