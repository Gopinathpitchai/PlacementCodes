public class Largest_num{
    public static void main(String[]args){

        String input="AB729CD5";

        int num=0;

        for (int i=0;i<input.length();i++){
            // System.out.println(input.charAt(i));

            if(num<Character.getNumericValue(input.charAt(i))){
                num+=Character.getNumericValue(input.charAt(i));
            }


        }

        System.out.println("largest number in the string is: "+num);
    }
}
