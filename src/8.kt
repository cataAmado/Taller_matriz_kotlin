// 8. Leer los elementos de una matriz de N x N y reemplazar todos los números
//negativos por un cero y los positivos por un nueve. Mostrar la matriz
//original y la matriz cambiada. (NO USAR MATRICES NI VECTORES
//AUXILIARES).

fun main() {
    println("Ingrese el tamaño de la matriz (N)")
    val n = readLine()!!.toInt()

    val matrix = Array(n) { IntArray(n) }

    println("Ingrese los valores de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("Posición [$i][$j]: ")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    println("Matriz original:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    println("Matriz cambiada:")
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (matrix[i][j] < 0) {
                matrix[i][j] = 0
            } else if (matrix[i][j] > 0) {
                matrix[i][j] = 9
            }
            print("${matrix[i][j]} ")
        }
        println()
    }
}