/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Main implements ActionListener {


//BUTTONS

    JButton button;
    MyFrame() {


        ImageIcon image = new ImageIcon("thumb.jpg");

        button = new JButton();
        button.setBounds(0, 0, 500, 500);
        button.addActionListener(e -> System.out.println("cool"));
        button.setText("I'm A Button");
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman", Font.BOLD, 30));
        button.setIconTextGap(50);
        button.setBorder(BorderFactory.createEtchedBorder());

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(button);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

//JTextField

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton button;
    JTextField tField;

MyFrame(){

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    button = new JButton("Submit");
    button.addActionListener(this);


    tField = new JTextField();
    tField.setPreferredSize(new Dimension(400,45));
    tField.setFont(new Font("Times New Roman", Font.BOLD,35));
    tField.setForeground(Color.green);
    tField.setBackground(Color.black);
    tField.setText("User ID:");

    this.add(button);
    this.add(tField);
    this.pack();
    this.setVisible(true);




}


    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button){
        System.out.println("Welcome " + tField.getText());
        button.setEnabled(false);
        tField.setEditable(false);
    }

    }
}




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JCHeckBoxes


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox cBox;
    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton();
        button.setText("Click Me");
        button.addActionListener(this);


        cBox = new JCheckBox();

        cBox.setText("I'm Epic");
        cBox.setFocusable(false);
        cBox.setFont(new Font("Times New Roman", Font.ITALIC, 35));


        this.add(button);
        this.add(cBox);
        this.pack();
        this.setVisible(true);


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            System.out.println(cBox.isSelected());
        }

    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//
public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JCheckBox cBox;
    JRadioButton apple;
    JRadioButton grape;
    JRadioButton pear;
    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

         apple = new JRadioButton("apple"); //can select options this way
         grape = new JRadioButton("grape");
         pear = new JRadioButton("pear");

        ButtonGroup group = new ButtonGroup(); //to select only 1 option
        group.add(apple);
        group.add(grape);
        group.add(pear);

        apple.addActionListener(this);
        grape.addActionListener(this);
        pear.addActionListener(this);

        this.add(apple);
        this.add(grape);
        this.add(pear);


        this.pack();
        this.setVisible(true);




            }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==apple){
            System.out.println("You get an apple");
        }
        if(e.getSource()==grape){
            System.out.println("You get an grape");
        }if(e.getSource()==pear){
            System.out.println("You get an pear");
        }


    }
}




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//JComboBox


public class MyFrame extends JFrame implements ActionListener {
    JComboBox cBox;
    MyFrame(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","rat"}; //Use Wrapper class for primitive data types
        cBox = new JComboBox(animals);
        cBox.addActionListener(this);

        //cBox.setEditable(true); //allows you to edit
        //System.out.println(cBox.getItemCount()); //# of items
        //cBox.addItem("apple"); //allows you to add an item
        //cBox.insertItemAt("orange",0); //allows you to add an item at a certain index
        //cBox.setSelectedIndex(0); //allows you to select the starting index
        //cBox.removeItem("dog"); //removes the chosen item
        //cBox.removeItemAt(1); //removes the item at the chosen index
        //cBox.removeAllItems(); //removes all items

        this.add(cBox);
        this.pack();
        this.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cBox){
            //System.out.println(cBox.getSelectedItem());
            System.out.println(cBox.getSelectedIndex());
        }


    }
}

//JSlider

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrame implements ChangeListener{

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    MyFrame(){

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        slider.setPreferredSize(new Dimension(400,200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true); //numbering

        slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("C = "+ slider.getValue());

        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);



    }


    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("C = "+ slider.getValue());

    }
}

//JProgress Bar

import javax.swing.*;
import java.awt.*;

public class MyFrame {
JFrame frame = new JFrame();
JProgressBar bar = new JProgressBar(); //can pass minimum and maximum values within here
    MyFrame(){

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setForeground(Color.red);
        bar.setBackground(Color.BLACK);

        frame.add(bar);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

public void fill(){

        int counter = 0;

        while(counter<=100){

            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter+=10;

        }
        bar.setString("Done!");

    }


}



//Menu Bars

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar bar;
    JMenu fileMenue;
    JMenu helpMenue;
    JMenu editMenue;
    JMenuItem load;
    JMenuItem save;
    JMenuItem exit;

    MyFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(new FlowLayout());

        bar = new JMenuBar();

        fileMenue = new JMenu("File");
        helpMenue = new JMenu("Help");
        editMenue = new JMenu("Edit");

        load = new JMenuItem("Load");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        load.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        load.setMnemonic(KeyEvent.VK_L); //Shortcuts; ALt+letter to reach Shortcut
        save.setMnemonic(KeyEvent.VK_S);
        exit.setMnemonic(KeyEvent.VK_E);
        fileMenue.setMnemonic(KeyEvent.VK_F);
        helpMenue.setMnemonic(KeyEvent.VK_H);
        editMenue.setMnemonic(KeyEvent.VK_D);

        fileMenue.add(load);
        helpMenue.add(save);
        editMenue.add(exit);
        bar.add(fileMenue);
        bar.add(helpMenue);
        bar.add(editMenue);
        this.setJMenuBar(bar);
        this.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == load) {
            System.out.println("Loadng..");
        }

        if (e.getSource() == save) {
            System.out.println("Saving..");
        }
        if (e.getSource() == exit) {
            System.exit(0);

        }
    }
}



//JFileChooser

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton("Select File");
        button.setFocusable(false);
        button.addActionListener(this);




        this.add(button);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));

            //int response = fileChooser.showOpenDialog(null); //select file to open
            int response = fileChooser.showSaveDialog(null); //select file to save


            if(response == JFileChooser.APPROVE_OPTION){

                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());


            }

        }

    }
}


//JFileChooser


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button = new JButton("Pick Color");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("Change My Color");
        label.setForeground(Color.BLACK);
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {

            JColorChooser jColor = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick A Color",Color.BLACK);

                    label.setForeground(color);


            }

        }
    }



//KeyListener


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {


    JLabel label;

    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,40,40);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-5, label.getY());
                break;
            case 's': label.setLocation(label.getX(), label.getY()+5);
                break;
            case 'd': label.setLocation(label.getX()+5, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-5);

        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-5, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-5);
                break;
            case 39: label.setLocation(label.getX()+5, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY()+5);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        //System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());

    }
}

*/



