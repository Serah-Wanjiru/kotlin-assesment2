fun main() {
    var currentAccount=CurrentAccount("serah2004","Serah Mburu",500000.0)
    currentAccount.deposit(50000.0)
    var c=(currentAccount.balance)
    println(c)
    currentAccount.withdraw(40000.0)
    var x=(currentAccount.balance)
    println(x)
    currentAccount.details()
    multiples()
    var y=name("serah")
    println(y)
    var savingsAccount=SavingsAccount("wanjiru123","Liz Mburu",500000.0,30000)
    savingsAccount.withdrawals(3)
    var t=(savingsAccount.withdrawals(20000))
    println(t)
    var n=checkpassword("123456789")










}
fun name(naame:String):Char{
    return naame[0]
    return naame[4]

}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun checkpassword(password:Int):String{
    if (password>=8)
        return "true"
    }





//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples(){
    for (i in 1..100){
        if (i%6==0 && i%8==0){
            println("Bingo")
        }
        else if (i%6 ==0){
            println(i)
        }
        else if (i%8 ==0){
            println(i)
        }


    }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        println(amount)
        balance+=amount

    }
    fun withdraw(amount:Double){
        println(amount)
        balance-=amount
    }
    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
class SavingsAccount( accountNumber:String, accountName:String,balance:Double,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
     fun withdrawals(times:Int){
         println(times)
        if (times <=4){
            withdrawals+=withdrawals


        }
    }



}



