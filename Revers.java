class Revers{
    public static void main(String[] args) {
        int numbers = 42;
        int tens = numbers/10;
        int ones=numbers%10;
        int reverse =(ones*10)+tens;
        System.out.println("The reverse of the number is: " + reverse);
    }
}