fun iniciarArray(arr: IntArray): IntArray {
    var devuelta = IntArray(arr.size)
    for (i in 0..arr.size - 1){
        devuelta[i] = 2*i + arr.size
    }
    return devuelta
}

fun crearMatriz(arr1: IntArray, arr2: IntArray): Array<IntArray>{
    var mayor: Int = 0
    if(arr1.size>arr2.size){ mayor = arr1.size }
    else mayor = arr2.size
    var matriz = Array(2){IntArray(mayor)}
        for(i in 0..arr1.size-1){
            matriz[0][i] = arr1[i]
        }
        for(i in 0..arr2.size-1){
            matriz[1][i] = arr2[i]
        }
    return matriz
    }

fun imprimirArray(arr: IntArray, num: Int){
    print("El array $num es: ")
    for (i in 0..arr.size-1){
        print("${arr[i]}, ")
    }
    println()
}
fun imprimirMatriz(matriz: Array<IntArray>, num1: Int, num2: Int){
    var mayor: Int = 0
    if(num1>num2){mayor = num1}
    else mayor = num2
        println("La matriz es: ")
        for(j in 0..matriz.size-1){
        for(i in 0..mayor-1){
            print("${matriz[j][i]}, ")
        }
            println()
    }
    println()
}
fun main() {
    println("Introduce posiciones array1: ")
    var array1 = IntArray(readLine()?.toInt()?: 0)
    println("Introduce posiciones array2: ")
    var array2 = IntArray(readLine()?.toInt()?: 0)
    array1 = iniciarArray(array1)
    array2 = iniciarArray(array2)
    val matriz = crearMatriz(array1, array2)
    val posiciones1 = array1.size
    val posiciones2 = array2.size
    imprimirArray(array1, 1)
    imprimirArray(array2, 2)
    imprimirMatriz(matriz, posiciones1, posiciones2)
}