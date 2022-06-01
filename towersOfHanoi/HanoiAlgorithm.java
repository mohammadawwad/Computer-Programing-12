
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
        System.out.println("Number Of Moves Required: " + numOfMoves);
        showOutput();
        
        //moving everything from A to C with pole B being the middle man
        moveDiskAlgo(numOfDisks, 'A', 'C' , 'B');
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

    
    
    public static void moveDiskAlgo(int diskNumbers, char source, char dest, char middleMan){
            if(diskNumbers == 1){
                moveDisk(source + "to" + dest);
                showOutput();
                return;
            }
            
            moveDiskAlgo(diskNumbers - 1, source, middleMan, dest);
            showOutput();
            moveDisk(source + "to" + dest);
            showOutput();
            
            moveDiskAlgo(diskNumbers - 1, middleMan, dest, source);
            showOutput();
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
        
        boolean hasA = false, hasB = false, hasC = false;
       
        
        System.out.println("\nOutput: ");
        System.out.println("A:");
        for(int x = 0; x < poleA.size(); x++){
          System.out.println(poleA.get(x));
          hasA = true;
        }
      
        System.out.println("\nB:");
        for(int y = 0; y < poleB.size(); y++){
          System.out.println(poleB.get(y));
          hasB = true;
        }
        
        System.out.println("\nC:");
        for(int z = 0; z < poleC.size(); z++){
          System.out.println(poleC.get(z));
          hasC = true;
        }
       
        for(int counter = 0; counter < numOfDisks; counter++){
            if(hasA && hasB && hasC){
                System.out.printf("%-10s %-10s %-10s\n", poleA.get(0), poleB.get(0), poleC.get(0));
                continue;
            }
            
            if(hasA && hasB){
                System.out.printf("%-10s %-10s\n", poleA.get(0), poleB.get(0));
                continue;
            }
            
            if(hasA){
                System.out.printf("%-10s\n", poleA.get(0));
                continue;
            }
            
        }
        System.out.printf("%-10s %-10s %-10s\n", "A", "B", "C");
    }
    
 
}
