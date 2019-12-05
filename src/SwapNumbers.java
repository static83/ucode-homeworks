public class SwapNumbers {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        System.out.println("Before swapping");
        System.out.println("The first number is " + firstNumber);
        System.out.println("The second number is " + secondNumber);

        int temp = firstNumber;

        firstNumber = secondNumber;

        secondNumber = temp;

        System.out.println("After the swap");
        System.out.println("The first number is " + firstNumber);
        System.out.println("The second number is " + secondNumber);

    }
}
