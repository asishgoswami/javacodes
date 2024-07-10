// Abstract class: ArithmeticOperation
abstract class ArithmeticOperation  {
    protected double num1;
    protected double num2;

    public ArithmeticOperation (double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double operate();
}

// Class: Addition extends ArithmeticOperation
class Addition extends ArithmeticOperation  {
    public Addition(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 + num2;
    }
}

// Class: Subtraction extends ArithmeticOperation
class Subtraction extends  ArithmeticOperation  {
    public Subtraction(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 - num2;
    }
}

// Class: Multiplication extends ArithmeticOperation
class Multiplication extends  ArithmeticOperation  {
    public Multiplication(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        return num1 * num2;
    }
}

// Class: Division extends ArithmeticOperation
class Division extends ArithmeticOperation  {
    public Division(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}

// Class: Modulus extends ArithmeticOperation
class Modulus extends ArithmeticOperation {
    public Modulus(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operate() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 % num2;
    }
}

// Main class
public class task6 {
    public static void main(String[] args) {
        Addition add = new Addition(10, 5);
        System.out.println("Addition: " + add.operate());

        Subtraction sub = new Subtraction(10, 5);
        System.out.println("Subtraction: " + sub.operate());

        Multiplication mul = new Multiplication(10, 5);
        System.out.println("Multiplication: " + mul.operate());

        Division div = new Division(10, 5);
        System.out.println("Division: " + div.operate());

        Modulus mod = new Modulus(10, 5);
        System.out.println("Modulus: " + mod.operate());
    }
}
