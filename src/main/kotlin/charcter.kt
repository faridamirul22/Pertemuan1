/*
 Character (Char)
Karakter di Kotlin ditandai dengan memberikan single quotes pada nilai sebuah variabel.
Karakter di Kotlin tidak bisa diperlakukan secara langsung sebagai Number.

Seperti di Java kita juga bisa menggunaka escape karakter seperti \t, \b, \n, \r, \", \", \\, dan \$.
Jika diperlukan kita juga bisa melakukan encode apapun karakter lainnya dengan menggunakan
Unicode sintak contohnya (\uFF00).
Character di Kotlin adalah sebagai objek yang memiliki fungsi anggota seperti isLowerCase(),
isDigit(),toUpperCase(), toLowerCase(), toString() dan lainnya.
Contoh kode program penggunaan fungsi anggota dari Character:

 */
fun main(args: Array<String>) {
    var charA : Char = 'A'
    //println(charA == 65)
    println(charA.isUpperCase())
    println(charA.isLowerCase())
    println(charA.isDigit())
    println(charA.toLowerCase())
    val strA: String = charA.toString()
    println("Kini charA sudah menjadi String = "+strA)
}


