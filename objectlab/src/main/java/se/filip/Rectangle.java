package se.filip;

public class Rectangle {
        private int height;
        private int width;

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    public int calculateArea(){
        return height * width;
    }
}
