import java.util.Scanner;

public class Calculator
{
    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Add(int x,  int y)
    {
        return x  + y;
    }

    public int Subtract(int x , int y)
    {
        return x - y;
    }

    public int Multiply(int x, int y)
    {
        return x * y;
    }

    public double Divide(int x , int y)
    {
        return (double)(x/y);
    }
}

class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator MyObj = new Calculator(a , b);

        MyObj.Divide(a , b);
    }
}
