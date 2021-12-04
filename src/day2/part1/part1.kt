package day2.part1

import java.io.File

private const val pathName = "src/day2/input.txt"

fun main() {
    var inputList: MutableList<String> = File(pathName).readLines().toMutableList()
    var horizontalPosition = 0
    var depth = 0

    inputList.forEach {
        var strArr: List<String> = it.split(" ")

        when {
            strArr.first() == "forward" -> horizontalPosition += strArr.last().toInt()
            strArr.first() == "down" -> depth += strArr.last().toInt()
            strArr.first() == "up" -> depth -= strArr.last().toInt()
        }
    }

    print(horizontalPosition * depth)
}