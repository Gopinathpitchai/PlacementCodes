import java.util.HashSet;

public class hash_set{
    public static void main(String[] args) {
        HashSet<String>Cities=new HashSet<>();

        Cities.add("Chennai");
        Cities.add("Madurai");
        Cities.add("Dindigul");
        Cities.add("goa");
        Cities.add("Chennai");


        System.out.println(Cities);
        
        System.out.println(Cities.contains("Madurai"));

        Cities.remove("Chennai");

        System.out.println(Cities.size());

        Cities.clear();

        System.out.println(Cities);

    }
}