package se.filip;

public class HockeyPlayer {
    private String name;
    private int jersey;
    private int age;

    public HockeyPlayer(String name) {
        super();
        
    }

    public String getName(){
        return name;
    }

    public void setName(String s){
        name = s;
    }

    public int getJersey(){
        return jersey;
    }

    public void setJersey(int s){
        jersey = s;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int s){
        age = s;
    }
}
