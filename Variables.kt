fun main() {
    var a: Int = 1  // Variável mutável 
    val b: Int = 2  // Variável imutável
    val c = 3       // Tipo inferido automaticamente

    println("a: $a, b: $b, c: %c")

    a += 7
    println("Novo valor de a: $a)
}