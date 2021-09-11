package one.digialinnovation.digibank.Testes

import one.digialinnovation.digibank.Funcionario
import one.digialinnovation.digibank.Pessoa
import java.math.BigDecimal

fun main() {
    val funcionario = Funcionario("Júnior Moura", "123456789-00", BigDecimal.valueOf(2000.0))

    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}