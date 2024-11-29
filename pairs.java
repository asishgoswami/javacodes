public class pairs {
    public static void printpair(int array[]){
        int tp=0;
        for(int i=0;i<array.length-1;i++){
            int current=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+current+","+array[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[]args){
        int array[]={1,2,3,4,5,6};
printpair(array);
    }
    
}
