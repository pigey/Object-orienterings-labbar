package se.filip;

public class Circle {
    private int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    
    public double area(){
        return 3.14 * Math.sqrt(radius);
    }
    public double circomference(){
        return radius*2 *(3.14);
    }
}
