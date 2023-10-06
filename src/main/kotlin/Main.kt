fun main() {
    val likes = 111
    val people: String = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    print("Понравилось $likes $people")
}