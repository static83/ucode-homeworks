import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");

        String b = sc.nextLine();

        String[] words = b.split("[ ]");
        for (int i = 0; i < words.length; i++) {
            System.out.print(Character.toUpperCase(words[i].charAt(0)));

            for (int j = 1; j < words[i].length(); j++) {
                if (j == words[i].length() - 1) {
                    System.out.print(words[i].charAt(j) + " ");
                } else {
                    System.out.print(words[i].charAt(j));
                }

            }

        }
        System.out.println("");

    }

}
