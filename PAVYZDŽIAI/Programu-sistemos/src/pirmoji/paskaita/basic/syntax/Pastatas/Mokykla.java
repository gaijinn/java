package pirmoji.paskaita.basic.syntax.Pastatas;

import org.omg.CORBA.MARSHAL;
import pirmoji.paskaita.basic.syntax.Tvarkarastis.Cele;
import pirmoji.paskaita.basic.syntax.Tvarkarastis.Tvarkarastis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by Marius on 12/8/2016.
 */
public class Mokykla extends Pastatas{

    public Mokykla(String pavadinimas, String adresas) {
        super(pavadinimas, adresas);
    }

    @Override
    public void atvaizduotiTvarkarasti(ArrayList<Tvarkarastis> tvarkarastis) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {


        JFrame langas = new JFrame(super.getPavadinimas()+" TVARKARAŠTIS");
        langas.setSize(1024,768);
        langas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

        Container container = new Container();

        // TVARKARASTIS panele
        JPanel jpanel = new JPanel();
        jpanel.setLayout(new GridLayout(8,5, 10, 10));
        jpanel.setSize(800, 640);


        // MYGTUKAS panele
        JPanel mygtukas = new JPanel();
        JButton button = new JButton("GENRERATE");
        mygtukas.add(button);


        for (Tvarkarastis item: tvarkarastis) {
            int r = new Random().nextInt(255), g = new Random().nextInt(255), b = new Random().nextInt(255);

            Cele cele = new Cele(item.getAprasas(),item.getData());
            cele.setBackground(new Color(r, g, b));
            cele.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    JOptionPane.showMessageDialog(null, ""+item.getAprasas());
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
            jpanel.add(cele);
        }


        container.add(button, BorderLayout.NORTH);

        container.add(new JSeparator(), BorderLayout.BEFORE_FIRST_LINE);
        //langas.add(new JSeparator(), BorderLayout.BEFORE_FIRST_LINE);
        //container.add(new JSeparator(), BorderLayout.CENTER);
        container.add(jpanel, BorderLayout.SOUTH);

        container.setVisible(true);

        container.setLayout(new FlowLayout());

        langas.add(container);


        langas.setVisible(true);
        langas.pack();




    }


}
