package testcase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static testcase.LoanType.*;

/**
 * Created by Sergey on 02-Apr-17.
 */
public class User {

    List<Object> goods;

    public User(){
        goods = new ArrayList<>();
        goods.add(new Object());
    }

    public static int staticVal = 0;
    public int val = 0;

    public static void staticMethod() {
        System.out.println(staticVal);
    }

    public void method() {
        System.out.println(val);
    }

    public List<LoanType> accounts = new ArrayList<>();

    public int getTotalCount() {
        int i = 0;
        for (LoanType loanType : accounts) {
            if (isIgnorable(loanType)) {
                i++;
            }
        }
        return i;
    }

    public int getLoanTypeCount() {
        int i = 0;
        Set<LoanType> set = new HashSet<>();
        for (LoanType loanType : accounts) {
            if (isIgnorable(loanType) && set.add(loanType)) {
                i++;
            }
        }
        return i;
    }

    private boolean isIgnorable(LoanType loanType) {
        return !loanType.equals(LoanType.Uknown) && !loanType.equals(Collections);
    }

    public void printGrade() {
        if (getTotalCount() > 20 || getLoanTypeCount() >= 4) {
            System.out.print("A");
        } else if (getTotalCount() > 10 || getLoanTypeCount() == 3) {
            System.out.print("B");
        } else if (getTotalCount() >= 5 || getLoanTypeCount() == 2) {
            System.out.print("C");
        } else if (getTotalCount() > 0 || getLoanTypeCount() == 1) {
            System.out.print("D");
        } else {
            System.out.print("null");
        }
    }
}
