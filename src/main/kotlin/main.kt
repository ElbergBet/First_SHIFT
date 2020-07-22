fun main () {

    val city = getCity()
    val temperature = getTemperature()
    println("В городе $city сейчас " +getInf(temperature))
}
private fun getCity(): String {
    println("Введите название города")
    return readLine()?: throw error("Вводите название города буквами!")
}
private fun getTemperature(): Int{
    println("Сколько градусов на улице?")
    return readLine()?.toIntOrNull() ?:throw error ("Введите температуру как число ")
}
fun getInf(temperature: Int): String{
    return when (temperature) {
        in -50..15 -> "холодно."
        in 15..25 -> "нормально."
        in 25..50 -> "жарко."
        else -> "катастрофа!"
    }

}