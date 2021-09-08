package one.digialinnovation.digibank

class Pessoa {

    var nome: String = "Júnior Moura"
    var cpf: String = "123.456.789-10"

    private set

    constructor()

    fun pessoaInfo()= "$nome e $cpf"

}

fun main() {

    val funcionario = Pessoa()

    println(funcionario.pessoaInfo())





}

