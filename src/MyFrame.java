import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame implements MouseListener{

    JLabel label;
    ImageIcon one;
    ImageIcon two;
    ImageIcon three;
    ImageIcon four;

    MyFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        one = new ImageIcon("NAILS.png");
        two = new ImageIcon("JustWatching.png");
        three = new ImageIcon("Spunchbop.png");
        four = new ImageIcon("Stare.png");



        label.setIcon(one);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }





    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(two);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("You pressed the mouse"); //applies to right,left,and middle mouse buttons
        label.setIcon(four);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        label.setIcon(one);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        label.setIcon(three);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(one);
    }
}

//mouseClicked = invoked when the mouse button has been clicked ( press and released) on a component
//mousePressed = invoked when a mouse button has been pressed on a component
//mouseReleased = invoked when a mouse button has been released on a component
//mouseEntered = invoked when the mouse enters a component
//mouseExited = invoked when the mouse exits a component