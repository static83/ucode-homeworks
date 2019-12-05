import java.util.Scanner;

public class integerN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int n = scan.nextInt();
        System.out.println("here it is : "+n + "+" + n*11+ "+" + n*111);
        int i = (n*1)+(n*11)+(n*111);
        System.out.println("is equal to: " + i);
    }
}
