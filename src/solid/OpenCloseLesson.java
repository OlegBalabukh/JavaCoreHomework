package solid;

// SOFTWARE ENTITIES (CLASSES, MODULES, FUNCTIONS, ETC.) SHOULD BE OPEN FOR EXTENSION BUT CLOSE FOR MODIFICATION

// BAD
/*
public class OpenCloseLesson {
    public static void main(String[] args) {

        //Toyota toyota = new Toyota();
       // workInTaxi(toyota);

        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static  void workInTaxi(Toyota toyota) {
        if (toyota instanceof Celica) {
            toyota.getPassenger();
        } else {
            toyota.getPassengers();
        }

    }
}

class Toyota {
    void getPassengers() {
        System.out.println("get passengers");
    }
    void getPassenger() {
        System.out.println("get one passenger");
    }
}

class Celica extends Toyota {

}
*/

// GOOD (use interfaces)
// class OpenCloseLesson is open for extension but closed for modification
public class OpenCloseLesson {
    public static void main(String[] args) {
        //Toyota toyota = new Toyota();
        Celica celica = new Celica();
        //workInTaxi(toyota);
        workInTaxi(celica);
    }
    static  void workInTaxi(Car car) {
        car.workInTaxi();
    }
}

interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    @Override
    public void workInTaxi() {
        getPassengers();
    }

    void getPassengers() {
        System.out.println("get passengers");
    }
}

class Celica extends Toyota {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    void getPassenger() {
        System.out.println("get one passenger");
    }
}



