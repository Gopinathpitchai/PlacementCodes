public class StringRevers {
    public static void main(String[] args) {
        String str="AMMA";
        String Palentrome="";

        for (int i=str.length()-1; i>=0; i--){
            // System.out.print(str.charAt(i));
            Palentrome+=str.charAt(i);
        }
        System.out.println(Palentrome);

        if(str.equals(Palentrome)){
            System.out.println("String is Palentrome");
        }else{
            System.out.println("String is not Palentrome");
        }
}
}
