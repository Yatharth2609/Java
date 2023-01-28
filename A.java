abstract class A {
    public void disp() {
        System.out.println("Something");
    }

    abstract public void disp2();

}

class B extends A
{
    @Override
    public void disp2() {
        System.out.println("Overriding");
    }

    public static void main(String[] args) {
        B obj = new B();

        obj.disp();
    }
}
