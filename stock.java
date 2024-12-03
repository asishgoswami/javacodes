public class stock {
    public static int buystack(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if (buyprice<price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        int price[]={2,3,1,6,7,8};
        System.out.println();
    }
}
