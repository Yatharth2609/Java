class Animal
{
    public void speak()
    {
        System.out.println("Animal Sound");
    }
}

class dog extends Animal
{
    @Override
    public void speak()
    {
        System.out.println("bhow bhow");
    }
}

class Main
{
    public static void main(String[] args) {

        Animal x = new Animal();

        dog Shiro = new dog();

        x.speak();
        Shiro.speak();

    }
}
