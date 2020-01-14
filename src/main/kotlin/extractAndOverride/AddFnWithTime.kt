@file:Suppress("DuplicatedCode")

package extractAndOverride

import java.util.*
import java.util.Calendar.*


//refactor this function so that there is no dependency on real time
//without putting it in a class.
// use a higher order function design to achieve this
fun add(numbers: String): Int? {
    val isWeekend = when (Calendar.getInstance().get(DAY_OF_WEEK)){
        SATURDAY, SUNDAY   -> true
        else               -> false
    }
    return when {
        isWeekend          -> null
        numbers.isEmpty()  -> 0
        else               -> Integer.parseInt(numbers)
    }
}

