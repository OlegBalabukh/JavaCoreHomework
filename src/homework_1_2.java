import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_1_2 {
    public static void main(String[] args) {
        String name = "";
        String address =  "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        boolean invalid_name = true;
        while (invalid_name) {
            System.out.println("What is your name?");
            try {
                name = br.readLine();
                invalid_name = false;
            } catch (IOException e) {
                System.out.println("EEEE");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("bad input a");
            }
        }

        boolean invalid_address = true;
        while (invalid_address) {
            System.out.println("Where do you live, " + name + "?");
            try {
                address = br.readLine();
                invalid_address = false;
            } catch (IOException e) {
                System.out.println("EEEE");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("bad input a");
            }
        }

        System.out.println("Your name is " + name + ". " + "Your address is: " + address + ".");
    }
}
