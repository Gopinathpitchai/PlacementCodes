class SubArray{
    public static void main(String[]args){
        int arr[]={10,20,30};

        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){
                System.out.println(arr[start]+","+arr[end]);
            }
        }
    }
}