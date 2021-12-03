package day1.part1

import java.io.File

private const val pathName = "src/day1/input.txt"

fun main() {
    var inputList: MutableList<Int> = mutableListOf()
    File(pathName).forEachLine { inputList.add(it.toInt()) }

    var count = 0

    inputList.forEachIndexed { index, i ->
        if (index != 0 && i > inputList[index-1]) count +=1
    }

    print(count)
}