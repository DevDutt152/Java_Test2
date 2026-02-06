package oops;
import java.util.Arrays;
public class Interface {
    public static void main(String[] args){

        BankInterface ac4 = new BankInterface(){
            public void deposit(long ... amounts){
                System.out.println("depositing :" + Arrays.toString(amounts));
            }
            public void withdraw(long amount){
                System.out.println("Withdrawing :"+amount );
            }

        };
        ac4.withdraw(1000);
        ac4.deposit(1000,2000);
    }
}
