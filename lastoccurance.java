public class lastoccurance {
    public static void main(String[]args){
int arr[]={1,2,3,4,5,4,2,5};
System.out.print(occurance1(arr,4,0));
    }
    public static int occurance1(int arr[],int key,int i ){
        if(i==arr.length){
            return -1;
        }
        int isfound=occurance1(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
}
