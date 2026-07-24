//Create a Mobile class with company, ram, and storage, then create three different mobiles.

class Display{
    String Comapny;
    double Price;
    String ram;
}

public class Mobil {
    public static void main(String[] args) {
        Display mobil=new Display();

        mobil.Comapny="Samsung";
        mobil.Price=20000;
        mobil.ram="8GB";

        System.err.println("Company: "+mobil.Comapny);
        System.err.println("Price: "+mobil.Price);
    }
    
}
