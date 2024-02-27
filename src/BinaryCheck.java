import java.util.Scanner;

public class BinaryCheck {
    public static boolean isBinary(int n) {
        while (n != 0) {
            System.out.println(n%10);
            int digit = n % 10;
            System.out.println("digit: "+digit);
            if (digit != 0 && digit != 1) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 1050110;
        if (isBinary(number)) {
            System.out.println(number + " consists only  binary values.");
        } else {
            System.out.println(number + " consists non binary values.");
        }
    }
}
