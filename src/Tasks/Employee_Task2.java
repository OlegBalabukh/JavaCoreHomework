package Tasks;
public class Employee_Task2 {
    private  String name;
    private double rate;
    private int hours;
    static double totalSum = 0;

    // - - - - getters - - - - - //

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    // - - - - setters - - - - - //

    public String setName(String newName) {
        return this.name = newName;
    }

    public double setRate(double newRate) {
        return this.rate = newRate;
    }

    public int setHours(int newHours) {
        return this.hours = newHours;
    }

    public double totalSum() {
        return totalSum += this.salary();
    }

    // - - - - constructors - - - - - //
    public Employee_Task2() {
    }

    public Employee_Task2(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee_Task2(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    //  - - - - methods - - - - //
    public double salary() {
        return Math.round(rate * hours);
    }

    public void changeRate(double newRate) {
        rate = newRate;
    }

    public double bonuses() {
        return Math.round(rate * hours * 0.1);
    }

    @Override
    public String toString() {
        return "Employee [name = " + name +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + this.salary() +
                ", bonuses = " + this.bonuses() +
                ", totalSum = " + this.totalSum() + "]";
    }
}


