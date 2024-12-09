public class bubblesort {
    public static void bubblesort(int arr[]){
        for(int k=0;k<arr.length-1;k++){
            for(int j=0;j<arr.length-1-k;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[]args){
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        printarr(arr);
//        System.out.println(printarr(arr));
    }
}
