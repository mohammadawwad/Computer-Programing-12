
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;


class TowersOfHanoiWithControls extends JPanel implements Runnable, ActionListener {

    
    private static final long serialVersionUID = 1L;


    //main program
    public static void main(String[] args) {
        JFrame window = new JFrame("Towers Of Hanoi");
        window.setContentPane(new TowersOfHanoiWithControls());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setResizable(true);
        window.setLocation(300,200);
        window.setVisible(true);
    }

    //4 colors used in drawing.
    private static Color BACKGROUND_COLOR = new Color(220,220,220); 
    private static Color BORDER_COLOR = new Color(0,0,0);
    private static Color DISK_COLOR = new Color(180,0,0);
    private static Color MOVE_DISK_COLOR = new Color(180,180,255);

    //The off-screen canvas.  Frames are drawn here, then copied to the screen.
    private BufferedImage OSC;   

    // Controls the execution of the thread; value is one of the following constants.
    private int status;   

    private static final int GO = 0;       
    private static final int PAUSE = 1;   
    private static final int STEP = 2;    
    private static final int RESTART = 3; 

    //global ints and lists for keeping track of the disks and towers
    private int[][] tower;
    private int[] towerHeight;
    private int moveDisk;
    private int moveTower;

    //A subpanel where the frames of the animation are shown.
    private Display display;  

    //3 control buttons for controlling the animation
    private JButton runPauseButton;  
    private JButton nextStepButton;
    private JButton startOverButton;


