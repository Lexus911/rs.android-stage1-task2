package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val hours = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve")
        val minutes = arrayOf("one", "two", "three", "four","five","six","seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine")
        val a = hour.toInt()
        val b = minute.toInt()

        if (b == 0){return "${hours[a]} o' clock"}
        if (b == 15){return "quarter past ${hours[a]}"}
        if (b == 30){return "half past ${hours[a]}"}
        if (b == 40){return "twenty minutes to ${hours[a + 1 ]}"}
        if (b == 45){return "quarter to ${hours[a + 1]}"}
        if (b in 1..30){return "${minutes[b -1]} minutes past ${hours[a]}"}
        if (b in 31..60) {return "${minutes[60 - b - 1]} minutes to ${hours[a + 1]}"}
        else
            return ""

    }

}
