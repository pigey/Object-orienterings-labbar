package se.filip;

public class Point {
    private int xPos;
    private int yPos;

    public Point(int xPos, int yPos) {
        super();
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getYpos(){
        return yPos;
    }
    public void setYpos(int y){
        yPos = y;
    }

    public int getXpos(){
        return xPos;
    }
    public void setXpos(int x){
        xPos = x;
    }

}