    //drawing the canvas
    private class Display extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int x = (getWidth() - OSC.getWidth())/2;
            int y = (getHeight() - OSC.getHeight())/2;
            g.drawImage(OSC, x, y, null);
        }
    }


    /**
     *  Create the panel, containing a display panel and, beneath it,
     *  a sub-panel containing the three control buttons.  This
     *  constructor also creates the off-screen canvas, and creates
     *  and starts the animation thread.
     */
    public TowersOfHanoiWithControls () {
        OSC = new BufferedImage(430,143,BufferedImage.TYPE_INT_RGB);
        
        display = new Display();
        display.setPreferredSize(new Dimension(430,143));
        display.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, 2));
        display.setBackground(BACKGROUND_COLOR);
        
        setLayout(new BorderLayout());
        
        add(display, BorderLayout.CENTER);
        
        //creating a pannel for the buttons
        JPanel buttonBar = new JPanel();
        
        add(buttonBar, BorderLayout.SOUTH);
        
        buttonBar.setLayout(new GridLayout(1,0));
        runPauseButton = new JButton("Run");
        runPauseButton.addActionListener(this);
        
        buttonBar.add(runPauseButton);
        nextStepButton = new JButton("Next Step");
        nextStepButton.addActionListener(this);
        
        buttonBar.add(nextStepButton);
        startOverButton = new JButton("Start Over");
        startOverButton.addActionListener(this);
        startOverButton.setEnabled(false);
        
        buttonBar.add(startOverButton);
        new Thread(this).start();
    }


    /**
     *  Event-handling method for the control buttons.  Changes in the
     *  value of the status variable will be seen by the animation thread,
     *  which will respond appropriately.
     */
    synchronized public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == runPauseButton) {  // Toggle between running and paused.
            if (status == GO) {  // Animation is running.  Pause it.
                status = PAUSE;
                nextStepButton.setEnabled(true);
                runPauseButton.setText("Run");
            }
            else {  // Animation is paused.  Start it running.
                status = GO;
                nextStepButton.setEnabled(false);  // Disabled when animation is running
                runPauseButton.setText("Pause");
            }
        }
        else if (source == nextStepButton) {  // Set status to make animation run one step.
            status = STEP;
        }
        else if (source == startOverButton) { // Set status to make animation restart.
            status = RESTART;
        }
        notify();  // Wake up the thread so it can see the new status value!
    }


  
    public void run() {
        while (true) {
            //adding and setting up the buttons
            runPauseButton.setText("Run");
            nextStepButton.setEnabled(true);
            startOverButton.setEnabled(false);
            
            //Sets up the initial state of the puzzle
            setUpProblem();  
            status = PAUSE;
            
            //Returns only when user has clicked "Run" or "Next"
            checkStatus(); 
            startOverButton.setEnabled(true);
            try {    
                // Moving the users number of disks from pile 0 to pile 1.
                solve(numberOfDisksToSolve,0,1,2);  
            }
            catch (IllegalStateException e) {
                // Exception was thrown because user clicked "Start Over".
            }
        }
    }


    /** Some Good Documentation Here :)
     *  This method is called before starting the solution and after each
     *  move of the solution.  If the status is PAUSE, it waits until
     *  the status changes.  If the status is RESTART, it throws
     *  an IllegalStateException that will abort the solution.
     *  When this method returns, the value of status must be
     *  RUN oR STEP
     */
    int numberOfDisksToSolve = 0;
    Scanner input = new Scanner(System.in);
    synchronized private void checkStatus() {
        while (status == PAUSE) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        // At this point, status is RUN, STEP, or RESTART.
        if (status == RESTART)
            throw new IllegalStateException("Restart");
        // At this point, status is RUN or STEP.
    }


    //initialliszing the towers of hannoi settup based on user input
    synchronized private void setUpProblem() {
        System.out.print("How many disks would you like to solve (3-10) :");
        numberOfDisksToSolve = input.nextInt();
        moveDisk= 0;
        tower = new int[3][numberOfDisksToSolve];
        for (int i = 0; i < numberOfDisksToSolve; i++)
            tower[0][i] = numberOfDisksToSolve - i;
        towerHeight = new int[numberOfDisksToSolve];
        towerHeight[0] = numberOfDisksToSolve;     
        if (OSC != null) {
            Graphics g = OSC.getGraphics();
            drawCurrentFrame(g);
            g.dispose();
        }
        display.repaint();
    }


    // Solves the TowersOfHanoi problem to move the specified
    private void solve(int disks, int from, int to, int spare) {
        if (disks == 1)
            moveOne(from,to);
        else {
            solve(disks-1, from, spare, to);
            moveOne(from,to);
            solve(disks-1, spare, to, from);
        }
    }


    
    // Move the disk at the top of pile number fromStack to the top of pile number toStack. 
    synchronized private void moveOne(int fromStack, int toStack) {
        
        moveDisk = tower[fromStack][towerHeight[fromStack]-1];
        moveTower = fromStack;
        delay(120);
        
        towerHeight[fromStack]--;
        putDisk(MOVE_DISK_COLOR,moveDisk,moveTower);
        delay(80);
        
        putDisk(BACKGROUND_COLOR,moveDisk,moveTower);
        delay(80);
        
        moveTower = toStack;
        putDisk(MOVE_DISK_COLOR,moveDisk,moveTower);
        delay(80);
        
        putDisk(DISK_COLOR,moveDisk,moveTower);
        tower[toStack][towerHeight[toStack]] = moveDisk;
        towerHeight[toStack]++;
        moveDisk = 0;
        
        if (status == STEP){
            status = PAUSE;
        }
        checkStatus();
    }


    
    //Simple utility method for inserting a delay of a specified number of milliseconds.

    synchronized private void delay(int milliseconds) {
        try {
            wait(milliseconds);
        }
        catch (InterruptedException e) {
        }
    }


    // Draw a specified disk to the off-screen canvas.  This is
    private void putDisk(Color color, int disk, int t) {
        Graphics g = OSC.getGraphics();
        g.setColor(color);
        g.fillRoundRect(75+140*t - 5*disk - 5, 116-12*towerHeight[t], 10*disk+10, 10, 10, 10);
        g.dispose();
        display.repaint();
    }


   
    //Called to draw the current frame, not including the moving disk, if any, which is drawn as part of the moveOne() method.
    
    synchronized private void drawCurrentFrame(Graphics g) {
        // Called to draw the current frame.  But it is not drawn during
        // the animation of the solution.  During the animation, the
        // moveDisk() method just modifies the existing picture.
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(0,0,430,143);
        g.setColor(BORDER_COLOR);
        if (tower == null)
            return;
        g.fillRect(10,128,130,5);
        g.fillRect(150,128,130,5);
        g.fillRect(290,128,130,5);
        g.setColor(DISK_COLOR);
        for (int t = 0; t < 3; t++) {
            for (int i = 0; i < towerHeight[t]; i++) {
                int disk = tower[t][i];
                g.fillRoundRect(75+140*t - 5*disk - 5, 116-12*i, 10*disk+10, 10, 10, 10);
            }
        }
        if (moveDisk > 0) {
            g.setColor(MOVE_DISK_COLOR);
            g.fillRoundRect(75+140*moveTower - 5*moveDisk - 5, 116-12*towerHeight[moveTower],
                    10*moveDisk+10, 10, 10, 10);
        }
    }

} 



















//
//
//
//
//
//
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