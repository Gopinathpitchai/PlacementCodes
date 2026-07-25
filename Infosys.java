public class Infosys {
    public static void main(String[]args){
        ClgMark mark1=new ClgMark(50);
        mark1.display();
    }
}

class ClgMark{
    private int mark;

    ClgMark(int mark){
        this.mark=mark;
    }
    void display(){
        if(mark>0 && mark<100){
            System.out.println("Mark"+mark);
        }
        else{
            System.out.print("Invalid mark");
        }
    }
}
