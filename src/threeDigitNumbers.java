public class threeDigitNumbers {

    private static int count;
    public static void main(String[] args) {
        for(int i = 1; i <=4 ; i++) {
            for(int j = 1; j<=4 ; j++) {
                if(j == i) continue;
                for(int k = 1; k<=4 ; k++){
                    if(k == j || k == i) continue;
                    System.out.println(""+i+j+k);
                    count++;
                }
            }
        }
        System.out.println("Count: "+ count);
    }
}