package com.company;

/**
 * Created by S3WABA KODWO on 3/27/2016.
 */
public class isPrimeFunction {
    public static boolean isPrime(int n){
        int count =0;
        for (int i = 2 ; i < n; i++){
            if (n % i == 0){
             count++;
            }
            else {
                continue;
            }
        }
        if (count == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        for (int i = 2; i < 101;i++){
            if (isPrime(i)){
                System.out.println(i);
            }
            else{
                continue;
            }
        }
    }
}
