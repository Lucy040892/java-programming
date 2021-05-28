package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //add 3 objects from Employee class
        employee1.name = "Lucy";
        employee1.jobTitle = "Team Lead";
        employee1.work();

        employee2.name = "Victor";
        employee2.jobTitle = "SDET";
        employee2.work();

    }
}
