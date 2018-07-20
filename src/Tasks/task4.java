package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String input = "";

        boolean bad_input = true;
        while (bad_input) {
            System.out.println("Enter the number of the day of the week:");
            try {
                input = br.readLine();
                bad_input = false;
            } catch (IOException e) {
                System.out.println("bad input (IOException), try again:");
            } catch (Exception e) {
                System.out.println("bad input, try again:");
            }
        }

        switch (input.toLowerCase()) {
            case "1":
                System.out.print("Monday - " + "Montag - " + "Понеділок");
                break;
            case "2":
                System.out.print("Tuesday - " + "Dienstag - " + "Вівторок");
                break;
            case "3":
                System.out.print("Wednesday - " + "Mittwoch - " + "Середа");
                break;
            case "4":
                System.out.print("Thursday - " + "Donnerstag - " + "Четвер");
                break;
            case "5":
                System.out.print("Friday - " + "Freitag - " + "П'ятниця");
                break;
            case "6":
                System.out.print("Saturday - " + "Samstag - " + "Субота");
                break;
            case "7":
                System.out.print("Sunday - " + "Sonntag - " + "Неділя");
                break;
            default:
                System.out.print("Next time enter an integer between '1' and '7'");
        }
    }
}
