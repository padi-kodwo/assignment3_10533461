package com.company;

/**
 * Created by S3WABA KODWO on 3/26/2016.
 */
public class evennessFunction {
    public static boolean isEven( int n ){
        if (n % 2 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isDivisibleBy3( int n ){
        if (n % 3 ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        for (int i =1; i < 21;i++){
            System.out.print(i);
            if (isDivisibleBy3(i) && isEven(i)){
                System.out.println( "<=");
            }
            else if(isEven(i)){
                System.out.println("<");
            }
            else if (isDivisibleBy3(i)){
                System.out.println("=");
            }
            else{
                System.out.print("\n");
            }

        }
    }
}
