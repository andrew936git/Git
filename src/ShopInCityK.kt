class ShopInCityK(
    private var allSum: Int
) : ISellingPhones {
    private val dataBase = mutableMapOf(
        PhonePriceInCityK.MODEL1.value to 0,
        PhonePriceInCityK.MODEL2.value to 0,
        PhonePriceInCityK.MODEL3.value to 0,
        PhonePriceInCityK.MODEL4.value to 0,
        PhonePriceInCityK.MODEL5.value to 0
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
            1 -> PhonePriceInCityK.MODEL1.value
            2 -> PhonePriceInCityK.MODEL2.value
            3 -> PhonePriceInCityK.MODEL3.value
            4 -> PhonePriceInCityK.MODEL4.value
            5 -> PhonePriceInCityK.MODEL5.value
            else -> "Error"
        }
    }

    override fun buyingPhone(name: String): String {
        var sum = 0
        var text = ""
        when (name) {
            PhonePriceInCityK.MODEL1.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityK.MODEL1.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum """.trimMargin()
            }

            PhonePriceInCityK.MODEL2.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityK.MODEL2.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum """.trimMargin()
            }

            PhonePriceInCityK.MODEL3.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityK.MODEL3.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum """.trimMargin()
            }

            PhonePriceInCityK.MODEL4.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityK.MODEL4.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
                text = """Вы выбрали $name,
                    | сумма покупки = $sum """.trimMargin()
            }

            PhonePriceInCityK.MODEL5.value -> {
                val count = dataBase[name]
                sum = PhonePriceInCityK.MODEL5.price
                allSum += sum
                if (count != null) {
                    dataBase[name] = count + 1
                }
            }

            else -> text = "Такого телефона не существует!"
        }

        return text
    }


}
