import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Person_homework_2_1 {
    private String name;
    private int birthYear;

    // - - - - getters - - - - - //
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }

    public Person_homework_2_1() {
    }

    public Person_homework_2_1(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    //  - - - - methods - - - - //
    public int getAge() {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        if (year - birthYear == 2018) {
            return 0;
        }
        return year - birthYear;
    }

    public void inputInfo() {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        boolean is_not_a_name = true;
        while (is_not_a_name) {
            System.out.println("Enter person's name:");
            try {
                name = br.readLine();
                is_not_a_name = howAreYou.isAlpha(name);
            } catch (IOException e) {
                System.out.println("bad input (IOException), try again:");
            } catch (Exception e) {
                System.out.println("bad input, try again:");
            }
        }

        boolean is_not_int = true;
        while (is_not_int) {
            System.out.println("Enter person's birthYear:");
            try {
                birthYear = homework_1_3.stringToInt(br.readLine());
                is_not_int = false;
            } catch (Exception e) {
                System.out.println("bad input, try again:");
            }
        }
    }

    public String outputInfo() {
        return "Person [name = " + name +
                ", birthYear = " + birthYear +
                ", age = " + getAge() + "]";
    }

    @Override
    public String toString() {
        return "Person [  name = " + name +
                ", birthYear = " + birthYear +
                ", age = " + getAge() + " ]";
    }

    public String changeName(String newName) {
        return this.name = newName;
    }
}

class Person {
    public static void main(String[] args) {

        Person_homework_2_1 person1 = new Person_homework_2_1();
        Person_homework_2_1 person2 = new Person_homework_2_1();
        Person_homework_2_1 person3 = new Person_homework_2_1();
        Person_homework_2_1 person4 = new Person_homework_2_1();
        Person_homework_2_1 person5 = new Person_homework_2_1();
        person1.inputInfo();
        person2.inputInfo();
        person3.inputInfo();
        person4.inputInfo();
        person5.inputInfo();
/*
        System.out.println(person1.outputInfo());
        System.out.println(person2.outputInfo());
        System.out.println(person3.outputInfo());
        System.out.println(person4.outputInfo());
        System.out.println(person5.outputInfo());
*/
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
    }
}
