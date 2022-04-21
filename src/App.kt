import java.awt.Choice

fun main(args: Array<String>){
    val options = arrayOf("Rock","Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice =getUserChoice(options)
    val result =printResult(userChoice,gameChoice)

}
fun getGameChoice(optionsParam:Array<String>)=optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        println("Please enter one of the following: Rock Paper Scissors.")
        for (item in optionsParam)  print(" $item ")
        val userInput = readLine()
        if(userInput!=null && userInput in optionsParam){
            isValidChoice =true
            userChoice=userInput
        }
        if(!isValidChoice) println("You must enter valid choice ")
    }
    return userChoice
}

fun printResult(userChoice:String,gameChoice: String){
    val Result:String
    if(userChoice==gameChoice) Result ="Tie!"
    else if((userChoice=="Rock"&&gameChoice=="Scissors")||
            (userChoice=="Paper"&&gameChoice=="Rock")||
            (userChoice=="Scissor" && gameChoice=="Rock"))
        Result="You win!"
    else
        Result="You loose!"
    println("Computer chose $userChoice.I chouse $gameChoice.$Result")
}