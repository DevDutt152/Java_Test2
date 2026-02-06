package test;

abstract class PaymentSystem {
    abstract void pay(double amount);
}
class CreditCardPayment extends PaymentSystem {

    @Override
    void pay(double amount) {
        System.out.println("amount :  " + amount);
    }
}
class UPIPayment extends PaymentSystem{
    @Override
    void pay(double amount) {
        System.out.println("amount : " + amount);
    }
}
 class Payment {
    public static void main(String[] args) {
        PaymentSystem p1 = new CreditCardPayment();
        PaymentSystem p2 = new UPIPayment();
        p1.pay(1500.50);
        p2.pay(750.25);
    }
}
