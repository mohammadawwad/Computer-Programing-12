
public class myCircle{
    public static int radius;

    public myCircle(int r){
        radius = r;
    }

    //was missing the identifier double
    public static double getircumfrence(){
        return 2 * 3.14 * radius;
    }

    //was mising the identifier double
    public static double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        myCircle(10);
        getircumfrence();
    }
}