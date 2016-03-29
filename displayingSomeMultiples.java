package com.company;

import java.util.Scanner;

/**
 * Created by S3WABA KODWO on 3/26/2016.
 */
public class displayingSomeMultiples {
    public static void main(String[] args){
        int number;
        Scanner Keyboard = new Scanner(System.in);

        System.out.print("Choose Number :");
        number = Keyboard.nextInt();
        System.out.print("\n");

        for (int i = 1;i < 13; i++){
            System.out.println(number+"x"+i+" = " + number*i);
        }
    }
}
