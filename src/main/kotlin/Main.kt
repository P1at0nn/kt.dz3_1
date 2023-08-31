fun main(args: Array<String>) {

    val Timeago: Int = 41 * 60
    val Timeagoin = Timeago / 60
    val Timeagoin60 = Timeago / 60 / 60

//такие значения как 3, 4 минуты и 31, 41, 51 минуту назад.
    var agoToText = when (Timeago) {
        60 -> println("был(а) 1 минуту назад")
        in 120..60 * 4 -> println("был(а) $Timeagoin минуты назад")
        21 * 60 -> println("был(а) 21 минуту назад")
        31 * 60 -> println("был(а) 31 минуту назад")
        41 * 60 -> println("был(а) 41 минуту назад")
        51 * 60 -> println("был(а) 51 минуту назад")
        in 60 * 22..60 * 24 -> println("был(а) $Timeagoin минуты назад")
        in 60 * 32..60 * 34 -> println("был(а) $Timeagoin минуты назад")
        in 60 * 42..60 * 44 -> println("был(а) $Timeagoin минуты назад")
        in 60 * 52..60 * 54 -> println("был(а) $Timeagoin минуты назад")


        in 60 * 60..60 * 60 * 2 - 1 -> println("был(а) $Timeagoin60 час назад")
        in 60 * 60 * 2..60 * 60 * 5 - 1 -> println("был(а) $Timeagoin60 часа назад")
        in 60 * 60 * 21..60 * 60 * 22 - 1 -> println("был(а) $Timeagoin60 час назад")
        in 60 * 60 * 22..60 * 60 * 24 -> println("был(а) $Timeagoin60 часа назад")


        in 0..60 -> println("был(а) только что ")
        in 61..60 * 60 -> println("был(а) $Timeagoin минут назад")
        in 60 * 60 + 1..24 * 60 * 60 -> println(" был(а)$Timeagoin60 часов назад")
        in 24 * 60 * 60 + 1..24 * 60 * 60 * 2 -> println("был(а) вчера ")
        in 24 * 60 * 60 * 2 + 1..24 * 60 * 60 * 3 -> println("был(а) позавчера ")
        in 24 * 60 * 60 * 3 + 1..24 * 60 * 60 * 60 * 60 -> println("был(а) давно ")
        else -> println("данные не коректны")
    }
}
