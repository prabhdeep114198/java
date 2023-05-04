/*We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four
 subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'.
  It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the 
  percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and 
  the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print 
  the percentage of marks for both the students. */
abstract class marks{
    abstract void getPercentage();
}
class A extends marks{
    double percentage=0;
    double a,b,c;
    A(double a1, double a2, double a3){
        this.a = a1;
        this.b = a2;
        this.c = a3;
    }
    public void getPercentage(){
        percentage = ((a+b+c)/300)*100;
        System.out.println("percentage of student A is "+percentage+"%");
    }


}
class B extends marks{
    double a,b,c,d;
    double percentage=0;
    B(double b1, double b2, double b3, double b4){
        this.a = b1;
        this.b = b2;
        this.c = b3;
        this.d = b4;
    }
    public void getPercentage(){
        percentage = ((a+b+c+d)/400)*100;
        System.out.println("percentage of student B is "+percentage+"%");
    }
}
public class abstract04{
    public static void main(String[] args) {
        A aa = new A(100,100,100);
        aa.getPercentage();
        
        B bb = new B(90,90,90,90);
        bb.getPercentage();
        

    }
}