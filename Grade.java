public class Grade{
    public static void main(String[] args) {
        int mark = 85;
        if(mark >= 90){
            System.out.println("Grade: A");
        } else if(mark >= 80){
            System.out.println("Grade: B");
        } else if(mark >= 70){
            System.out.println("Grade: C");
        } else if(mark >= 60){
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}