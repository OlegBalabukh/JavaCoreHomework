package solid;

// A CLASS SHOULD HAVE ONLY ONE REASON TO CHANGE

public class SingleResponsibilityLesson {

    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.cleanFloor();
        employeeFacade.cook();
    }

}

// BAD

//class Employee {
//    int getSalary() {return 10;}
//    void cook() {};
//    void cleanFloor() {};
//    void DeliverFood() {};
//}

// GOOD

class Employee {
    int getSalary() {return 10;}
}

class Cook extends Employee {
    void cook() {};
}

class Janitor extends Employee {
    void cleanFloor() {};
}

// if each child class has different salary we can use interface
interface someEmployee {
    int getSalary();
}

class someCook implements someEmployee {
    @Override
    public int getSalary() {
        return 0;
    }

    void cook() {};
}

class someJanitor implements someEmployee {
    @Override
    public int getSalary() {
        return 10;
    }

    void cleanFloor() {};
}

// or we can use pattern Facade
class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();

    void cook() {
        cook.cook();
    }

    void cleanFloor() {
        janitor.cleanFloor();
    }

}








