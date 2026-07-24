// public class EncodeDecode {
//     public static void main(String[] args) {
//         char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


//         for (int i=0;i<alphabet.length;i++){
//             // System.out.println(alphabet[i]);
//             for(int j=i;j<alphabet.length +2;j++){
//                 System.out.println(alphabet[j]);
//             }
//         }


//     }
// }


import java.util.Scanner;

public class EncodeDecode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next().toUpperCase();

        int shift = 3;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char encoded = (char) ((ch - 'A' + shift) % 26 + 'A');
                System.out.println(ch + " = " + encoded);
            }
        }

        sc.close();
    }
}