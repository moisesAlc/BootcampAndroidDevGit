fun main() {
    println("Digite o primeiro número: ")
    val num1 = readlnOrNull()?.toDoubleOrNull()
    println("Digite o operador (+, -, *, /): ")
    val operator = readlnOrNull()
    println("Digite o segundo número: ")
    val num2 = readlnOrNull()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Erro: Um ou ambos os números são inválidos.")
        return
    }

    when (operator) {
        "-" -> println("Resultado: ${num1 - num2}")
        "*" -> println("Resultado: ${num1 * num2}")
        "/" -> {
            if (num2 == 0.0) {
                println("Erro: Divisão por zero não é permitida.")
            } else {
                println("Resultado: ${num1 / num2}")
            }
        }
        "+" -> println("Resultado: ${num1 + num2}")
        else -> println("Erro: Operador inválido.")
    }
}