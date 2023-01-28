public class Shape
{
    public void show()
    {
        System.out.println("This is a Shape");
    }
}

class Rectange extends Shape
{
    @Override
    public void show() {
        System.out.println("This is a Rectangular Shape");

    }
}

class Circle extends Shape
{
    @Override
    public void show() {
        System.out.println("This is Circular Shape");
    }
}

class Square extends Rectange
{
    @Override
    public void show() {
        System.out.println("Square is a Rectangle");
    }
}

class Mains
{
    public static void main(String[] args) {

        Square s1 = (Square) new Shape();
        Square s2 = (Square) new Rectange();

        s1.show();
        s2.show();
    }
}

