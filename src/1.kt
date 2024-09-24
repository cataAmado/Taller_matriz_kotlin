// 1. Leer una matriz A de orden M x N y un número K. Multiplicar todos los
//elementos de la matriz por el número K. Mostrar la matriz resultante

fun main() {
    println("Ejercicio 1")

    println("Ingrese el numero de filas")
    val rows = readLine()!!.toInt()

    println("Ingrese el numero de columnas")
    val columns = readLine()!!.toInt()

    println("Ingrese el valor de K")
    val k = readLine()!!.toInt()

    val matrix = Array(rows) { IntArray(columns) }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Ingrese el valor de la matriz en la posición $i,$j")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    println("Matriz original")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    println("Matriz multiplicada por $k")

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            matrix[i][j] *= k
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}