import java.io.FileWriter

class OopLg() : ProgLg() {
    private var inh : Inheritance ? = null

    constructor(str: String) : this() {
        InData(str)
    }

    override fun InData(str: String) {
        inh = when (str.split(' ')[2]) {
            "0" -> Inheritance.SINGLE
            "1" -> Inheritance.PLURAL
            "2" -> Inheritance.INTERFACE
            else -> null
        }
        creationYear = str.split(' ')[1]
    }

    override fun OutData(fileOut: FileWriter) = fileOut.write("Language type: OOP\nYear creation: $creationYear\nInheritance: $inh\n\n")
}
