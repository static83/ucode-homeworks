import java.util.Scanner;

public class Ascii {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a character");
            char c = scan.nextLine().charAt(0);
            int i = c;
            System.out.println("The ASCII value of '"+c+"' = " +i);
        }
}
