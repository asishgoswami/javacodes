public class trapping {
    public static int trappedrainwater(int height[]){
        int n=height.length;
        //calculate left max boundary-array
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=0;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary-array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
              rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater=0;
        //loop
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(leftMax[i],rightmax[i]);
           //trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];
        }

      return trappedwater;

    }
    public static void main(String[]args){
        int height[]={2,3,4,0,5,6};

        System.out.println( trappedrainwater(height));
    }
}
