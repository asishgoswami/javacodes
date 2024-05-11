//Write a Java program to check whether number is palindrome or not using while, if and else
//statements.
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner vc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = vc.nextInt();
       int revers=0,element,reminder;
       element=num;
       while(num!=0){
           reminder=num%10;
           revers=(revers*10)+reminder;
           num=num/10;
       }
       if(element==revers){
           System.out.println("yes,it is a palindrome");
       }else{
           System.out.println("no, it is not a palindrome");
       }
    }
}