package Factorizor;

import java.util.Scanner;

public class Factorizor {

    public static void main(String[] args) {
        int fr;
        Scanner a = new Scanner(System.in);

        System.out.println("Enter a number to get it's prime factor :");
        fr = a.nextInt();

        tree(fr);     
    }

    public static void tree(int a) {
        int j;
        System.out.println("Prime Factor of " + a+" are :");
        
        for (int i = a; i >= 1; i--) {
            for (j = 0; j <= a / 2; j++) {
                if (a == j * i) {
                    if (i >= j) {
                        System.out.println(i + " x " + j);
                    }
                }
            }
            j = 1;
        }
    }
}
