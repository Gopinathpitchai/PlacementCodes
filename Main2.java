class Prouduct{
    String productName;
    double price;
    String Category;

    void displayProduct(String productName,double price,String Category){
        System.out.println("ProuductName :"+productName);
        System.out.println("Price :"+price);
        System.out.println("Category :"+Category);
    }
}

class ElectronciProduct extends Prouduct{

    @Override
    void displayProduct(String productName, double price, String Category) {
        super.displayProduct(productName, price, Category);

        if (price>=500){
            double discount =price*10/100;
            System.out.println("Discount Amount :"+discount);
        }
    }
    
}

public class Main2{
    public static void main(String[] args) {
        Prouduct pro=new Prouduct();
        pro.displayProduct("MOBIL", 20000, "Electronic");

        System.out.println();

        ElectronciProduct el= new ElectronciProduct();
        el.displayProduct("Laptop", 50000, "Electronic");

    }
}