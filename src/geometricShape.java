abstract class geometricShape {
    protected String name;

    //generated constructor

    public geometricShape(String name) {
        this.name = name;
    }
    abstract double calculateArea();
}

//create classes

class Circle extends geometricShape{
    private double radius;
    public Circle(String name, double radius){
        super(name);
        this.radius=radius;
    }

    @Override
    //calculate Circle Area
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends geometricShape{
    private double widgth;
    private double height;

    public Rectangle(String name, double widgth, double height) {
        super(name);
        this.widgth = widgth;
        this.height = height;
    }

    @Override
        //calculate Rectangle Area
    double calculateArea() {
        return widgth*height;
    }
}
class Triangle extends geometricShape{
    private double base;
    private double height;

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
        //calculate Triangle Area
    double calculateArea() {
        return 0.5* base*height;
    }
}



