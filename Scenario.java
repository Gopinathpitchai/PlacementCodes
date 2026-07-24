// public class Scenario{
//     public static void main(String[]args){
//         String Artical="String operations allow you to manipulate, combine, and modify text data efficiently within your code. Common examples include slicing specific characters, converting letter casing, and joining multiple text pieces together.";
//         char[]vowels={'a','e','i','o','u'};
//         for(int i=0;i<Artical.length();i++){
//             int count=0;
//             for (text.charAt(j)==vowels[i]||text.charAt(j)==Character.toUpperCase(vowels)){

//             }
//         }

//     }
// }


public class Scenario { 
    public static void main(String[] args) { 
        String article = "String operations allow you to manipulate, combine, and modify text data efficiently within your code. Common examples include slicing specific characters, converting letter casing, and joining multiple text pieces together."; 
        char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
        
        for (int i = 0; i < vowels.length; i++) { 
            int count = 0; 
            for (int j = 0; j < article.length(); j++) { 
                if (article.charAt(j) == vowels[i] || article.charAt(j) == Character.toUpperCase(vowels[i])) { 
                    count++;
                } 
            } 
            System.out.println("Vowel '" + vowels[i] + "' appears: " + count + " times");
        } 
    } 
}
