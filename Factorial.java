import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Factorial : ");
        int fact =sc.nextInt();
        int sum = 1;
        while(fact>=1){
            sum*=fact;
            fact--;
        }

        System.out.println("Factorial:"+sum);
        

    }
}
