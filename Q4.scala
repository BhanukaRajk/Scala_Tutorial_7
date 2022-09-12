class Account(AccNo: Int, var balance: Float) {
    def interest() = {
        if(this.balance >= 0)
            this.balance = this.balance * 1.05f
        else
            this.balance = this.balance * 1.10f
    }

    def filterNegotives() = {
        if(this.balance < 0)
            println("\nAccount No: " + this.AccNo + "\nBalance: Rs." + balance)
    }

    def showbalance() = {
        println("Account No: " + this.AccNo + "\nBalance: Rs." + balance)
    }

    override def toString =  "Account No: " + AccNo +" --> Balance: Rs.   " + balance + "\n   "

}



object Q4{

    var AccountList: List[Account] = List();

    def AddAccount(count: Int): Unit = {
        var i = 0
        for(i <- 1 to count){
            print("\nEnter the Account No: ")
            var AccountNo = scala.io.StdIn.readInt()

            print("Enter the account balance: Rs. ")
            var Amount = scala.io.StdIn.readFloat()

            val ACC = new Account(AccountNo, Amount)

            AccountList = AccountList:::ACC::Nil

        }

    }

    def Total = AccountList.map(_.balance).sum
    //def Total = AccountList.foldLeft(0.0)(_ + _.balance)
    

    def main(args: Array[String]):Unit = {

        print("Enter the number of accounts in the bank: ")
        val quantity = scala.io.StdIn.readInt()

        AddAccount(quantity)

        println("\n\n")
        println(AccountList)

        println("\n\nList of accounts have balance less than 0:")
        AccountList.map(_.filterNegotives())

        printf("\n\nTotal balance exclusive interest: Rs.%.2f", Total)
        AccountList.map(_.interest())

        printf("\nTotal balance inclusive interest: Rs.%.2f\n", Total)

    }
    
}