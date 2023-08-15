class complex{
    int real;
    int imag;
    complex()
    {
    }
 
    complex(int r, int i){
        real = r;
        imag = i;
    }
    complex add(complex a, complex b){
        complex c = new complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    complex sub(complex a, complex b){
        complex c = new complex();
        c.real = a.real - b.real;
        c.imag = a.imag - b.imag;
        return c;
    }
    void printComplexNumber()
    {
        System.out.println("Complex number: "
                           + real + " + "
                           + imag + "i");
    }
}
public class code3{
    public static void main(String[] args) {
        complex a = new complex(2,3);
        a.printComplexNumber();
        complex b = new complex(4,1);
        b.printComplexNumber();
        complex c = new complex(); 
        c = c.add(a,b);
        System.out.print("Sum of ");
        c.printComplexNumber();
        c = c.sub(a,b);
        System.out.print("Difference of ");
        c.printComplexNumber();
    }
}
