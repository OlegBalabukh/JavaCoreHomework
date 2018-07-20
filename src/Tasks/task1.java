package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task1 {

    public static int stringToInt(String value) {
        return Integer.parseInt(value);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );


        int a = 0;
        boolean a_not_read = true;
        while (a_not_read) {
            System.out.println("Enter number a:");
            try {
                String a_value = br.readLine();
                a = stringToInt(a_value);
                a_not_read = false;
            } catch (IOException e) {
                System.out.println("EEEE");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("bad input a");
            }
        }

        int b = 0;
        boolean b_not_read = true;
        while (b_not_read) {
            System.out.println("Enter number b:");
            try {
                b = Integer.parseInt(br.readLine());
                b_not_read = false;
            } catch (Exception e) {
                System.out.println("bad input b");
            }
        }

        System.out.println("Sum of a and b is " + (a + b));
        System.out.println("Subtraction of a and b is " + (a - b));
        System.out.println("Multiplication of a and b is " + (a * b));
        System.out.println("Division of a and b is " + (a / b));
    }
}
