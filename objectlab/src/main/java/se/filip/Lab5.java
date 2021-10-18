package se.filip;

public class Lab5 {
    public void run(){
        MenuAdvanced kvitto = new MenuAdvanced();
        while (true) {
            System.out.println("Hej och välkommen! vad vill du göra?");
            System.out.println("1. tryck 1 för att lägga till en måltid");
            System.out.println("2. tryck 2 för att avsluta");
            int userInteraction = Integer.parseInt(System.console().readLine());
            if (userInteraction == 1) {
                kvitto.menuPick();
            }
            else{
                System.out.println("Tack för att du besökte oss!");
                break;
            }
            
        }

        
    }
}
