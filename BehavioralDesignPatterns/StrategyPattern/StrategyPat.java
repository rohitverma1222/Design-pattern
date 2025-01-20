package BehavioralDesignPatterns.StrategyPattern;

interface PaymentStrategy{
    void processPayment();
}

class paymentService{
    private PaymentStrategy paymentStrategy;

    public void setPaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.processPayment(); //polymorphic behavior
    }
}

class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Credit Card");
    }
}

class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Payment processed using Debit Card");
    }
}

public class StrategyPat {
    public static void main(String[] args) {
        paymentService paymentService=new paymentService();
        paymentService.setPaymentService(new CreditCard());
        paymentService.pay();

        paymentService.setPaymentService(new DebitCard());
        paymentService.pay();
    }
}
