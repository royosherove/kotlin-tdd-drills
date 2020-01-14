
class StringCalcWithLogger {
     fun add(numbers: String): Int {
        if (numbers.isEmpty()){
            //TODO 1: write the result to a logger here
            return 0
        }
         val parsed  = Integer.parseInt(numbers)
         //TODO 2: write the result to a logger here
         return parsed
    }
}
