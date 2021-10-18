package se.filip;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String greetAsRovarsprak(){
        String rovarName ="";
        for (int i = 0; i < name.length(); i++) {
            char tecken = name.charAt(i);
            if (isVowel(tecken)) {
                rovarName += tecken;
            }
            else{
                rovarName += tecken +"o"+tecken;
            }
        }
        return "Hohejoj "+rovarName;
    }

    public boolean isAdult(){
        if (age >= 18) {
            return true; 
        }
        else{
            return false;
        }
    }
    private boolean isVowel(char tecken){
        switch (tecken) {
            case 'a','A':
                return true;
            case 'o','O':
                return true;
            case 'u','U':
                return true;
            case 'e','E':
                return true;
            case 'i','I':
                return true;
            case 'y','Y':
                return true;
            case 'å','Å':
                return true;
            case 'ä','Ä':
                return true;
            case 'ö','Ö':
                return true;
            default:
            return false;
        }
    }
}
