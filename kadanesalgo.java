public class kadanesalgo {

    public static void kadane(int array[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=1;i<array.length;i++){
            cs+=array[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
    }
    public static void main(String[]args){
        int array[]={1,2,3,-2,-1,-5,8,9};
         kadane(array);
    }
}
