import java.util.Scanner;
public class ATM_method {
    double balnce=50000;

    void deposit(){
        Scanner de=new Scanner(System.in);
        
        System.out.print("Enter You Ammount:");
        double amount=de.nextDouble();
        System.out.println("You Deposit Ammount:"+amount);
        balnce+=amount;

    }
    void Withra(){
        Scanner wi=new Scanner(System.in);
        System.out.print("Enter You Ammount:");
        double amount=wi.nextDouble();
        System.out.println("You Withraw Ammount:"+amount);
        balnce-=amount;
    }

    void checkbalce(){
        System.out.println("Your Current Balnce:"+balnce);
    }

    public static void main(String[] args) {
        ATM_method obj=new ATM_method();
        obj.deposit();
        obj.Withra();
        obj.checkbalce();
    }
}
