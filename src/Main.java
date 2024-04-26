import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        int n = input.nextInt();
        // Loop for drawing the upper half of the diamond
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {// Loop for printing spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for printing asterisks
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Loop for drawing the lower half of the diamond
        for (int i = (n - 1); i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {// Loop for printing spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for printing asterisks
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}