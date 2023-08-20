public class Main {
    public static void main(String[] args) {

        //create an object of class circle
        Circle circle= new Circle("Circle",5);
        System.out.println("Area of: "+circle.name+ ": "+ circle.calculateArea());
        //create an object of class rectangle
        Rectangle rectangle= new Rectangle("Rectangle",4,6);
        System.out.println("Area of: "+rectangle.name+ ": "+ rectangle.calculateArea());
        //create an object of class traingle
        Triangle triangle= new Triangle("Triangle ",3,8);
        System.out.println("Area of "+triangle.name +": "+ triangle.calculateArea());

    }
}