package se.filip;

public class Lab3 {
    public void run(){
        Circle circle = new Circle(10);
        double area = circle.area();
        double omkrets = circle.circomference();
        System.out.println("Arean är:" + area);
        System.out.println("Omkretsen är:"+omkrets);
    }
}
