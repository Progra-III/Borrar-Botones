package source;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Secondary extends JFrame implements ActionListener {

    private JPanel contentPanel;
    private String receivedText;
    private JLabel l1;

    public String getReceivedText(){
        return receivedText;
    }

    public Secondary(String receivedText) throws HeadlessException{
        this.receivedText=receivedText;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setTitle("Window 2");
        setBounds(100,100,350,200);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        contentPanel.setLayout(new FlowLayout());
        System.out.println(getReceivedText());
        l1 = new JLabel(getReceivedText());
        l1.setBounds(100,38,93,14);
        contentPanel.add(l1);

        JButton btn = new JButton("Return");
        btn.addActionListener(this);
        contentPanel.add(btn);
        setContentPane(contentPanel);

        //clase anterior
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //asi no se cierra la ventana
        //setSize(200,200);
        //JLabel label = new JLabel(receivedText);
        //setLayout(new FlowLayout());
        //getContentPane().add(label);
        //setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Principal.createShowGUI();
        dispose();
    }
}
