public class Circle {
    private double radius;

       // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Getters
    public double getRadius(){
        return this.radius;
    }
    // The 2 methods
    public double area(){
        return 3.14*(radius*radius);
    }
    public double circumference(){
        return (2*3.14*radius);
    }	
}
