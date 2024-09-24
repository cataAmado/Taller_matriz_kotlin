
// 3. Leer una matriz X de orden A x B y hallar su transpuesta. Mostrar ambas
//matrices.
fun main() {
    println("Ejercicio 3")

    println("Ingrese el número de filas (A)")
    val rows = readLine()!!.toInt()

    println("Ingrese el número de columnas (B)")
    val columns = readLine()!!.toInt()

    val matrix = Array(rows) { IntArray(columns) }
    val transpose = Array(columns) { IntArray(rows) }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Ingrese el valor de la matriz en la posición $i,$j")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transpose[j][i] = matrix[i][j]
        }
    }

    println("Matriz original:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("${matrix[i][j]} ")
        }
        println()
    }

    println("Matriz transpuesta:")
    for (i in 0 until columns) {
        for (j in 0 until rows) {
            print("${transpose[i][j]} ")
        }
        println()
    }
}