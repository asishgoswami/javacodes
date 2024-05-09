//Write a java program for bank details using multilevel inheritance for the variables such as to get accno, name, age, gender, acctype, total and display the balance, withdraw, deposit and annual interest.
 class bankaccount{
    private String accountnumber;
    private String name;
    private int age;
    private String gender;
    private String accounttype;

    public  void bankaccount(String accountnumber,String name,int age,String gender,String accounttype){
        this.accountnumber=accountnumber;
        this.name=name;
        this.age=age;
        this. gender=gender;
        this.accounttype=accounttype;

    }
}
class management extends bankaccount{
    private double total;
    private double balance;
    public void management(double total,double balance){
       this.total=total;
       this.balance=balance;
    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println(balance);
    }
    public void withdral(double amount){
        if(balance>amount){
           balance-=amount;
           System.out.println(balance);
        }else{
            System.out.println("insufficient balance");
        }
    }
}
class intrest extends management{
    public void intrest(double principal, double rate, int time){

        System.out.println( principal * rate * time);
    }
}





public class task1 {
    public static void main(String[]args){
        intrest litu=new intrest();
        litu.deposite(500);
        litu.withdral(600);
        litu.intrest(5,7,2);

    }
}
