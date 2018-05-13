//多态

abstract class Animal
{
    abstract void eat();
}
class Cat extends Animal
{
    public void eat()
    {
        System.out.println("eat fish");
    }
    public void CatchMice()
    {
        System.out.println("it can catch mouce");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("eat bone");
    }
    public void wattchdoor()
    {
        System.out.println("it can watch door");
    }
}
public class duotaiDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        function(c);
    }
    //把方法抽取出来，提高函数复用性，其中，父类的引用指向了子对象，父类的引用也可恶意接收子对象，可提高代码的复用性
    public static void function(Animal a)
    {
        a.eat();
    }
}

