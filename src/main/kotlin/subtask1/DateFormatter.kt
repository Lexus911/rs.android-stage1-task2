package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.format.ResolverStyle
import java.util.*

class DateFormatter {

       fun toTextDay(day: String, month: String, year: String): String {
        val a = "${year}-${month}-${day}"
        val format = DateTimeFormatter.ofPattern("uuuu-M-dd").withResolverStyle(ResolverStyle.STRICT)

       try {
           val date = LocalDate.parse(a, format)
           val dayofw = date.dayOfWeek.toString().toLowerCase()
           if(dayofw == "monday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, понедельник" }
           if(dayofw == "tuesday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, вторник" }
           if(dayofw == "wednesday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, среда" }
           if(dayofw == "thursday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, четверг" }
           if(dayofw == "friday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, пятница" }
           if(dayofw == "saturday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, суббота" }
           if(dayofw == "sunday"){return "${date.format(DateTimeFormatter.ofPattern("dd MMMM"))}, воскресенье" }
           else
               return ""
       }
       catch (e: DateTimeParseException){
           return "Такого дня не существует"
       }
    }
}
