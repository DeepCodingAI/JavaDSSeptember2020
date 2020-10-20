package ds;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        //int [] number = {10,90,100,30,20,70,};
        System.out.println("Please Enter the array size: ");
        Scanner scLimit  = new Scanner(System.in);
        int limit = scLimit.nextInt();
        int [] number = new int[limit];
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter some numbers: ");
        for(int j=0; j<number.length; j++){
            number[j] = sc.nextInt();
        }
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
