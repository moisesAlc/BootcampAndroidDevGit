fun main() {
    val result = readNumber("Digite o primeiro número: ")
        ?.let { num1 ->
            readOperator("Digite a operação que deseja realizar ->  [ + ][ - ][ * ][ / ] :")
                ?.let { operator ->
                    readNumber("Digite o segundo número ")
                        ?.let { num2 -> calculate(num1, num2, operator) }
                }
        }
    println(result ?: "ERRO na operação")
    println("Obrigado por ter usado a LuCalc. Volte sempre !")
}

fun readNumber(num: String): Double? {
    print(num)
    return readlnOrNull()?.toDoubleOrNull() ?: run {
        println("ERRO valor inserido inválido.")
        null
    }
}

fun readOperator(operator: String): String? {
    print(operator)
    val operator = readLine()
    if (operator in listOf("+", "-", "*", "/")) {
        return operator
    }
    println("ERRO operador inválido")
    return null
}

fun calculate(num1: Double, num2: Double, operator: String): Double? {
    return when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) {
            num1 / num2
        } else {
            println("Não pode dividir por 0")
            null
        }

        else -> null
    }
}

