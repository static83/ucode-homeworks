import java.util.Scanner;


public class circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double Pi = 3.14159265359;
        double perimeter = 2 * Pi * radius;
        double area = Pi *(radius*radius);
        System.out.println("The perimeter is " + perimeter + " and the area is " + area);
    }
}
