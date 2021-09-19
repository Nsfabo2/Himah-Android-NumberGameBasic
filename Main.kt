fun main(){
    val secret_number = 8
    print("Guess a number between 0 and 10: ")
    try{
        val user_Guess = readLine()!!.toInt()
        //Bonus
        if (user_Guess>10){
         println("please guess a number between 0 and 10")
        }else
        if (user_Guess == secret_number){
            println("You got it! we have a winner")
        }else{
            println("Wrong guess... The answer was 8!")
        }
        println("Game over")
    }catch (e: Exception){
        print("something isn't correct please enter a number")
    }

}