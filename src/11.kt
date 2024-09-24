//Diseñar un programa que lea información referente a las horas trabajadas
//en cada día de la semana por los empleados de la empresa "La Huelga
//S.A.", y las almacene en una matriz. Por cada empleado se tienen los
//siguientes datos: Código del empleado(entero en el rango [1..100]), Horas
//trabajadas en horario normal, Horas trabajadas en sobre tiempo. La
//empresa paga un sueldo de $ 2.350 bruto por hora normal y $ 3.500 por
//hora de sobre tiempo. Emitir un informe en el cual por cada empleado se
//imprima: código del empleado, cantidad de horas normales trabajadas, $
//por horas normales, cantidad de horas de sobre tiempo trabajadas, $ por
//horas de sobre tiempo y total $ del empleado.

fun main() {
    println("Ingrese el número de empleados")
    val numEmployees = readLine()!!.toInt()

    val employees = Array(numEmployees) { IntArray(3) }

    // Leer los datos de cada empleado
    for (i in 0 until numEmployees) {
        println("Ingrese los datos del empleado ${i + 1}:")
        print("Código del empleado (1..100): ")
        employees[i][0] = readLine()!!.toInt()
        print("Horas trabajadas en horario normal: ")
        employees[i][1] = readLine()!!.toInt()
        print("Horas trabajadas en sobre tiempo: ")
        employees[i][2] = readLine()!!.toInt()
    }

    // Emitir el informe
    val normalRate = 2350
    val overtimeRate = 3500

    println("\nInforme de empleados:")
    for (i in 0 until numEmployees) {
        val code = employees[i][0]
        val normalHours = employees[i][1]
        val overtimeHours = employees[i][2]
        val normalPay = normalHours * normalRate
        val overtimePay = overtimeHours * overtimeRate
        val totalPay = normalPay + overtimePay

        println("Código del empleado: $code")
        println("Horas normales trabajadas: $normalHours")
        println("Pago por horas normales: $$normalPay")
        println("Horas de sobre tiempo trabajadas: $overtimeHours")
        println("Pago por horas de sobre tiempo: $$overtimePay")
        println("Total a pagar: $$totalPay")
        println()
    }
}