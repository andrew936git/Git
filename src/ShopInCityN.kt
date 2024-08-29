import kotlinx.coroutines.delay

class ShopInCityN(
    var allSum: Int
) : ISellingPhones {
    val dataBase = mutableMapOf(
        PhonePriceInCityN.MODEL1.value to 0,
        PhonePriceInCityN.MODEL2.value to 0,
        PhonePriceInCityN.MODEL3.value to 0,
        PhonePriceInCityN.MODEL4.value to 0,
        PhonePriceInCityN.MODEL5.value to 0
    )

    override fun choicePhone(): String {
        println(
            """Выберите телефон который хотите купить:
            |1 - ${PhonePriceInCityK.MODEL1.value} цена = ${PhonePriceInCityK.MODEL1.price}
            |2 - ${PhonePriceInCityK.MODEL2.value} цена = ${PhonePriceInCityK.MODEL2.price}
            |3 - ${PhonePriceInCityK.MODEL3.value} цена = ${PhonePriceInCityK.MODEL3.price}
            |4 - ${PhonePriceInCityK.MODEL4.value} цена = ${PhonePriceInCityK.MODEL4.price}
            |5 - ${PhonePriceInCityK.MODEL5.value} цена = ${PhonePriceInCityK.MODEL5.price}
        """.trimMargin()
        )
        val choice = readln().toInt()

        return when (choice) {
            1 -> PhonePriceInCityN.MODEL1.value
            2 -> PhonePriceInCityN.MODEL2.value
            3 -> PhonePriceInCityN.MODEL3.value
            4 -> PhonePriceInCityN.MODEL4.value
            5 -> PhonePriceInCityN.MODEL5.value
            else -> "Error"
        }
    }

    override suspend fun buyingPhone(name: String){
        val sum: Int
        var text = ""
        when (name) {
            PhonePriceInCityN.MODEL1.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityN.MODEL1.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum р. """.trimMargin()
            }

            PhonePriceInCityN.MODEL2.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityN.MODEL2.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum р.""".trimMargin()
            }

            PhonePriceInCityN.MODEL3.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityN.MODEL3.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum р.""".trimMargin()
            }

            PhonePriceInCityN.MODEL4.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityN.MODEL4.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum р.""".trimMargin()
            }

            PhonePriceInCityN.MODEL5.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityN.MODEL5.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum р.""".trimMargin()
            }

            else -> text = "Такого телефона не существует!"
        }
        println(text)
        delay(1000L)
    }

    override suspend fun salesStatistics(){
        println("""Общая сумма продажи телефонов = $allSum р.
                |кол-во проданых телефонов:
                |${PhonePriceInCityK.MODEL1.value} - ${dataBase[PhonePriceInCityK.MODEL1.value]}шт.
                |${PhonePriceInCityK.MODEL2.value} - ${dataBase[PhonePriceInCityK.MODEL2.value]}шт.
                |${PhonePriceInCityK.MODEL3.value} - ${dataBase[PhonePriceInCityK.MODEL3.value]}шт.
                |${PhonePriceInCityK.MODEL4.value} - ${dataBase[PhonePriceInCityK.MODEL4.value]}шт.
                |${PhonePriceInCityK.MODEL5.value} - ${dataBase[PhonePriceInCityK.MODEL5.value]}шт.
            """.trimMargin())
        delay(5000L)
    }
}