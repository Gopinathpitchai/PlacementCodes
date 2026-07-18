public class SumArrayDiv {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int sum=0;
        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                for(int i=start;i<=end;i++){
                    System.out.print(arr[i]+" ");
                    sum+=arr[i];
                }
                System.out.print("sum="+sum);
                System.out.print("Modulus"+sum%2);
                sum=0;
                System.out.println();
                
            }

        }
    }
}