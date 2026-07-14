import java.util.Scanner;

public class OddNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int currentOdd = 1; 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            
            currentOdd += 2; 
        }

        scanner.close();
    }
}
