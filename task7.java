//calculate the factorial of any number

import java.util.Scanner;
public class task7 {
   public static void main(String[]args){
               Scanner sc = new Scanner(System.in);
               System.out.print("enter a number");
               int num=sc.nextInt()	;
               int fac=1;
               for(int i=1;i<=num;i++) {
                   fac*=i;
               }
               System.out.println("Factorial of " + num+ " is: " + fac);
           }



       }