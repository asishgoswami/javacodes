public class butterfly {
    public static void fly(int n){
        //first half
        for(int i=1;i<=n;i++){
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=n;i>=0;i--){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           for(int j=1;j<=2*(n-i);j++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
    public static void main(String[]args){
fly(4);
    }
}
