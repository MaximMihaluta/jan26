import java.util.Scanner;

public class hw28_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input tha 1st number : ");
        int num1 = scanner.nextInt();
        System.out.print("Input the 2nd number : ");
        int num2 = scanner.nextInt();
        System.out.print("Input tne 3rd number : ");
        int num3 = scanner.nextInt();
        System.out.println("Expected Output :");

        if (num1>num2 && num1>num3){
            System.out.println("The greatest : " + num1);
        }else if (num2>num1 && num2>num3) {
            System.out.println("THe greatest : " + num2);
        }
            else {
                System.out.println("The greatest : " + num3);
            }


    }
}
