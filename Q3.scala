class Account(var amount: Float) {

    // transfer method
    def transfer(benifiter: Account, payment: Float) = {
        this.amount = this.amount - payment;
        benifiter.amount = benifiter.amount + payment;
    }

    // display account balance
    def balance(): Float = {
        return this.amount
    }

}


object Q3{
    def main(args: Array[String]):Unit = {

        // Rational numbers
        var ACC1 = new Account(100000);
        var ACC2 = new Account(40000);

        // Display initial account balance
        println("Account-1 initial balance: " + ACC1.balance());
        println("Account-2 initial balance: " + ACC2.balance());

        // Transfer 20000 from ACC1 to ACC2
        ACC1.transfer(ACC2, 20000);

        // Display new account balance
        println("\nAccount-1 new balance: " + ACC1.balance());
        println("Account-2 new balance: " + ACC2.balance());
    }
    
}