//Write a Java program to add the letters, remove and find the size of the list using List interface
//with sample output.
import java.util.*;
public class task4 {
    public static void main(String[]args){
        ArrayList<String>mylist=new ArrayList<String>();
        //add elements to the list
        mylist.add("a");
        mylist.add("b");
        mylist.add("c");
        //print the size of the list
        System.out.println("the size of mylist"+mylist.size());
        //print elements form the list
        System.out.println("elements of my list"+ mylist);
        //remove the elements form the list
        mylist.remove(1);
        mylist.remove("c");
        //print the size of the list
        System.out.println(" size of my list after removing element"+mylist.size());
        System.out.println("elements of my list"+mylist);
    }
}
































