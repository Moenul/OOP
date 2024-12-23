package Inheritance;

class Person{
    String name;
    private int age;

    Person(String name, int age){
        this.name =  name;
        this.age = age;
    }

    public void displayPerson(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
    }
    
}

class Employee extends Person {
    String jobTitle;
    double salary;

    public Employee(String name, int age, String jobTitle, double salary){
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    
    @Override
    public void displayPerson(){
        super.displayPerson();
        System.out.println("Job Title : "+ jobTitle);
        System.out.println("Salary : "+ salary);
    }

    // public void displayEmployee(){
    //     System.out.println();
    //     displayPerson();
    //     System.out.println("Job Title : "+ jobTitle);
    //     System.out.println("Salary : "+ salary);
    // }

}

class Manager extends Employee{
    String teamName;
    int teamMember;

    Manager(String name, int age, String jobTitle, double salary, String teamName, int member){
        super(name, age, jobTitle, salary);

        this.teamName = teamName;
        this.teamMember = member;
    }

    @Override
    public void displayPerson(){
        super.displayPerson();
        System.out.println("Team Name : " + teamName);
        System.out.println("Team Member : " + teamMember);
    }

    // public  void displayManager(){
    //     System.out.println();
    //     displayPerson();
    //     displayEmployee();
    //     System.out.println("Team Name : " + teamName);
    //     System.out.println("Team Member : " + teamMember);
    // }
}


public class Main {
    public static void main(String[] args){
        Person person = new Person("Moenul", 25);
        person.displayPerson();

        Employee employee = new Employee("Bijoy", 25, "Web Devloper", 20000);
        // employee.displayEmployee();
        employee.displayPerson();

        Manager manager = new Manager("Kholayed", 20, "Brocoker", 10000, "Akamla", 3);
        // manager.displayManager();
        manager.displayPerson();
    }
}
