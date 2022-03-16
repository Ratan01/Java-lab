import java.util.*;

public class Increasing {
    public static boolean checkNumber(int number) {
        boolean increasing = false;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            int nextLastDigit = number % 10;
            if (nextLastDigit <= lastDigit) {
                increasing = true;
            } else {
                increasing = false;
                break;
            }
        }
        return increasing;
    }

    public static void main(String[] args) {
        int number;
        boolean increasingNumber = false;
        Scanner scr = new Scanner(System.in);
        number = scr.nextInt();
        increasingNumber = checkNumber(number);
        System.out.println(increasingNumber);
        scr.close();
    }
}
