package day43_list_custom_classes;

public class Person {
    //Data -> variable
    String firstName;
    int age;
    char gender;
    //Behavior method
    public void speak() {
        System.out.println("Person is speaking");
    }

}

class People {
    public static void main(String[] args) {
        //create Object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
    }
}
