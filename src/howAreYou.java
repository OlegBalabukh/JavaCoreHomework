import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class howAreYou {

    public static boolean isAlpha(String name) {
        return !name.matches("[a-z A-Z]+");
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String answer = "";
        boolean is_not_a_word = true;

        while (is_not_a_word) {
            System.out.println("How are you?");
            try {
                answer = br.readLine();
                is_not_a_word = isAlpha(answer);
            } catch (IOException e) {
                System.out.println("EEEE");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("bad input");
            }
        }

        System.out.println("You are " + answer + ".");
    }
}



