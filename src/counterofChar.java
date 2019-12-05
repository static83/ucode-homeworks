import java.util.Scanner;

public class counterofChar {
    public static void main(String[] args) {
        System.out.println("Enter a string of characters and spaces");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);

    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++;
            }
            else if(Character.isDigit(ch[i])){
                num ++;
            }
            else if (Character.isSpaceChar(ch[i])){
                space ++;
            }
            else{
                other ++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);

    }
}

