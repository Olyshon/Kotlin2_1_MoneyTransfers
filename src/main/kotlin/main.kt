fun main() {
    print("Введите сумму для перевода(в коп):")
    val sumInn: String = readLine() ?: return
    val amount: Int = sumInn.toInt()
    val minFee: Int = 35_00
    val fee: Int =  if (amount*0.0075 < minFee) minFee else (amount*0.0075).toInt()
    println("Комиссия за перевод составит $fee коп")
}