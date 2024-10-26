fun main() {
    val array = Array(5) { IntArray(5) }

    println("Введите 25 целых чисел для массива 5x5:")
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            print("Элемент [$i][$j]: ")
            array[i][j] = readLine()!!.toInt()
        }
    }

    var a = true
    for (i in 0 until 5) {
        for (j in 0 until 5) {
            if (array[i][j] != array[j][i]) {
                a = false
                break
            }
        }
        if (!a) break
    }
    if (a) {
        println("Массив симметричен относительно главной диагонали.")
    } else {
        println("Массив не симметричен относительно главной диагонали.")
    }
}