fun main(args: Array<String>) {
//Данная программа предназначена для вычислений обьёма параллелепипеда
    println("Введите параметры параллелепипеда для дальнейших вычислений обьёма")
    print("Длинна параллелепипеда :")
    val length = readln()
    print("Ширина :")
    val width = readln()
    print("Высота параллелепипеда :")
    val height = readln()
    val result = length.toDouble() * width.toDouble() * height.toDouble()
    print("Объем параллепипеда равен $result")
}