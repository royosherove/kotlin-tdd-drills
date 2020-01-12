@file:Suppress("DuplicatedCode")

import java.util.*
import java.util.Calendar.SATURDAY
import java.util.Calendar.SUNDAY
import java.util.Calendar.DAY_OF_WEEK


class StringCalcWithTime {

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

}
