package day1.part2

import java.io.File

private const val pathName = "src/day1/input.txt"

fun main() {
    var inputList: MutableList<Int> = mutableListOf()
    File(pathName).forEachLine { inputList.add(it.toInt()) }

    var count = 0
    inputList.forEachIndexed { index, _ ->
        if (index < inputList.size-3) {
            val currentWindow = sum(inputList, index)
            val nextWindow = sum(inputList, index + 1)

            if(nextWindow > currentWindow) count +=1
        }
    }
    print(count)
}

fun sum(inputList: List<Int>, index: Int) : Int {
    return inputList[index] + inputList[index + 1] + inputList[index+2]
}