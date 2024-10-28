fun main() {
    println("Digite o primeiro número: ")
    val num1 = readLine()?.toDoubleOrNull()
    println("Digite o operador (+, -, *, /): ")
    val operator = readLine()
    println("Digite o segundo número: ")
    val num2 = readLine()?.toDoubleOrNull()

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
        //    erro corrigido
        // "+" -> println("Erro: A operação de soma não é permitida!")
        else -> println("Erro: Operador inválido.")
    }
}

