import java.util.* ;
class employee{
    String name;
    double YOJ;
    String address;
    public void printinfo(){
        System.out.println(this.name +"\t"+this.YOJ+"\t"+this.address);
    }
}
public class oops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee em1 = new employee();
        employee em2 = new employee();
        employee em3 = new employee();
        System.out.println("enter details of employee 1 ");
        em1.name = sc.next();
        em1.YOJ = sc.nextDouble();
        em1.address = sc.nextLine();
        System.out.println("enter details of employee 2 ");
        em2.name = sc.next();
        em2.YOJ = sc.nextDouble();
        em2.address = sc.nextLine();
        System.out.println("enter details of employee 3 ");
        em3.name = sc.next();
        em3.YOJ = sc.nextDouble();
        em3.address = sc.nextLine();
        System.out.println("Name\t"+"Year Of Joining\t"+"Address");
        em1.printinfo();
        em2.printinfo();
        em3.printinfo();

    }
}