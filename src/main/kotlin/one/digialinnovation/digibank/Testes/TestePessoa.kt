package one.digialinnovation.digibank.Testes

import one.digialinnovation.digibank.Pessoa

fun main() {
    val pessoa = Pessoa("Júnior Moura", "123456789-00")
    println(pessoa.nome)
    println(pessoa.cpf)
}