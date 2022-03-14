/*
    Konversi Eksplisit
Setiap Number di Kotlin mendukung konversi secara eksplisit seperti :
 toByte(): konversi ke Byte
 toShort():konversi ke Short
 toInt():konversi ke Int
 toLong():konversi ke Long
 toFloat():konversi ke Float
 toDouble():konversi ke Double
 toChar():konversi ke Char
Berikut contoh kode penerapan konversi secara eksplisit:
 */
fun main(args: Array<String>) {
    val a: Int = 10000
    println("a apakah identik dengan a atau a === a : " + (a === a))
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA ===
            anotherBoxedA))
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : "
            + (boxedA == anotherBoxedA))
}
