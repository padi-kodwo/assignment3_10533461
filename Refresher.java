import java.util.Scanner;

/**
 * Created by S3WABA KODWO on 3/25/2016.
 */
public class Refresher {
    public static void main(String[] args){
        String name;
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("What is your name :");
        name = Keyboard.next();

        switch (name){
            case "mitchel":
                for (int i = 0; i < 5; i++){
                 System.out.println("mitchel");
                 }
                break;
            default:
                for (int i = 0 ; i< 10; i++){
                  System.out.println(name);
                }
        }
    }
}
