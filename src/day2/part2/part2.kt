package day2.part2

import java.io.File

private const val pathName = "src/day2/input.txt"

fun main() {
    var inputList: MutableList<String> = File(pathName).readLines().toMutableList()
    var horizontalPosition = 0
    var depth = 0
    var aim = 0

    inputList.forEach {
        var strArr: List<String> = it.split(" ")
        val direction = strArr.first()
        val x = strArr.last().toInt()

        when (direction) {
            "forward" -> {
                horizontalPosition += x
                depth += (aim * x)
            }
            "down" -> aim += x
            "up" -> aim -= x
        }
    }

    println(horizontalPosition)
    println(depth)
    print(horizontalPosition * depth)
}