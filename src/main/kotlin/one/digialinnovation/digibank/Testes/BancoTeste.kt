package one.digialinnovation.digibank.Testes

import one.digialinnovation.digibank.Banco

fun main() {
    val digiOneBank = Banco(nome ="DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    println(digiOneBank.info())
}