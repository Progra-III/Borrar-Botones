package source;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal implements ActionListener {

    private JFrame frame;
    private JPanel panel;

    public static void createShowGUI(){

        Principal window = new Principal();
    }

    public Principal(){
        frame= new JFrame("Title window 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        addComponents(frame.getContentPane());
        frame.setVisible(true);
    }

    private void addComponents(Container contentPane) {

        contentPane.setLayout(new GridLayout(2,2));
        JButton btn= new JButton("Button 1");
        btn.setActionCommand("1");
        btn.addActionListener(this);
        contentPane.add(btn);

        btn= new JButton("Button 2");
        btn.setActionCommand("2");
        btn.addActionListener(this);
        contentPane.add(btn);

        btn= new JButton("Button 3");
        btn.setActionCommand("3");
        btn.addActionListener(this);
        contentPane.add(btn);

        btn= new JButton("Button 4");
        btn.setActionCommand("4");
        btn.addActionListener(this);
        contentPane.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int value= Integer.parseInt(e.getActionCommand());      //me dice cual es el boton usuario presiono

        switch(value){
            case 1:
                frame.setSize(300, 300);
                frame.repaint();
                break;
            case 2:
                String name =  JOptionPane.showInputDialog(null, "What is your name?");
               while(true) {
                   if (!name.isBlank()) {
                       JOptionPane.showMessageDialog(null, "Welcome " + name + "!");
                       break;
                   }
               }
            case 3:
                frame.setSize(500, 500);
                frame.repaint();
                break;
            case 4:
                String param =  JOptionPane.showInputDialog(null, "Data to be sent");
                while(true) {
                    if (!param.isBlank()) {
                       openSecondWindow(param);
                        break;
                    }
                }
        }
    }

    private void openSecondWindow(String param) {

        Secondary window2= new Secondary(param);
        window2.setVisible(true);
        frame.dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createShowGUI();
            }
        });
    }

//quitar la opcion de salir segunda ventana
// agregar un boton de devolverse


}
