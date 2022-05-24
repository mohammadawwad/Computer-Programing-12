package chapter1;


public class RectanglePerimeter {
    
    
    public static void main(String[] args){
        
        int w = 4;
        int l = 13;
        int perimeter = 2 * w + 2 * l;
        
        
        //printing a 4 x 13 rectangle
        System.out.println("----");
        
        for(int x = 0; x < 13; x++){
            System.out.println("|  |");
        }
        
        System.out.println("----");
        
        //outputing the dimensions
        System.out.println("The rectangle has a width of 4 a length of 13 and the perimeter is: " + perimeter);
    }
}
