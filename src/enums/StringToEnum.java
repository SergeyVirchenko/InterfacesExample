package enums;

/**
 * Created by Sergey on 03-Apr-17.
 */
public class StringToEnum {
    private enum Currency {
        USD,
        AUD,
        GBP,
        EURO}

    public static void main(String args[]) {

        //Converting String to Enum in Java
        String usd = "USD";

        //Enum to String using Enum.valueOf()
        Enum currency = Enum.valueOf(Currency.class, usd);

        //Enum to String using Currency.valueOf()
        currency = Currency.valueOf(usd);

        System.out.println("String to Enum Example : " + currency);

        //This Enum to String conversion will throw Exception
        String INR = "INR";
        //java.lang.IllegalArgumentException: No enum const class
        Currency rupee = Currency.valueOf("INR");
    }

}
