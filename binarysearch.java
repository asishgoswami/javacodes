//Code for binary search
public class binarysearch {
    public static int search(int number[],int key){
        int start=0,end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;//key is not in the array
    }
    public static void main(String[]args){
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
//        int key=5;
        int key=11;
        int searchstart=search(numbers,key);
        System.out.println(searchstart);
    }
}
