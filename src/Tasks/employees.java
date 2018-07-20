package Tasks;

public class employees {
    public static void main(String[] args) {
        String name1 = "Oleg";
        double rate1 = 15.70;
        int hours1 = 9;
        Employee_Task2 employee1 = new Employee_Task2(name1, rate1, hours1);

        String name2 = "Greg";
        double rate2 = 20.90;
        int hours2 = 12;
        Employee_Task2 employee2 = new Employee_Task2(name2, rate2, hours2);

        String name3 = "Mike";
        double rate3 = 25.50;
        int hours3 = 16;
        Employee_Task2 employee3 = new Employee_Task2(name3, rate3, hours3);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee3.totalSum);
        System.out.println(employee1.totalSum);




    }
}
