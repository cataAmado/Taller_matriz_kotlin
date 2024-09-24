// 6. Lea dos matrices de orden N x M y
//a) genere una tercera con la suma de ambas
//b) genere una tercera con la multiplicación de ambas, si es posible.
//Para cada caso anterior, muestre la matriz resultante.

fun main() {
    println("Ingrese el número de filas (N)")
    val rows = readLine()!!.toInt()

    println("Ingrese el número de columnas (M)")
    val columns = readLine()!!.toInt()

    val matrix1 = Array(rows) { IntArray(columns) }
    val matrix2 = Array(rows) { IntArray(columns) }

    println("Ingrese los valores de la primera matriz:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("Posición [$i][$j]: ")
            matrix1[i][j] = readLine()!!.toInt()
        }
    }

    println("Ingrese los valores de la segunda matriz:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("Posición [$i][$j]: ")
            matrix2[i][j] = readLine()!!.toInt()
        }
    }

    // a) Generar una tercera matriz con la suma de ambas
    val sumMatrix = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }

    println("Matriz resultante de la suma:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${sumMatrix[i][j]} ")
        }
        println()
    }

    // b) Generar una tercera matriz con la multiplicación de ambas, si es posible
    if (rows == columns) {
        val productMatrix = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                productMatrix[i][j] = 0
                for (k in 0 until columns) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j]
                }
            }
        }

        println("Matriz resultante de la multiplicación:")
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                print("${productMatrix[i][j]} ")
            }
            println()
        }
    } else {
        println("La multiplicación de matrices no es posible ya que no son cuadradas.")
    }
}