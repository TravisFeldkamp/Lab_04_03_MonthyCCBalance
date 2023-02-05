public class ccBalance {
    public static void main(String[] args) {
    int creditBalance = 5000;
    double interestRate = .17;
    double interestDue;
    double secondMonth;

    interestDue = creditBalance * interestRate ; // multiplyng the balance times interest rate

    secondMonth = interestDue + creditBalance;
    secondMonth = secondMonth * interestRate;
        System.out.println("The interest due after one month is " + interestDue + "$, the interest due after the second month is " + secondMonth +"$." );










    }
}