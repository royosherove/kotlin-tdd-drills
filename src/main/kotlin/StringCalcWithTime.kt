import java.util.*


class StringCalcWithTime {
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

}
