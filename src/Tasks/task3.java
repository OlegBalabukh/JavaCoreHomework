package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {

        int integer;
        int index = 0;
        int counter = 0;
        int array[] = new int[3];

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        boolean is_not_an_int = true;
        while (is_not_an_int) {
            System.out.println("Enter an integer:");
            try {
                integer = stringToInt(br.readLine());
                if (integer % 2 != 0) {
                    counter++;
                }
                array[index] = integer;
                index++;
                if (index == 3) {
                    is_not_an_int = false;

                }

            } catch (IOException e) {
                System.out.println("bad input (IOException), try again:");
            } catch (Exception e) {
                System.out.println("bad input, try again:");
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Quantity of odd numbers is: " + counter);

    }

    public static int stringToInt(String value) {
        return Integer.parseInt(value);
    }
}
