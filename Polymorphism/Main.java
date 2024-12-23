package Polymorphism;
class Person{
    String name;
    int age;

    Person(String name){
        this.name = name;
    }

    // Overload method
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void work(){
        if (age > 0) {
            System.out.println(name + " age " + age + " is doing general work.");
        }else{
            System.out.println(name + " is doing general work.");
        }
    }


}


class Employee extends Person{
    Employee(String name){
        super(name);
    }

    @Override
    void work(){
        System.out.println(name + " is working office work.");
    }
}

class Manager extends Employee {

    Manager(String name){
        super(name);
    }

    @Override
    void work(){
        System.out.println(name + " is managing office.");
    }
    
}


public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Moenul");
        Person p2 = new Person("Moenul", 45); // for overload method 
        Person p3 = new Employee("Kholayed");
        Person p4 = new Manager("Saydor");
        p1.work();
        p2.work(); // for overload method
        p3.work();
        p4.work();
    }
}
