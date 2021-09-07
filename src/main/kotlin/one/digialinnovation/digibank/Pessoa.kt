package one.digialinnovation.digibank

class Pessoa {

    var nome: String = "Júnior Moura"
    var cpf: String = "123.456.789-10"

    inner class Endereco{
        var rua = "Rua dos Alfeneiros"
        var numero = "02"

    }
}

fun main() {

    val funcionario = Pessoa()

    println(funcionario.nome)
    println(funcionario.cpf)

    println("Rua: " + funcionario.Endereco().rua)
    println("Numero: " + funcionario.Endereco().numero)


}
