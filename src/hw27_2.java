import java.util.Scanner;

public class hw27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number :");
        int num1 = sc.nextInt();
        System.out.print("Input second number : ");
        int num2 = sc.nextInt();
        System.out.print("Input third number : ");
        int num3 = sc.nextInt();
        System.out.print("Input fourth number : ");
        int num4 = sc.nextInt();
        if (num1 == num2 && num3 == num4 && num4==num2) {
            System.out.println("Numbers are equal!");


        }else{
            System.out.println("Numbers are not equal!");
        }






    }
}
