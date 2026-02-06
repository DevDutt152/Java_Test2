package oops;
import java.util.logging.Logger;

public interface BankInterface {
    //whatever  you declare as var they are public static final by default
    public static final Logger logger = Logger.getLogger(BankInterface.class.getName());

    //Ony abstract function are allowed

    abstract void deposit(long ... amoounts);
    abstract void withdraw(long amount);
}
