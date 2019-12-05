import java.util.Scanner;

public class decimaltoBinary {
    public static void main(String[] args) {
        System.out.println("Please enter an integer between 0 and 255");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 255 || number < 0) {
            System.out.println("This number is not within the parameters 0 and 255");
        }
        getBinary(number);
    }

        public static void getBinary(int number){
            String s = "";
            for(int j = 0; j < 8; j++)
            {
                if(number % 2 == 1)
                {
                    s = "1" + s;
                }
                if(number % 2 == 0)
                {
                    s = "0" + s;
                }
                number = number/2;
            }
            System.out.println("The binary equivalent is: " + s);
        }
}
