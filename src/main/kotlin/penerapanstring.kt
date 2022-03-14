//Penerapan String
//Berikut program untuk mencari huruf konsonan, huruf vocal dan karakter lainnya(selain huruf
//konsonan dan vocal) dalam sebuah String.
fun main(args: Array<String>) {
    // Character occurrence in a sentence analysis
    // the string that we want to analyze
    var s = "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash and Reapet"
    println(s)
    s = s.toLowerCase()
    // counters initialization
    var vowelCount = 0
    var consonantCount = 0
    // definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"
    // main loop
    for (c in s) {
        if (vowels.contains(c)) {
            vowelCount++
        } else if (consonants.contains(c)) {
            consonantCount++
        }
    }
    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}
