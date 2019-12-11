package RentCar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Car car= new Car();
        
        System.out.println("Enter model of vehicle: ");
        String model=scanner.next();
        
        System.out.println("Enter number of days you wish to rent: ");
        int numberOfWheels=scanner.nextInt();
        
        car.setModel(model);
        car.setNumberOfWheels(numberOfWheels);
        
//        System.out.println(car.getDescription());
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();
        System.out.println(age);
        
        if(age<18){
            System.out.println("You must be 18 and over to access service");
        }else{
            System.out.println("Successful");
        }
    }
}