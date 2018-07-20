import Tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class whatIsYourName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        int dd = task1.stringToInt("11");
        System.out.println("Hello! What is yor name?");
        String name = br.readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}
