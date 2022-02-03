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
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowCloser());
    }

    public static void main(String args[]){  
        System.out.println("Starting Snowman program");
        Snowman Snowman = new Snowman();
    }

    public void paint(Graphics g){

        //constants
        final int MID = 150;
        final int TOP = 50;

        setBackground(Color.cyan);

        g.setColor (Color.blue);
        g.fillRect (0, 175, 300, 50);  // ground

        g.setColor (Color.yellow);
        g.fillOval (-40, -40, 80, 80);  // sun

        g.setColor (Color.white);
        g.fillOval (MID-20, TOP, 40, 40);      // head
        g.fillOval (MID-35, TOP+35, 70, 50);   // upper torso
        g.fillOval (MID-50, TOP+80, 100, 60);  // lower torso

        g.setColor (Color.black);
        g.fillOval (MID-10, TOP+10, 5, 5);   // left eye
        g.fillOval (MID+5, TOP+10, 5, 5);    // right eye

        g.drawArc (MID-10, TOP+20, 20, 10, 190, 160);   // smile

        g.drawLine (MID-25, TOP+60, MID-50, TOP+40);  // left arm
        g.drawLine (MID+25, TOP+60, MID+55, TOP+60);  // right arm

        g.drawLine (MID-20, TOP+5, MID+20, TOP+5);  // brim of hat

        g.fillRect (MID-15, TOP-20, 30, 25);        // top of hat
    }
}