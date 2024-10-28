import java.util.Scanner
import kotlin.random.Random
fun main() {
    val oyin = Oyin()
    oyin.boshlash()
}

class Oyin {
fun boshlash() {
    val input = Scanner(System.`in`)
    val tasodifiyraqam = Random.nextInt(1, 10)
    var topildi = false

    println("Tasodifiy sonni toping (1 dan 10 gacha):")

    while (!topildi) {
        val urinish = input.nextInt()
        when {
            urinish < tasodifiyraqam -> println("Yuqoriroq")
            urinish > tasodifiyraqam -> println("Pastroq")
            else -> {
                println("Tabriklaymiz! Siz topdingiz va 100 ming so`mga ega boldingiz😁😁😁😁😁🤩🤩🤩😎😛😜😜😜bu albatta xazil!")
                topildi = true
            }
        }
    }
}
}


