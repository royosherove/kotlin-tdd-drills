
class StringCalcWithStatics {
     fun add(numbers: String): Int {
        if (numbers.isEmpty()){
            StaticLogger.Instance.write("0")
            return 0
        }
         val parsed  = Integer.parseInt(numbers)
         StaticLogger.Instance.write(parsed.toString())

         return parsed
    }
}
