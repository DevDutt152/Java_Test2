package oops;
import java.util.logging.Logger;

public class BankAccount {

    String name;
    long bal;
    long accNo;
    String ifscCode;
    AccountType accountType;

    Logger logger = Logger.getLogger(BankAccount.class.getName());

    public BankAccount(String name, long bal, long accNo, String ifscCode, AccountType accountType) {
        this.name = name;
        this.bal = 1000L;
        this.accNo = accNo;
        this.ifscCode = ifscCode;
        this.accountType = accountType;
    }

    boolean deposit(long... amount) {
        for (long amt : amount) {
            if (amt <= 0) {
                logger.warning("invalid ammount");
            } else
                bal = bal + amt;
        }

        logger.info("new balance is" + bal);

        return false;
    }

        void withdraw (long amount){
        if(amount > 0){
            if(bal >= amount){
                bal -= amount;
            }
        }else{
            logger.warning("invalid amount");
        }  
        }


    }
