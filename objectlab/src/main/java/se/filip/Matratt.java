package se.filip;



public class Matratt {
    private String name;
    private String type; //vegan vegetarian meat
    private int amountCal;
    private int price;

    public Matratt(String name, String type, int amountCal, int price) {
        super();
        this.name = name;
        this.type = type;
        this.amountCal = amountCal;
        this.price = price;
    }
   
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAmountCal(){
        return amountCal;
    }
    public int getPrice(){
        return price;
    }
    
}
