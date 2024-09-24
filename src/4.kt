
// 4. Lea N x M números (N y M deben ser leídos y validados) y almacénelos en
//una matriz (por filas), y:
//a) Señale si la matriz es cuadrada
//b) Determine y muestre el promedio de los N x M números
//c) Determine y muestre el promedio por fila
//d) Determine y muestre el promedio por columna

fun main() {
    println("Ejercicio 4")

    var rows: Int
    var columns: Int

    // Leer y validar N (filas)
    do {
        println("Ingrese el número de filas (N)")
        rows = readLine()!!.toInt()
        if (rows <= 0) {
            println("El número de filas debe ser mayor que 0. Intente de nuevo.")
        }
    } while (rows <= 0)

    // Leer y validar M (columnas)
    do {
        println("Ingrese el número de columnas (M)")
        columns = readLine()!!.toInt()
        if (columns <= 0) {
            println("El número de columnas debe ser mayor que 0. Intente de nuevo.")
        }
    } while (columns <= 0)

    val matrix = Array(rows) { IntArray(columns) }

    // Leer los valores de la matriz
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            println("Ingrese el valor de la matriz en la posición $i,$j")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    // a) Señalar si la matriz es cuadrada
    if (rows == columns) {
        println("La matriz es cuadrada.")
    } else {
        println("La matriz no es cuadrada.")
    }

    // b) Determinar y mostrar el promedio de los N x M números
    var sum = 0
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum += matrix[i][j]
        }
    }
    val totalElements = rows * columns
    val average = sum.toDouble() / totalElements
    println("El promedio de los números en la matriz es: $average")

    // c) Determinar y mostrar el promedio por fila
    println("Promedio por fila:")
    for (i in 0 until rows) {
        var rowSum = 0
        for (j in 0 until columns) {
            rowSum += matrix[i][j]
        }
        val rowAverage = rowSum.toDouble() / columns
        println("Fila $i: $rowAverage")
    }

    // d) Determinar y mostrar el promedio por columna
    println("Promedio por columna:")
    for (j in 0 until columns) {
        var colSum = 0
        for (i in 0 until rows) {
            colSum += matrix[i][j]
        }
        val colAverage = colSum.toDouble() / rows
        println("Columna $j: $colAverage")
    }
}