//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
suspend fun main() {
    val shopInCityN = ShopInCityN(0)
    val shopInCityK = ShopInCityK(0)
    do{
        println("""Здраствуйте! 
            |В каком городе вы находитесь: 
            |1.CityN
            |2.CityK 
            |0.Выход""".trimMargin())
        val i = readln().toInt()
        when(i){
            1 -> {
                println(
                    """1.Купить телефон
                |2.Просмотр статистики
            """.trimMargin()
                )
                val numOfMenu = readln().toInt()
                if (numOfMenu == 1) shopInCityN.buyingPhone(shopInCityN.choicePhone())
                else if (numOfMenu == 2) {
                    shopInCityN.salesStatistics()
                }
            }
            2 -> {
                println(
                    """1.Купить телефон
                |2.Просмотр статистики
                |3.Ремонт телефона
            """.trimMargin()
                )
                val numOfMenu = readln().toInt()
                when (numOfMenu) {
                    1 -> shopInCityK.buyingPhone(shopInCityK.choicePhone())
                    2 -> {
                        shopInCityK.salesStatistics()
                    }
                    3 -> shopInCityK.serviceCenter()
                }
            }
        }
    }while (i != 0)

    println("До свидания!")
}
enum class PhonePriceInCityN(val value: String, val price: Int){
    MODEL1("Apple iPhone SE 2024 64Gb", 31450),
    MODEL2("Apple iPhone 15 Pro 512Gb", 125515),
    MODEL3("Xiaomi Redmi A3 64Gb", 6999),
    MODEL4("HONOR X8a 128Gb", 19069),
    MODEL5("Samsung Galaxy S24 Ultra 1024Gb", 115000)
}

enum class PhonePriceInCityK(val value: String, val price: Int){
    MODEL1("Apple iPhone SE 2024 64Gb", 30450),
    MODEL2("Apple iPhone 15 Pro 512Gb", 126515),
    MODEL3("Xiaomi Redmi A3 64Gb", 7199),
    MODEL4("HONOR X8a 128Gb", 19869),
    MODEL5("Samsung Galaxy S24 Ultra 1024Gb", 118000)
}
