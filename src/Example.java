import Tasks.Employee_Task2;

import java.util.EnumSet;
import java.util.Set;

public class Example {
    int age;

    public enum TestEnum{
        BLUE, YELLOW, RED
    }

    Example(int age) {
        this.age = age;
    }


    int getSomething2() {
        return this.age;
    }

    static int getSomethng(Example example) {
        return example.age;
    }

    public static void main(String[] args) {
        Employee_Task2 employee = new Employee_Task2("name", 14);
        System.out.println(employee.toString());
        System.out.println("My first program");
        System.out.println("My first program" + " is completed");
        String s1 = "111";
        String s2 = "111";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s2 = "fs";
//        System.out.println(String.m);

        Example example = new Example(25);
        System.out.println(getSomethng(example));
        System.out.println(example.getSomething2());

        Set<TestEnum> s = EnumSet.of(TestEnum.BLUE, TestEnum.RED);

        System.out.println(s);


    }
}
