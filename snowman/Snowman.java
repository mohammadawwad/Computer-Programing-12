package snowman;

import java.awt.*;
import java.awt.event.*;

public class Snowman extends Frame{

    private class WindowCloser extends WindowAdapter{  
        public void windowClosing(WindowEvent we){  
            System.exit(0);
        }
    }

    public Snowman(){  
        setTitle("Snowman");
        setSize(600, 600);
        setVisible(true);
        addWindowListener(new WindowCloser());
    }

    public static void main(String args[]){  
        System.out.println("Starting Snowman program");
        Snowman Snowman = new Snowman();
    }

    public void paint(Graphics g){

        //constants
        final int MID = 300;
        final int TOP = 300;

        setBackground(Color.cyan);

        //ground
        g.setColor(Color.blue);
        g.fillRect(0, 550, 600, 50);  

        //sun
        g.setColor(Color.yellow);
        g.fillOval(-40, -40, 200, 200);  

        g.setColor(Color.white);
        //head
        g.fillOval(MID-20, TOP, 90, 90);  
        //mid body
        g.fillOval(MID-35, TOP+80, 120, 90); 
        //lower body
        g.fillOval(MID-50, TOP+150, 150, 120);  

        g.setColor(Color.black);
        //left eye
        g.fillOval(MID+5, TOP+25, 15, 15);   
        //right eye
        g.fillOval(MID+25, TOP+25, 15, 15);   

        g.setColor(Color.white);
        //inner left eye
        g.fillOval(MID+10, TOP+30, 5, 5); 
        //inner right eye  
        g.fillOval(MID+30, TOP+30, 5, 5);    

        //nose
        g.setColor(Color.black);
        g.fillOval(MID+20, TOP+45, 7, 7); 

        //smile
        g.drawArc(MID+5, TOP+45, 40, 20, 190, 160);   

        //left eyebrow
        g.drawArc(MID+6, TOP+20, 13, 8, 0, 180);   

        //right eyebrow
        g.drawArc(MID+26, TOP+20, 13, 8, 0, 180);   

        //left arm
        g.drawLine(MID-25, TOP+110, MID-70, TOP+70);  
        //right arm
        g.drawLine(MID+70, TOP+110, MID+150, TOP+110);  

        //top of hat
        g.fillRect(MID-2, TOP-30, 50, 35);        
        
        //lower part of hat
        g.drawLine(MID-15, TOP+5, MID+65, TOP+5);  

        //buttons
        g.fillOval(MID+18, TOP+100, 10, 10); 
        g.fillOval(MID+18, TOP+115, 10, 10); 
        g.fillOval(MID+18, TOP+130, 10, 10); 
    }
}