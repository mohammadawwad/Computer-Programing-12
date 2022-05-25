
package algos;

import java.util.ArrayList;


public class TowersOfHannoi {
    
    public static void main(String[] args){
        //adding three disks to pole 1
        poleA.add(1);
        poleA.add(2);
        poleA.add(3);
        
        showOutput();
        moveDiskFromAtoC();
        showOutput();
    }
    
    //all the poles that will be used                         - 1   index 0 of array
    //the lower the number the smaller the disk is           -- 2
    //                                                      --- 3   index 2 of array
    //Creating the array Lists for each pole  
    static ArrayList<Integer> poleA = new ArrayList<>();  

    static ArrayList<Integer> poleB = new ArrayList<>();      
    static ArrayList<Integer> poleC = new ArrayList<>();  
        
    
    
    public static void moveDiskFromAtoC(){
        //moving the the first disk to the last
       int topDiskOfA = poleA.get(0);
       poleC.add(1);
       poleA.remove(0);
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
