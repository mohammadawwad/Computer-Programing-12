//package algos;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class TowersOfHannoi {
//    
//    
//    static int numOfDisks;
//    static int numOfMoves;
//        
//    public static void main(String[] args){
//        
//        //adding the amount of poles you want to the first pole
//        Scanner input = new Scanner(System.in);
//        System.out.println("Welcome to Towers Of Hannoi, how many poles would you like to start with?");
//        System.out.print("Starting Number: ");
//        int amountOfDisks = input.nextInt();
//        
//        //looping over amount of disks wanted and creating them
//        for(int x = 1; x < amountOfDisks + 1; x++){
//            poleA.add(x);
//        }
//        
//        //calculating the number of moves required to finish the problem
//        calculateMovesNum();
//        System.out.println("Number Of Moves Required: " + numOfMoves);
//        showOutput();
//        
//        //moving everything from A to C with pole B being the middle man
//        moveDiskAlgo(numOfDisks, 'A', 'C' , 'B');
//    }
//    
//    //all the poles that will be used                         - 1   index 0 of array
//    //the lower the number the smaller the disk is           -- 2
//    //                                                      --- 3   index 2 of array
//    //Creating the array Lists for each pole  
//    static ArrayList<Integer> poleA = new ArrayList<>();  
//    static ArrayList<Integer> poleB = new ArrayList<>();      
//    static ArrayList<Integer> poleC = new ArrayList<>();  
//    
//    
//    public static int calculateMovesNum(){
//        //calculates the number of moves needed based on the amount of starting disks
//        numOfDisks = poleA.size();
//        numOfMoves = (int) (Math.pow(2, numOfDisks) - 1);
//        return numOfMoves;
//    }
//
//    
//    //recursive function for deciding where the disk will be moved to based on the moves required to finish the problem and how many disks there are
//    
//    
//    
//    public static void moveDiskAlgo(int diskNumbers, char source, char dest, char middleMan){
//            if(diskNumbers == 1){
//                moveDisk(source + "to" + dest);
//                showOutput();
//                return;
//            }
//            
//            moveDiskAlgo(diskNumbers - 1, source, middleMan, dest);
//            moveDisk(source + "to" + dest);
//            showOutput();
//            
//            moveDiskAlgo(diskNumbers - 1, middleMan, dest, source);
//    }
//
//    
//    
//    public static void moveDisk(String type){
//        
//        int topDiskOfA;
//        int topDiskOfB;
//        int topDiskOfC;
//        
//        switch(type){
//            
//            case "AtoB": 
//                //moving the the first disk from A to the top of the pole B
//                topDiskOfA = poleA.get(0);
//                poleB.add(0, topDiskOfA);
//                poleA.remove(0);
//                break;
//                
//            case "AtoC": 
//                //moving the the first disk from A to the top of pole C
//                topDiskOfA = poleA.get(0);
//                poleC.add(0, topDiskOfA);
//                poleA.remove(0);
//                break;
//
//            case "BtoA": 
//                //moving the the fisrt disk from B to the top of pole A
//                topDiskOfB = poleB.get(0);
//                poleA.add(0, topDiskOfB);
//                poleB.remove(0);
//                break;
//
//            case "BtoC": 
//                //moving the the first disk from B to the top of pole C
//                topDiskOfB = poleB.get(0);
//                poleC.add(0, topDiskOfB);
//                poleB.remove(0);
//                break;
//
//
//            case "CtoA": 
//                //moving the the first disk from C to the top of pole A
//                topDiskOfC = poleC.get(0);
//                poleA.add(0, topDiskOfC);
//                poleC.remove(0);
//                break;
//
//
//            case "CtoB": 
//                //moving the the first disk from C to the top of pole B
//                topDiskOfC = poleC.get(0);
//                poleB.add(0, topDiskOfC);
//                poleC.remove(0);
//                break;
//
//        }
//    }
//    
//
//    
//    //outputting the numbers that represent the disks in each pole
//    public static void showOutput(){
//        
//        System.out.println("\nOutput: ");
//       
//        for(int counter = 0; counter < numOfDisks; counter++){
//                try{
//                    if((poleA.get(counter)!= null) && (poleB.get(counter) != null) && (poleC.get(counter) != null)){
//                        System.out.printf("%-10s %-10s %-10s \n", poleA.get(counter), poleB.get(counter), poleC.get(counter));
//                        continue;
//                    }
//                }catch(Exception e){}
//
//                try{
//                    if((poleA.get(counter)!= null) && (poleB.get(counter) != null)){
//                        System.out.printf("%-10s %s\n", poleA.get(counter), poleB.get(counter));
//                        continue;
//                    }
//                }catch(Exception e){}
//                
//                
//                try{
//                    if((poleA.get(counter)!= null) && (poleC.get(counter) != null)){
//                        System.out.printf("%-21s %s\n", poleA.get(counter), poleC.get(counter));
//                        continue;
//                    }
//                }catch(Exception e){}
//
//                try{
//                    if((poleB.get(counter)!= null) && (poleC.get(counter) != null)){
//                        System.out.printf("%12s %10s\n", poleB.get(counter), poleC.get(counter));
//                        continue;
//                    }
//                }catch(Exception e){}
//                                
//            
//                try{
//                    if(poleA.get(counter) != null)
//                    System.out.printf("%-10s\n", poleA.get(counter));
//                    continue;
//                }catch(Exception e){}
//
//                try{
//                    if(poleB.get(counter) != null)
//                    System.out.printf("%12s\n", poleB.get(counter));
//                    continue;
//                }catch(Exception e){}
//
//                try{
//                    if(poleC.get(counter) != null)
//                    System.out.printf("%23s\n", poleC.get(counter));
//                    continue;
//                }catch(Exception e){}
//
//            
//        }
//        System.out.printf("%-10s %-10s %-10s\n", "A", "B", "C");
//        System.out.printf("%-9s %-9s %-10s\n", "▔", "▔", "▔");
//    }
//    
// 
//}
