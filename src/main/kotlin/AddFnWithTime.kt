@file:Suppress("DuplicatedCode")

import java.util.*
import java.util.Calendar.*


//refactor this function so that there is no dependency on real time
//without putting it in a class.
// use a higher order function design to achieve this
fun add(numbers: String): Int {

    val isWeekEnd = when (getInstance().get(DAY_OF_WEEK)){
        SATURDAY, SUNDAY -> true
        else -> false
    }
    if (isWeekEnd){
        return -1
    }

    if (numbers.isEmpty()){
        return 0
    }
    return Integer.parseInt(numbers)
}

