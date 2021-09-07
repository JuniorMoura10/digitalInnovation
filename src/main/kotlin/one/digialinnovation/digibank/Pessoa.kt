package one.digialinnovation.digibank

class Pessoa {

    var nome: String = "Júnior Moura"
    var cpf: String = "123.456.789-10"
<<<<<<< HEAD

    inner class Endereco{
        var rua = "Rua dos Alfeneiros"
        var numero = "02"

    }
=======
>>>>>>> 1ad0058fabeb2434ccfe98cb0ac89d5ff8221dc6
}

fun main() {

    val funcionario = Pessoa()

    println(funcionario.nome)
    println(funcionario.cpf)
<<<<<<< HEAD

    println("Rua: " + funcionario.Endereco().rua)
    println("Numero: " + funcionario.Endereco().numero)


}
=======
}
>>>>>>> 1ad0058fabeb2434ccfe98cb0ac89d5ff8221dc6
