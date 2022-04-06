package chapter5 loops;

class DoubleForLoop { 
    public static void main(String args[]) { 

    } 

    public void expand(){
        int i, x; 

        //first loop to repeats 3 times
        for (i=1; i<=3; i++){ 

            //loops to print 1-4 on a new line each time the outer loop iterates
            for(x=1; x<=4; x++){
                System.out.println(+x); 
            }
        } 
    }

    public void squished(){
        int i, x; 

        //first loops iterates 5 times
        for (i=1; i<=5; i++){ 
            //loops over to print 1-4 on a single line each time the outer loops iterates
            for(x=1; x<=4; x++){
                System.out.print(+x); 
            }

            //skip to next line after printing 1234
            System.out.println();
        } 
    }
} 