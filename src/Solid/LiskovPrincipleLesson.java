package Solid;

// DERIVED CLASSES MUST BE SUBSTITUTABLE FOR THEIR BASE CLASSES
/*
WHEN WE CREATE OUR CLASSES USING INHERITANCE, WE MUST NOT CHANGE
FUNCTIONALITY AND DESIRABLY PARAMETERS OF OUR PARENT CLASSES.
 */

/*
// BAD
public class LiskovPrincipleLesson {
    // Factory method
    static Rectangle getRect() {
        //return new Rectangle(); // 50
        return new Square();      // 25, parent changed his behavior, not good
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getSquare());
    }
}

class Rectangle {
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare() {
        return width * height;
    }
}

class Square extends Rectangle {
    public void setWidth(int width) {
        this.width = width;
        height = width;
    }
    public void setHeight(int height) {
        this.height = height;
        width = height;
    }
}
*/

// GOOD
public class LiskovPrincipleLesson {
    // Factory methods
    static Rectangle getNewRect() {
        return new Rectangle();
    }
    static Square getNewSquare() {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getNewRect();
        rectangle.setHeight(10);
        rectangle.setWidth(5);

        Square square = getNewSquare();
        square.setWidth(4);

        System.out.println(rectangle.getSquare());
        System.out.println(square.getSquare());
    }
}

interface Shape {
    int getSquare();
}

class Rectangle implements Shape {
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getSquare() {
        return width * height;
    }
}

class Square implements Shape {
    int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getSquare() {
        return width * width;
    }
}
