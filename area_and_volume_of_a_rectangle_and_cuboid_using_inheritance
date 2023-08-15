class rectangle{
    double length;
    double width;
}
class cuboid extends rectangle{
    double height;
    cuboid(){
        length =1;
        width =1;
        height =1;
    }
    cuboid(cuboid ob){
        length = ob.length;
        width = ob.width;
        height = ob.height;
    }
    cuboid(double l, double w, double h){
        this.length = l;
        this.width = w;
        this.height = h;
    }
    cuboid(double h){
        length = width = height = h;
    }
    double volume(){
        return length*width*height;
    }
    double area(){
        return length*width;
    }
}
public class inherit02{
    public static void main(String[] args) {
        cuboid cu = new cuboid(10,5,4);
        cuboid cu1 = new cuboid(10);
        double area, vol;
        area = cu.area();
        System.out.println("area of rectangle is "+area);
        vol = cu1.volume();
        System.out.println("volume of cuboid is "+vol);
    }
}
