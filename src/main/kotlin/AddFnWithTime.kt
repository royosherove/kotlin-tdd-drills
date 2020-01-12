@file:Suppress("DuplicatedCode")

import java.util.*


//refactor this function so that there is no dependency on real time
//without putting it in a class.
// use a higher order function design to achieve this
fun add(numbers: String): Int {

    val isWeekEnd = when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        Calendar.SUNDAY,
        Calendar.SATURDAY -> true

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

