// Implement Employee details (Emp_ID, Name, Age, Salary and dept) using Encapsulation.
public class task5 {
    private String name;
    private int emp_id;
    private int age;
    private double salary;
    public task5(String name,int emp_id,int age,double salary){
        this.name=name;
        this.emp_id=emp_id;
        this.age=age;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmp_id(int emp_id){
        this.emp_id=emp_id;
    }
   public void setAge(int age){
        this.age=age;
   }
   public void setSalary(double salary){
        this.salary=salary;
   }
   public static void main(String[]args){
        task5  u1=new task5("asish",2210134,21,400);
        System.out.println("your name is :"+u1.getName());
        System.out.println("your id  is :"+u1.getEmp_id());
        System.out.println("your age is :"+u1.getAge());
        System.out.println("your salary is :"+u1.getSalary());

   }

}





























































