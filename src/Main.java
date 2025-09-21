public class Main
{
    public static void main(String[] args)
    {
        int initialBalance = 5000; // Starting credit card balance
        double interestRate = .017; // 17% interest rate
        double balanceAfterMonth1 = 0;
        double interestPlusBalance = 0;
        double interestPlusBalance2 = 0;
        double balanceAfterMonth2 = 0;

        balanceAfterMonth1 = initialBalance * interestRate;
        interestPlusBalance = balanceAfterMonth1 + initialBalance;
        balanceAfterMonth2 = interestPlusBalance * interestRate;
        interestPlusBalance2 = balanceAfterMonth2 + interestPlusBalance;

        System.out.println("The interest after month 1 is: " + balanceAfterMonth1);
        System.out.println("The interest plus initial balance : " + interestPlusBalance);
        System.out.println("The interest after month 2 is: " + balanceAfterMonth2);
        System.out.println("The interest plus initial balance after the second month is: " + interestPlusBalance2);

    }

}

