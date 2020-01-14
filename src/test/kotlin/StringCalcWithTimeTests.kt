import extractAndOverride.StringCalcWithTime
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import java.util.*

class TestableStringCalcWithTime() : StringCalcWithTime() {
    var fakeDay:Int = 0

    override fun getCurrentDay(): Int {
        return fakeDay
    }
}
class StringCalcWithTimeTests {
    @Test
    fun `add on a weekend, returns null`(){
        val calc = TestableStringCalcWithTime()
        calc.fakeDay = Calendar.SUNDAY

        val ANY_INPUT = ""
        val result = calc.add(ANY_INPUT)

        assertNull(result)
    }
}
