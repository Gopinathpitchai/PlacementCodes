class Details{
    String Model;
    int Year;
    double Price;

}

public class Car{
    public static void main(String[] args) {
        Details car1=new  Details();

        car1.Model="BMW";
        car1.Year=2020;
        car1.Price=50000.0;

        System.out.println("Model:"+car1.Model);
        System.out.println("Year:"+car1.Year);
        System.out.println("Price:"+car1.Price);
    }
   
}


