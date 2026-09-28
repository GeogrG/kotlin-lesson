fun main()
{
    ifContainsReplace("Удача")
    extractDate("2021-12-01 09:48:23")
    hideCardNum("4539 1488 0343 6467")
    replaceAtAndDot("username@example.com")
    fileName("C:/Пользователи/Документы/report.txt")
    encoding("Котлин лучший язык программирования")
}

fun ifContainsReplace(str: String)
{
    if (str.contains("невозможно"))
        println(str.replace("невозможно", "совершенно точно возможно, просто требует времени"))

    if(str.startsWith("Я не уверен"))
        println(str + " но моя интуиция говорит об обратном")

    if(str.contains("катастрофа"))
        println(str.replace("катастрофа", "интересное событие"))

    if(str.endsWith("без проблем"))
        println(str.replace("без проблем","с парой интересных вызовов на пути"))

    if (str.isNotEmpty() && !str.any { it.isWhitespace() }) 
        println("Иногда " + str + ", но не всегда")

    
}

fun extractDate(str: String)
{
    println("Date is: " + str.substring(0,10)+ " Time is: " + str.substring(11, str.length))
}

fun hideCardNum(str: String)
{
    val res = "*".repeat(str.length - 4) + str.takeLast(4)
    println(res)
}

fun replaceAtAndDot(str: String)
{
    var res: String = str
    if (str.contains("@"))
    {
        res.replace("@", " [at] ")
    }

    if(str.contains("."))
    {
        res.replace(".", " [dot] ")
    }
}

fun fileName(str: String)
{
    var res: String = str.substringAfterLast("/")
    println(res)
}

fun encoding(str: String)
{
    val temp = str.split(" ")
    var res: String = ""
    for ( s in temp)
    {
        res += s[0].toString()
    }
    println(res.uppercase())
}
