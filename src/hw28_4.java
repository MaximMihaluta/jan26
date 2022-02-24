import java.util.Scanner;

public class hw28_4 {
    public static void main(String[] args) {

        System.out.println("        ");
        System.out.println("IN USA 65 is a retirment age . ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        if (age >= 65){
            System.out.println("You are already retired ");
        }else{
            int ret = 65 - age;

            System.out.println(ret + " year left till retirement ");
        }








    }
}
