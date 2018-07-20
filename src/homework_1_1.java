import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework_1_1 {

    public static int stringToInt(String value) {
        return Integer.parseInt(value);
    }

    public static double flowerBedPerimeter(int value) {
        return  2 * 3.14 * value;
    }

    public static double flowerBedArea(int value) {
        return 3.14 * value * value;
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int radius;
        double perimeter = 0;
        double area = 0;
        boolean a_not_read = true;
        while (a_not_read) {
            System.out.println("Enter radius:");
            try {
                String radius_value = br.readLine();
                radius = stringToInt(radius_value);
                perimeter = flowerBedPerimeter(radius);
                area = flowerBedArea(radius);
                a_not_read = false;
            } catch (IOException e) {
                System.out.println("EEEE");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("bad input radius");
            }
        }

        System.out.println("Perimeter of flower bed is: " + perimeter);
        System.out.println("Area of flower bed is: " + area);


    }
}