
package algos;

import java.util.ArrayList;


public class TowersOfHannoi {
    
    
    static int numOfDisks;
    static int numOfMoves;
        
    public static void main(String[] args){
        //adding three disks to pole 1
        poleA.add(1);
        poleA.add(2);
        poleA.add(3);
        
        
        calculateMovesNum();
        moveDiskAlgo();
    }
    
    //all the poles that will be used                         - 1   index 0 of array
    //the lower the number the smaller the disk is           -- 2
    //                                                      --- 3   index 2 of array
    //Creating the array Lists for each pole  
    static ArrayList<Integer> poleA = new ArrayList<>();  
    static ArrayList<Integer> poleB = new ArrayList<>();      
    static ArrayList<Integer> poleC = new ArrayList<>();  
    
    
    public static int calculateMovesNum(){
        //calculates the number of moves needed based on the amount of starting disks
        numOfDisks = poleA.size();
        numOfMoves = (int) (Math.pow(2, numOfDisks) - 1);
        return numOfMoves;
    }

    public static void moveDiskAlgo() {
//  1. Calculate the total number of moves required i.e. "pow(2, n)- 1" here n is number of disks.

//  2. If number of disks (i.e. n) is even then interchange destination pole and auxiliary pole.

//  3. for i = 1 to total number of moves:
//          if i%3 == 1:
//              legal movement of top disk between pole A and pole C
//          if i%3 == 2:
//              legal movement of top disk between pole A and pole B
//          if i%3 == 0:
//              legal movement of top disk between pole B and pole C 

        System.out.println("Number Of Moves Required: " + numOfMoves);
        
          
        
           
            for(int moveCount = 1; moveCount < 7; moveCount++){
                
//                calculateMovesNum();
                
//                if(numOfDisks % 2 == 0){
//                    //decides where the disk will be moved too
//                    if(moveCount % 3 == 1){
//                        moveDisk("AtoB");
//                        showOutput();
//                    }
//                    if(moveCount % 3 == 2){
//                        moveDisk("AtoC");
//                        showOutput();
//                    }
//                    if(moveCount % 3 == 0){
//                        moveDisk("BtoA");
//                        showOutput();
//                    }
//                } 
                
//                else {
                    
                    //decides where the disk will be moved too
                    if(moveCount % 3 == 1){
                        moveDisk("AtoC");
                        showOutput();
                    }
                    if(moveCount % 3 == 2){
                        moveDisk("AtoB");
                        showOutput();
                    }
                    if(moveCount % 3 == 0){
                        moveDisk("CtoB");
                        showOutput();
                    }
//                }

            }
        
        
        
    }
    

    
    
    public static void moveDisk(String type){
        
        int topDiskOfA;
        int topDiskOfB;
        int topDiskOfC;
        
        switch(type){
            
            case "AtoB": 
                //moving the the first disk from A to the top of the pole B
                topDiskOfA = poleA.get(0);
                poleB.add(0, topDiskOfA);
                poleA.remove(0);
                break;
                
            case "AtoC": 
                //moving the the first disk from A to the top of pole C
                topDiskOfA = poleA.get(0);
                poleC.add(0, topDiskOfA);
                poleA.remove(0);
                break;

            case "BtoA": 
                //moving the the fisrt disk from B to the top of pole A
                topDiskOfB = poleB.get(0);
                poleA.add(0, topDiskOfB);
                poleB.remove(0);
                break;

            case "BtoC": 
                //moving the the first disk from B to the top of pole C
                topDiskOfB = poleB.get(0);
                poleC.add(0, topDiskOfB);
                poleB.remove(0);
                break;


            case "CtoA": 
                //moving the the first disk from C to the top of pole A
                topDiskOfC = poleC.get(0);
                poleA.add(0, topDiskOfC);
                poleC.remove(0);
                break;


            case "CtoB": 
                //moving the the first disk from C to the top of pole B
                topDiskOfC = poleC.get(0);
                poleB.add(0, topDiskOfC);
                poleC.remove(0);
                break;

        }
    }
    

    
    //outputting the numbers that represent the disks in each pole
    public static void showOutput(){
        
        System.out.println("\nOutput: ");
        System.out.println("A:");
        for(int x = 0; x < poleA.size(); x++){
          System.out.println(poleA.get(x));
        }
      
        System.out.println("\nB:");
        for(int y = 0; y < poleB.size(); y++){
          System.out.println(poleB.get(y));
        }
        
        System.out.println("\nC:");
        for(int z = 0; z < poleC.size(); z++){
          System.out.println(poleC.get(z));
        }
    }
    
 
}
