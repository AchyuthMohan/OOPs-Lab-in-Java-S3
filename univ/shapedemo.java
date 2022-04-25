
class shape{
    void numberOfSides(){}
}
class Rectangle extends shape{
    void numberOfSides(){
        System.out.println("4");
    }
}
class triangle extends shape{
    void numberOfSides(){
        System.out.println("3");
    }
}
class hexagon extends shape{
    void numberOfSides(){
        System.out.println("6");
    }
}
public class shapedemo {
    public static void main(String[] args) {
        hexagon h=new hexagon();
        h.numberOfSides();
    }
}
