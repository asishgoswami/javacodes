public class hollowrectangle {
    public static void rectangle(int row,int column){
        //outerloop
      for(int i=1;i<=row;i++){
          for(int j=1;j<=column;j++){
              //boundary condition
              if(i==1||i==row||j==1||j==column){
                  //boundry cells
                  System.out.print("*");
              }else{
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
    }
    public static void main(String[]args){

        rectangle(4,5);
    }
}
