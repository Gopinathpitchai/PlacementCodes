
import java.util.Scanner;
public class Vovel {
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String input = vol.nextLine();

        switch(input){
            case "a":
                System.out.println("The character is a vowel.");
                break;

            case "e":
                System.out.println("The character is a vowel.");
                break;
                
            case "i":
                System.out.println("The character is a vowel.");
                break;
            case "o":
                System.out.println("The character is a vowel.");
                break;
            case "u":
                System.out.println("The character is a vowel.");
                break;
            default:
                System.out.println("The character is not a vowel.");
                break;                  
        }
    }
}
