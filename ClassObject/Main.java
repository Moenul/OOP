package ClassObject;

class Car{
    String brand;
    String color;
    int speed;


    Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void displayDetails(){
        System.out.println("Barnd = " + brand);
        System.out.println("Color = " + color);
        System.out.println("Speed = " + speed);
        System.out.println();
    }

    void accelerate(int increase){
        speed += increase;
        System.out.println(brand+ " accelarate to "+ speed + "km/h");
        System.out.println();
    }
   

}

public class Main {
    public static void main(String[] args){
        System.out.println("Car Showing Project");

        Car car1 = new Car("Tesla", "White", 255);
        Car car2 = new Car("BMW", "Black", 355);

        car1.displayDetails();
        car1.accelerate(30);
        car2.displayDetails();
    }    
}
