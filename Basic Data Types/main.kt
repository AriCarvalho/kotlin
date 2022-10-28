
fun main(){
    val defaultNumber = 0	//Int
    val defaultNumberSep = 1_000_000
    val defaultNumberHex = 0x0F
    val defaultNumberBin = 0b00001011
    val byteNumber :Byte = 1
    val shortNumber :Short = 2
    val intNumber :Int = 3
    val longNumber = 4L
    val longNumber2 :Long = 4
    val longNumber3 = 123.5e10
    
    val d = defaultNumber.toDouble()
    
    val defaultFloatNumber = 0.0 //Double
    val floatNumber :Float = 0.0f //ATENCAO
    val floatNumber2 = 0.0f
    val doubleNumber :Double = 0.0
    
    var i = defaultFloatNumber.toInt()
    
    val trueVal = true
    val falseVal: Boolean = false
    
    val c = defaultNumber.toChar()
    
    val defaultCharVal = 'a'
    val charVal :Char = 'b' //ATENCAO
    val defaultStringVal = "abc"
    val stringVal :String = "ABC"
    
    println(defaultCharVal is Char)

}
