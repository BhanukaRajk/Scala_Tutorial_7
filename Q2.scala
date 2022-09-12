class Rational(x: Int, y: Int) {
    def Numerator = x;
    def Denominator = y;
    require(Denominator != 0, "Denominator must be a positive number");

    // negation method
    def sub(temp: Rational) = {
        if(this.Denominator == temp.Denominator)
            // If the denominators are equal
            Rational((this.Numerator-temp.Numerator), this.Denominator);
        else
            // If the denominators are not equal
            Rational((this.Numerator * temp.Denominator) - (temp.Numerator * this.Denominator), (this.Denominator * temp.Denominator));
    }

    def total() = {
        println(this.Numerator+"/"+this.Denominator);
    }

}


object Q2{
    def main(args: Array[String]):Unit = {
        // Rational numbers
        val x = new Rational(3, 4);
        val y = new Rational(5, 8);
        val z = new Rational(2, 7);

        val temp1 = x sub y;
        val temp2 = temp1 sub z;


        // Print rational numbers (negation)
        temp2.total();
    }
    
}