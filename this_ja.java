class std{
    int age;
    void setAge(int age){
        this.age=age;
    }

    void display(){
        System.out.println("Age= "+age);
    }
}


public class this_ja{
    public static void main(String[] args) {
        std s1=new std();
        s1.setAge(20);
        s1.display();
    }
}