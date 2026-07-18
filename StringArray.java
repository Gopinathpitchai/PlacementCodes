public class StringArray{
    public static void main(String[] args) {
        char[] charArray = {'j','a','v','a'};

        String str = new String(charArray);
        System.out.println(str);
        int length = 0;
        for (char c : charArray) {
            length++;
            System.out.println("Current char: " + c );
        }
        System.out.println("Length of charArray: " + length);
    }
}