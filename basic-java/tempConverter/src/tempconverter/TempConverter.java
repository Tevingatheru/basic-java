package tempconverter;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        float d=0;
        float f;
      
        System.out.println("Convert the temprature from Degree Celsius to Fahrenheit");
        System.out.println("Enter temperature in degrees :");
        d=c.nextFloat();
        float  k=(float) (9.0/5.0);
        System.out.println(k);
        f=((d*k)+32);
       System.out.println("The conversion in fahrenheit is :"+f);
       
    }
}
