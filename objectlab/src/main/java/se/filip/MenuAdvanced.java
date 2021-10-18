package se.filip;
import java.util.ArrayList;

public class MenuAdvanced {
    public void menuPick(){
        ArrayList<Matratt> menu = new ArrayList<>();
        int totalcost = 0;
        while (true) {
            System.out.println("1. En till maträtt");
            System.out.println("2. Tack det var allt");
            int pick = Integer.parseInt(System.console().readLine());
            if (pick == 1) {
                System.out.println("Vad vill du ha för maträtt?");
                String name = System.console().readLine();

                System.out.println("Är den vegetarisk, vegansk eller en kött rätt?");
                String type = System.console().readLine();

                System.out.println("Hur många kalorier har den?");
                int cal = Integer.parseInt(System.console().readLine());

                System.out.println("Vad är du villig att betala?");
                int cost = Integer.parseInt(System.console().readLine());

                Matratt mat = new Matratt(name, type, cal, cost);

                menu.add(mat);
            }
            else{
                
                System.out.println("---------KVITTO---------");
                for (Matratt matratt : menu) {
                    System.out.print(matratt.getName()+" "+matratt.getType()+" "+ matratt.getAmountCal()+" "+ matratt.getPrice()+"kr");
                    System.out.println();
                    totalcost += matratt.getPrice();
                }
                System.out.println("Total Kostnad:"+totalcost);
                System.out.println("");
                break;
            }
        }
    }
}
