import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int i = sc.nextInt();

        int Sum=0;

        while(i>=1){
            Sum*=i;
            i--;
        }

        System.out.println("Sum of N number:"+ Sum);
    }
}
