package day61_exceptions;

public class ElementaryStudent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if name is null first, otherwise we can get nullpointer exception
        if(name == null || name.isEmpty()) {
           throw new IllegalArgumentException("Name cannot be empty or null");
        }
        //if name is all number or starts with numbers
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public ElementaryStudent() {} //empty constructor

    public ElementaryStudent(String name, int age) { //constructor with arguments
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        if(age < 5 || age > 12) {
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }
        this.age = age;
    }
}
