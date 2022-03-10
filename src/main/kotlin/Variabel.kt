/*
 Variabel
Variabel adalah sebuah tempat/wadah didalam memori komputer untuk menyimpan data seperti
data nama pengguna, kata sandi, data waktu, jumlah makanan dan lain-lain sebagainya.
secara otomatis compiler Kotlin akan mengenali bahwa variabel
dynamicVar bertipe Int, hal ini identik dengan gaya bahasa pemrograman PHP dan Ruby.
Sebaliknya tipe system yang statis mengharuskan kita mendeklarasikan jenis tipe data tertentu
dalam sebuah variabel dan tipe data tersebut tidak bisa diubah selama program dieksekusi.
Contoh kode program:

 */
fun main(args: Array<String>) {
    var dynamicVar = 2
    println("Contoh dynamic variabel = " + dynamicVar)
    var staticVar: Char = 'A'
    println("Contoh static variabel = " + staticVar)
}