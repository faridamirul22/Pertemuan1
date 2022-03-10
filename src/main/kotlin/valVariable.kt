/*
    Val Variable
     kata kunci val digunakan untuk mendeklarasikan
variabel konstan yang nilainya tidak akan berubah selama program dieksekusi. Variabel dengan
kata kunci val hanya bisa diberikan nilai sekali saja ketika program dijalankan, untuk assigned
value yang kedua dan selanjutnya maka variabel dengan kata kunci val tersebut akan diangap
suatu kesalahan oleh compiler.

 */

// contoh Program Val Variable

fun main() {
    var varVariable: Int
    varVariable = 56 // penugasan value pertama ke varVariable
    println("Pemberian nilai pertama pada varVariable = $varVariable")
    varVariable = 78 // pemberian nilai kedua ke varVariable
    println("Pemberian nilai kedua pada varVAriable")
    val phi = 3.14
    phi = 2.5 // ketika nilai val phi di ubah untuk kedua kalinya maka akan terdapat pesan kesalahan agar kita menggunakan var variable

}