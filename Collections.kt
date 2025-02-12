fun main() {
    val lista = listOf("Kotlin", "Java", "Python")
    val mutavel = mutableListOf(1, 2, 3)
    val conjunto = setOf(1, 2, 2, 3)
    val mapa = mapOf(1 to "Um", 2 to "Dois")

    println("Lista: $lista")
    println("Lista Mutável antes: $mutavel")
    mutavel.add(4)
    println("Lista Mutável depois: $mutavel")
    println("Conjunto: $conjunto")
    println("Mapa: $mapa")
}
