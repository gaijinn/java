import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {

        JButton jButton = new JButton("OKEY");

        JTextField jt = new JTextField("Hello");

        GUI gui = new GUI();
        gui.setLayout(new GridLayout(3, 3, 2,2));
        gui.setSize(600, 400);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.add(jt);

        JButton [] mygtukai = new JButton[20];

        for(int i=0; i < 5; i++) {
            mygtukai[i] = new JButton("mygtukas"+i);

            mygtukai[i].setName(mygtukai[i]+"");

            int finalI = i;

            System.out.println(""+mygtukai[i].getText());


            mygtukai[i].addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    JFrame butt = new JFrame(""+mygtukai[finalI].getText());

                    JTextArea j = new JTextArea("");

                    j.setText("Mygtuko pav: "+ mygtukai[finalI].getText());

                    butt.setLayout(new FlowLayout());
                    butt.setSize(200, 200);

                    butt.add(j);

                    butt.pack();

                    butt.setVisible(true);




                    // JOptionPane.showMessageDialog(null,"Mygtukas paspaustas"+mygtukai[finalI].getText());
                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            gui.add(mygtukai[i]);

        }
        gui.pack();






    }



}
