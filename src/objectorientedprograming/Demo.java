package objectorientedprograming;

class Person{
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " is walking");
    }

    void emailing(){
        System.out.println(name + " is emailing with " + email);
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

public class Demo {
    public static void main(String[] args) {

        // Instantiating an object
        Person person1 = new Person();

        // Define some properties
        person1.name = "Joe";
        person1.email = "Joe@email.com";
        person1.phone = "1234567890";

        // Abstraction
        person1.walk();
        person1.emailing();
        person1.sleep();

        Person person2 = new Person();
        person2.name = "Sarah";
        person2.walk();

        /*
        // Person

        // Attributes, Descriptors, etc.
        String name = "Joe";
        String email = "Joel@email.com";
        String phone = "1234567890";

        // Actions, activity, behaviors, etc
//        System.out.println(name + " is walking");
        walking(name);
        System.out.println(name + " is eating");

        // What if we want to do this for another person?
        String name2 = "Sarah";
        String email2 = "Sarah@email.com";
        String phone2 = "0987654321";

//        System.out.println(name2 + " is walking");
        walking(name2);
        System.out.println(name2 + " is eating");

        // What about binding data & properties together? - WELCOME TO CLASSES.
    }

    // Lets enhance this by adding functions to minimize code:
    static void walking(String name){
        System.out.println(name + " is walking");


         */
    }
}