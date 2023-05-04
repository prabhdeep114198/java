import java.io.* ;
class omps{
    private String name;
    private int age;
    public void getter(){  
        System.out.println("name = "+this.name+"\nage = "+ this.age);
    }
    public void setter(String na, int ag){
        this.name = na;
        this.age = ag;
    }
}
class methods{
    public static void main(String[] args) {
        omps op = new omps();
        op.setter("prabhdeep",19);
        op.getter();
        omps op1 = new omps();
        op1.setter("leana",18);
        op1.getter();
    }
}