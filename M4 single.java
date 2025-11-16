public class single {
    public static void main(String[] args)
    {
        dog d = new dog();
        d.bark();
        d.eat();
    }    
}
class animal
{
    void eat()
    {
        System.out.println("animals can eat");
    }
}
class dog extends animal{
    void bark()
    {
        System.out.println("animals can bark");
    }
}
