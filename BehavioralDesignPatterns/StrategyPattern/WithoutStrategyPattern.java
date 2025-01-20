package BehavioralDesignPatterns.StrategyPattern;

class paymentStrategy {
    public void pay(String paymentMethod) {
        if(paymentMethod=="CreditCard")
            System.out.println("Payment done using Credit Card");
        else if(paymentMethod=="DebitCard")
            System.out.println("Payment done using Debit Card");
        else if(paymentMethod=="NetBanking")
            System.out.println("Payment done using Net Banking");
        else
            System.out.println("Invalid Payment Method");


        // In case of UPI payment method is not available so we have
        // to modify the which is already written and tested code
        // which is not a good practice and break the
        // Open-Closed Principle
    }
}
public class WithoutStrategyPattern {
    public static void main(String[] args) {

    }
}
