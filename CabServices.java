import java.util.*;


interface CabType {
    void selectCab(); 
}


interface RideBooking {
    void bookRide();
}

interface Payment {
    void makePayment(); 
}


class child implements RideBooking,Payment{
    
    public void selectCab(){
        Scanner cab = new Scanner(System.in);

        System.out.print("Select your cab type: ");
        String cabType = cab.nextLine();

        System.out.print("You have selected " + cabType + " cab.");
    }
    
    
    
    public void bookRide(){
        Scanner book =new Scanner(System.in);
        System.out.print("Enter your pickup location: ");
        String pickup = book.nextLine();
        System.out.print("Enter your drop location: ");
        String drop = book.nextLine();

        System.out.println("Ride booked from " + pickup + " to " + drop);
        
    }

    public void makePayment(){

        Scanner pay = new Scanner(System.in);
        System.out.print("Enter your payment method (Cash/Card/UPI): ");
        String paymentMethod = pay.nextLine();
        System.out.println("Payment made using " + paymentMethod);
    }

    

}


public class CabServices {
    public static void main(String[] args) {
        child c = new child();
        c.bookRide();
        c.selectCab();  
        c.makePayment();
        
    }
}
