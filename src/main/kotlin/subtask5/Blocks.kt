package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        if (blockB == Int::class) {
            val intResult = blockA.filterIsInstance<Int>()
            return intResult.sum()
        }

        if (blockB == String::class) {
            val stringResult = blockA.filterIsInstance<String>()
            return stringResult.joinToString("")
        }
        if(blockB == LocalDate::class){
            val dateResult = blockA.filterIsInstance<LocalDate>().max()
            return dateResult?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(Locale("ru")))!!
        }
        return ""
 }
}
