package Solid;

// DEPEND ON ABSTRACTIONS, NOT ON DETAILS
// A. HIGH-LEVEL MODULES SHOULD NOT DEPEND ON LOW-LEVEL MODULES. BOTH SHOULD DEPEND ON ABSTRACTIONS.
// B. ABSTRACTIONS SHOULD NOT DEPEND ON DETAILS. DETAILS SHOULD DEPEND ON ABSTRACTIONS.

public class DependencyInversionPrincipleLesson {
    public static void main(String[] args) {
        System.out.println();

    }
}

// BAD
/*
class DataAccess {
    void execute() {
        System.out.println("execute");
    }
}

class Client {
    DataAccess dataAccess = new DataAccess();
    void doJob() {
        dataAccess.execute();
    }
}
*/

// GOOD

interface DAO {
    void execute();
}

class DataAccess {
    void execute() {
        System.out.println("execute");
    }
}

class Client {
    DAO dataAccess = new DataAccess();
    void doJob() {
        dataAccess.execute();
    }
}
