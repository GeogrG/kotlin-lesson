fun main()
{
    for1to5()
    evenNums1to10()
    for5to1()
    for10to1()
    for1to9()
    for1to20step3()
    sizeUntil(20)
    squaresFrom1to5()
    reduceValThenPrint()
    from1to5()
    from1to10()
    forWithContinue()
    whileWithContinue()
    multiplicationTable()
    sumFrom1toArg(10)
    factorialOfArg(5)
    sumOfEvenNumsFrom2toArg(10)
    rectangle()
    evenAndOddNumsFrom1toArg(15)
}

fun evenNums1to10()
{
    println("Even Numbers from 1 to 10")
    for (i in 1..10)
    {
        if(i%2 == 0)
        {
            print(i)
            print(" ")
        }
    }
    println()
}

fun for1to5()
{
    println("Numbers from 1 to 5")
    for (i in 1..6)
    {
        print(i)
        print(" ")
    }
    println()
}

fun for5to1()
{
    println("Numbers from 5 to 1")
    for (i in 5 downTo 1) 
    {
        print(i)
        print(" ")
    }
    println()
}

fun for10to1()
{
    println("Numbers from 10 to 1, Step 2")
    for (i in 10 downTo 1 step 2) 
    {
        print(i)
        print(" ")
    }
    println()
}

fun for1to9()
{
    println("Numbers from 1 to 9, Step 2")
    for (i in 1..9 step 2) 
    {
        print(i)
        print(" ")
    }
    println()
}

fun for1to20step3()
{
    println("Numbers from 1 to 20, Step 3")
    for (i in 1..20 step 3) 
    {
        print(i)
        print(" ")
    }
    println()
}

fun sizeUntil(size: Int)
{
    println("Numbers of variable size from 3 to size but not the value of size itself")
    for (i in 3..<size step 2)
    {
        print(i)
        print(" ")
    }
    println()
}

fun squaresFrom1to5()
{
    println("Prints squares of Numbers from 1 to 5")
    var x: Int = 1
    while(x<=5)
    {
        print(x*x)
        print(" ")
        x++
    }
    println()
}

fun reduceValThenPrint()
{
    println("Reduces number from 10 to 5 and then prints")
    var x: Int = 10
    while(x > 5)
    {
        x--
    }
    println(x)
}

fun from1to5()
{
    println("Usint do while reduces a number from 5 to 1 and prints it")
    var x: Int = 5

    do 
    {
        print(x)
        print(" ")
        x--
    } 
    while (x >= 1)

    println()
}

fun from1to10()
{
    println("Usint do while increases a number from 1 to 10 and prints it")
    var x: Int = 1

    do 
    {
        print(x)
        print(" ")
        x++
    } 
    while (x <= 10)

    println()
}

fun forWithContinue()
{
    println("Using continue skips even nums")
    for(i in 1..10)
    {
        if (i%2 == 0)
        {
            continue
        }
        print(i)
        print(" ")
    }
    println()
}

fun whileWithContinue()
{
    println("Using continue skips nums dividable by 3")
    var x: Int = 1
    while(x<=10)
    {
        if(x%3 == 0)
        {
            x++
            continue
        }
        print(x)
        print(" ")
        x++
    }
    println()
}

fun multiplicationTable()
{
    println("Prints multiplication table")
    for(i in 1..10)
    {
        for(j in 1..10)
        {
            print(i * j)
            print(" ")
        }
        println()
    }
    println()
}

fun sumFrom1toArg(arg: Int)
{
    println("Prints sum from 1 to an Argument")
    var sum: Int = 0
    for(i in 1..arg)
    {
        sum += i
    }
    println(sum)
}

fun factorialOfArg(arg: Int)
{
    println("Prints factorial of an argument using while")
    if(arg < 0)
    {
        print("Error")
        return
    }
    var x: Int = arg
    var res: Int = 1
    while(x > 1)
    {
        res *= x
        x--
    }
    print(res)
    println()
}

fun sumOfEvenNumsFrom2toArg(arg: Int)
{
    println("Prints sum of even numbers from 2 to arg")
    if(arg < 2)
    {
        print("Error")
        return
    }
    var res: Int = 0
    var i: Int = 2
    while(i <= arg)
    {
        if(i % 2 == 0)
        {
            res += i
        }
        i++
    }
    print(res)
    println()
}

fun rectangle()
{
    println("Prints a rectangle")
    var i: Int = 1
    var j: Int = 1
    while(i <= 3)
    {
        j = 1
        while(j <= 5)
        {
            print("*")
            j++
        }
        i++
        println()
    }
}

fun evenAndOddNumsFrom1toArg(arg: Int)
{
    println("Prints sum of even and a sum of odd numbers")
    var sumEven: Int = 0
    var sumOdd: Int = 0
    for(i in 1..arg)
    {
        if(i%2 == 0)
        {
            sumEven += i
        }
        else
        {
            sumOdd += i
        }
    }
    println("Sum of even: $sumEven and sum of odd $sumOdd")
}


        