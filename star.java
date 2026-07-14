import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        scanner.close();
    }
}
