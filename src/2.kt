// 2. Leer una matriz C de orden P (matriz cuadrada). Mostrar los elementos de
//la diagonal principal, secundaria, de la matriz triangular superior y de la
//matriz triangular inferior.

fun main() {
    println("Ejercicio 2")

    println("Ingrese el tamaño de la matriz cuadrada (P)")
    val p = readLine()!!.toInt()

    val matrix = Array(p) { IntArray(p) }

    for (i in 0 until p) {
        for (j in 0 until p) {
            println("Ingrese el valor de la matriz en la posición $i,$j")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    println("Diagonal principal:")
    for (i in 0 until p) {
        print("${matrix[i][i]} ")
    }
    println()

    println("Diagonal secundaria:")
    for (i in 0 until p) {
        print("${matrix[i][p - i - 1]} ")
    }
    println()

    println("Matriz triangular superior:")
    for (i in 0 until p) {
        for (j in i until p) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    println("Matriz triangular inferior:")
    for (i in 0 until p) {
        for (j in 0..i) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}