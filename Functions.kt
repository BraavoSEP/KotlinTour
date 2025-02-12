fun soma(a: Int, b: Int): Int {
    return a + b
}

fun saudacao(nome: String) = "Olá, $nome!"

fun main() {
    println("Soma: ${soma(3, 5)}")
    println(saudacao("Kotlin"))
}
