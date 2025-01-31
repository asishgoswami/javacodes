public class decimaltobinary {
    public static void bintodec(int n){
        int pow=0;
        int decnum=0;
        while(n>0){
               int lastdigit=n%10;
         decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
         pow++;
         n=n/10;

        }
        System.out.println(decnum);
    }
    public static void main(String []args){
bintodec(101);
    }
}
