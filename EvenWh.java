import java.util.Scanner;

public class EvenWh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number : ");
        int even=sc.nextInt();
        
        while(even>=0){
            if(even%2==0){
                System.out.println("odd Numbers : "+ even);
                
            }
            even--;
        }
        


    }
}
