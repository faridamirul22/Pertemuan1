//
//String (Array of Character)
//String merupakan array dari karakter dan bersifat immutable (bersifat statis). Elemen suatu
//String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.
//Contoh kode program mengakses elemen String:
fun main(args: Array<String>) {
    val myName: String = "M. Farid Amiru"
    for(chr in myName){
        print(chr)
    }
    print('\n')
}