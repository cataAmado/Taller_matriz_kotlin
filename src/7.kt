// 7. Lea una matriz de N x M y a continuación:
//a) Elimine la fila x (x se debe leer y validar).
//b) Elimine la columna y (y se debe leer y validar).
//c) Inserte una nueva fila en x (x se debe leer y validar).
//d) Inserte una nueva columna en y (y se debe leer y validar).

fun main() {
    println("Ingrese el número de filas (N)")
    val rows = readLine()!!.toInt()

    println("Ingrese el número de columnas (M)")
    val columns = readLine()!!.toInt()

    val matrix = Array(rows) { IntArray(columns) }

    println("Ingrese los valores de la matriz:")
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            print("Posición [$i][$j]: ")
            matrix[i][j] = readLine()!!.toInt()
        }
    }

    // a) Eliminar la fila x
    var x: Int
    do {
        println("Ingrese el índice de la fila a eliminar (0 a ${rows - 1})")
        x = readLine()!!.toInt()
    } while (x < 0 || x >= rows)

    val matrixWithoutRow = matrix.filterIndexed { index, _ -> index != x }.toTypedArray()

    println("Matriz sin la fila $x:")
    for (row in matrixWithoutRow) {
        println(row.joinToString(" "))
    }

    // b) Eliminar la columna y
    var y: Int
    do {
        println("Ingrese el índice de la columna a eliminar (0 a ${columns - 1})")
        y = readLine()!!.toInt()
    } while (y < 0 || y >= columns)

    val matrixWithoutColumn = matrixWithoutRow.map { row -> row.filterIndexed { index, _ -> index != y }.toIntArray() }.toTypedArray()

    println("Matriz sin la columna $y:")
    for (row in matrixWithoutColumn) {
        println(row.joinToString(" "))
    }

    // c) Insertar una nueva fila en x
    do {
        println("Ingrese el índice donde insertar la nueva fila (0 a ${matrixWithoutColumn.size})")
        x = readLine()!!.toInt()
    } while (x < 0 || x > matrixWithoutColumn.size)

    val newRow = IntArray(matrixWithoutColumn[0].size) {
        print("Ingrese el valor para la posición [$x][${it}]: ")
        readLine()!!.toInt()
    }

    val matrixWithNewRow = matrixWithoutColumn.toMutableList().apply { add(x, newRow) }.toTypedArray()

    println("Matriz con la nueva fila en $x:")
    for (row in matrixWithNewRow) {
        println(row.joinToString(" "))
    }

    // d) Insertar una nueva columna en y
    do {
        println("Ingrese el índice donde insertar la nueva columna (0 a ${matrixWithNewRow[0].size})")
        y = readLine()!!.toInt()
    } while (y < 0 || y > matrixWithNewRow[0].size)

    val newColumn = IntArray(matrixWithNewRow.size) {
        print("Ingrese el valor para la posición [${it}][$y]: ")
        readLine()!!.toInt()
    }

    val matrixWithNewColumn = matrixWithNewRow.mapIndexed { rowIndex, row ->
        row.toMutableList().apply { add(y, newColumn[rowIndex]) }.toIntArray()
    }.toTypedArray()

    println("Matriz con la nueva columna en $y:")
    for (row in matrixWithNewColumn) {
        println(row.joinToString(" "))
    }
}