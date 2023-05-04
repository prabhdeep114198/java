/*Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a 
method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both 
inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods. */
abstract class Animals{
    abstract void cats();
    abstract void dogs();
}
class cats extends Animals{
    void cats(){
        System.out.println("cats meow");
    }
}
class dogs extends Animals{
    void dogs(){
        System.out.println("dogs bark");
    }
}
public class abstract02{
    public static void main(String[] args) {
        dogs a = new dogs();
        cats c = new cats();
        c.cats();
        a.dogs();

    }
}