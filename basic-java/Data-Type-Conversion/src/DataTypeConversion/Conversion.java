package DataTypeConversion;

/**
 *
 * @author tevin
 */
public class Conversion {

    public static void main(String[] args) {
        String number = "12345678";
        int convertedNumber = Integer.parseInt(number);
        double convertedDouble = Double.parseDouble(number);
        int x = 3456789;
        String convertedString = String.valueOf(x);
    }
}
