public class vowels {
    public static void main(String[]args){
        char[] charArray = {'j','a','v','a'};

        String str = new String(charArray);

        System.err.println(str);

        for(char c: charArray){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("Vowel: "+c);
            }
        }
    }
}
