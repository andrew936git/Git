interface ISellingPhones {
    fun choicePhone(): String
    suspend fun buyingPhone(name: String)
    suspend fun salesStatistics()
}