package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class task5 {

    public enum Continent {
        EUROPE, ASIA, AFRICA, SOUTH_AMERICA
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String country = "";
        Continent continent;

        boolean bad_input = true;
        while (bad_input) {
            System.out.println("Enter the name of the country: ");
            try {
                country = br.readLine();
                bad_input = false;
            } catch (IOException e) {
                System.out.println("bad input (IOException), try again:");
            } catch (Exception e) {
                System.out.println("bad input, try again:");
            }
        }

        switch (country) {
            case "Germany": case "Ukraine": case "France": case "Italy":
                continent = Continent.EUROPE;
                System.out.println(continent);
                break;
            case "China": case "India": case "Pakistan": case "Nepal":
                continent = Continent.ASIA;
                System.out.println(continent);
                break;
            case "Egypt": case "Sudan": case "Livia": case "Morocco":
                continent = Continent.AFRICA;
                System.out.println(continent);
                break;
            case "Brazil": case "Peru": case "Argentina": case "Uruguay":
                continent = Continent.SOUTH_AMERICA;
                System.out.println(continent);
                break;
            default:
                System.out.println("No such country in database");
        }
    }
}
