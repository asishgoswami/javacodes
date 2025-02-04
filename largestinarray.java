import java.util.*;
public class largestinarray {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//represent (-infinity)
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
     public static void main(String[]args){
         int numbers[]={1,2,3,4,5,6};
System.out.println(getlargest(numbers));
     }
}
