package se.filip;

public class Lab4 {
    public void run(){
        Person person = new Person("Filip", 21);
        String greetings = person.greetAsRovarsprak();
        System.out.println(greetings);
        System.out.println(person.isAdult());
    }
}
