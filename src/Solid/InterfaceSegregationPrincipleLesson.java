package Solid;

// NO CLIENT SHOULD BE FORCED TO DEPEND ON METHODS IT DOES NOT USE
// MAKE FINE GRAINED INTERFACES THAT ARE CLIENT SPECIFIC
/*
// BAD
public class InterfaceSegregationPrincipleLesson {
    public static void main(String[] args) {
        IWorker iWorker = new Waiter();
        iWorker.work();
        iWorker.eat();
        iWorker.work();
    }
}

interface IWorker {
    void work();
    void eat();
}

class Waiter implements IWorker {
    @Override
    public void work() {
        System.out.println("deliver food");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}

class Barmen implements IWorker {
    @Override
    public void work() { System.out.println("make drinks");}

    @Override
    public void eat() {}
}
*/

// GOOD
public class InterfaceSegregationPrincipleLesson {
    public static void main(String[] args) {
        IWorker iWorker = new Waiter();
        iWorker.work();
        iWorker.eat();
        iWorker.work();

        Worker worker = new Barmen();
        worker.work();
    }
}

interface Worker {
    void  work();
}
interface Eater {
    void eat();
}

interface IWorker extends Worker, Eater {
    void work();
    void eat();
}

class Waiter implements IWorker {
    @Override
    public void work() {
        System.out.println("delivers food");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }
}

class Barmen implements Worker {
    @Override
    public void work() { System.out.println("makes drinks"); }
}