package testcase;

import java.util.Random;

/**
 * Created by Sergey on 02-Apr-17.
 */
public enum LoanType {
    Uknown,
    Collections,
    HomeLoan,
    Heloc,
    CreditCard,
    CarLoan;

    public int getRandom(){
        return new Random().nextInt(20);
    }
}
