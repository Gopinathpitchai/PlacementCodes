public class Breakja {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
        for(int j=1;j<=10;j++){
            if(j%2==1){
                continue;
            }
            System.err.println(j);
        }
    }
}
