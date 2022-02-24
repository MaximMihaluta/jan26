import java.util.Scanner;

public class hw28_5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number : ");
        int n1 = scanner.nextInt();
        System.out.println("Expected Output : ");
        if (n1 == 1){
            System.out.println("Monday");
        }else if (n1 == 2){
            System.out.println("Tuesday");
        }else if (n1 == 3){
            System.out.println("Wensday");
        }else if (n1 == 4){
            System.out.println("Thursday");
        }else if (n1 == 5){
            System.out.println("Friday");
        }else if (n1 == 6){
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");

        }






    }
}
