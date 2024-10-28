# BootcampAndroidDevGit

# Kotlin Calculator

Este é um projeto simples de calculadora em Kotlin que realiza operações básicas como subtração, multiplicação e divisão. A soma é tratada como uma operação inválida para demonstrar o uso de validações.

## Funcionalidades

- Aceita dois números do usuário.
- Permite os operadores:
    - `-` para subtração
    - `*` para multiplicação
    - `/` para divisão (com verificação de divisão por zero)
- Exibe uma mensagem de erro se o operador de soma (`+`) ou qualquer outro operador inválido for inserido.

## Pré-requisitos

- Kotlin instalado. [Instalar Kotlin](https://kotlinlang.org/docs/command-line.html)

## Como Rodar

### Via IntelliJ IDEA

1. Abra o projeto no IntelliJ IDEA.
2. Clique com o botão direito no arquivo `Calculator.kt` e selecione **Run 'CalculatorKt'**.

### Via Terminal

1. Abra o terminal do IntelliJ e navegue até o diretório `src` onde o arquivo `Calculator.kt` está.

   ```bash
   kotlinc Calculator.kt -include-runtime -d Calculator.jar
    
   kotlin Calculator.kt
    
   java -jar Calculator.jar


