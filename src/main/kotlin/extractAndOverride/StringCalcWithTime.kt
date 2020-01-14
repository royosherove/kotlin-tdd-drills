@file:Suppress("DuplicatedCode")

package extractAndOverride

import java.util.*
import java.util.Calendar.SATURDAY
import java.util.Calendar.SUNDAY
import java.util.Calendar.DAY_OF_WEEK


open class StringCalcWithTime {

    //refactor this function so that there is no dependency on real time
    // use Extract & Override
     fun add(numbers: String): Int? {
         val isWeekend = when (getCurrentDay()){
             SATURDAY, SUNDAY   -> true
             else               -> false
         }
         return when {
             isWeekend          -> null
             numbers.isEmpty()  -> 0
             else               -> Integer.parseInt(numbers)
         }

     }

    internal open fun getCurrentDay() = Calendar.getInstance().get(DAY_OF_WEEK)

}
