package se.filip;

import java.util.ArrayList;

public class HockeyTeam {
    private String name;
    private String city;
    private ArrayList<HockeyPlayer> players = new ArrayList<>();

    public HockeyTeam(String name) {
        super();
        setName(name);

    }
    public void addPlayer(HockeyPlayer player){
        players.add(player);
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name = s;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String s){
        city = s;
    }

}
