public class maxsubarray2 {
    public static void sumarray(int array[]){
        int current=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        prefix[0]=array[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<array.length;i++){
            int start=i;
            for(int j=0;j<array.length;j++){
                int end=j;
                current= start==0 ? prefix[end]:prefix[end]-prefix[start];
               if(maxsum<current){
                   maxsum=current;
               }
            }
        }

    }
    public static void main(String[]args){

    }
}
