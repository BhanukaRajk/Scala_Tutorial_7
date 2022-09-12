class Rational(x: Int, y: Int) {
    def Numerator = x;
    def Denominator = y;
    require(Denominator != 0, "Denominator must be none zero");

    // negation method
    def neg() = {
        if(this.Denominator>0)
            // Constructor #1
            Rational(-(this.Numerator), this.Denominator);
        else
            // Constructor #2
            Rational(this.Numerator, -(this.Denominator));
    }

    override def toString: String = this.Numerator+"/"+this.Denominator

}


object Q1{
    def main(args: Array[String]):Unit = {
        // Rational numbers
        var num1 = new Rational(1, 2);
        var num2 = new Rational(3, -4);
        var num3 = new Rational(-7, -8);
        var num4 = new Rational(-5, 6);

        // Print rational numbers (negation)
        println(num1.neg());
        println(num2.neg());
        println(num3.neg());
        println(num4.neg());
    }
    
}