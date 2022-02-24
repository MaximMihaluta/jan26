import java.util.Locale;
import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {

/*

        // switching a with b and b switch with b
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
*/

       /* StringBuilder name = new StringBuilder("John");
        System.out.println(name);
        String name2 = "Bob";
        String name3 = new String("Dan")*/
/*


          /// appent() ad aditional string
        StringBuilder name = new StringBuilder("John");
        System.out.println(name + "Smith");
        System.out.println(name.append("Smirnov"));

        String name2 = "Bob";
        System.out.println(name2 + "Smith" + (5+5));
        System.out.println(name2.concat("Smith"));
        System.out.println(name2.concat("Hello"));
        */


      /*  // deleteCharAt() ---delete that char with number 3
        StringBuilder text = new StringBuilder("Java is a programing language");
        System.out.println(text.deleteCharAt(3));

        */

        // delete() delete beetween two parametres or delete intaier string

       /* StringBuilder text = new StringBuilder("Java is a programing language");
        System.out.println(text.delete(0, 5));
*/

       /* // reverse()
        StringBuilder text = new StringBuilder("Java is a programing language");
        System.out.println(text.reverse());

         // conert a strring into a StringBuilder
        String text3 = "Hello";
        StringBuilder text4 = new StringBuilder(text3);
        System.out.println(text4.reverse());

        text4.toString();     // convert stringbuilder in string

        String text5 = text4.toString();
        System.out.println(text5);
          // come back to a builder
        StringBuilder text6 = new StringBuilder(text5);
        System.out.println(text6.reverse());


        String text7 =  text6.toString();
        System.out.println(text7);
*/

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first name: ");
        String username = sc.nextLine();
        StringBuilder converted = new StringBuilder(username);
        System.out.println("Your reversed name is: " + converted.reverse());
*/

        // insert based on index
        StringBuilder str = new StringBuilder("Java and are programing languages");
        System.out.println(str.insert(9," JavaScript "));
        System.out.println(str.insert(24, " the best "));
        System.out.println(str.insert(53," 2022"));


        // Java and Javascript are the best programing languages of 2022








    }
}
