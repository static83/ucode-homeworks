import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("Enter the width: ");
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        System.out.println("Enter the length: ");
        double length = sc.nextDouble();
        double area = width * length;
        double perimiter = 2 *(width + length);
        System.out.println("The perimiter is " + perimiter + " and the area is " + area);

    }
}
