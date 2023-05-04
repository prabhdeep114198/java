interface show{
    void printinfo();
interface message{
    void printmessage();
}
}
class interface01 implements show.message{
    public void printmessage(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        show.message m = new interface01();
        m.printmessage();
        
    }
        
}