import java.util.Scanner;
public class text {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int spaces = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '.') {
                spaces++;
            } 
            else if (!Character.isLetterOrDigit(ch)) {
                special++;
            }
            else{
                
            }
        }
        System.out.println("cant fill any words please fill this");
        System.out.println("Spaces = " + spaces);
        System.out.println("Special Characters = " + special);

        
    }
    
}
