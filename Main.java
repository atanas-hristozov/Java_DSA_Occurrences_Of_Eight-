import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(occurrencesOfEight(n));
    }

    private static int occurrencesOfEight(int number) {
        if (number  == 0) {
        return 0;
        } else if (number%100 == 88){
            return 2 + occurrencesOfEight(number/10);
        } else if (number%10 == 8){
            return 1 + occurrencesOfEight(number/10);
        } else {
            return occurrencesOfEight(number/10);
        }
    }
}