package testcase;

import java.util.ArrayList;
import java.util.List;

import static testcase.LoanType.*;

/**
 * Created by Sergey on 02-Apr-17.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.val = 1;
        User.staticVal = 2;
        user.method();
        User.staticMethod();

        User user2 = new User();
        user2.val = 3;
        User.staticVal = 4;
        user2.method();
        User.staticMethod();
    }
}
