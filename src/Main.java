import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //---------------------------------------------------------------------------------------------------------------

        //JFRAME

        /*JFrame frame = new JFrame(); //creates frame


        frame.setTitle("JAVA GUI"); //title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //allows one to exit
        frame.setSize(1920,1080); //sets res
        //frame.setResizable(false); //can't change res
        frame.setVisible(true); //makes seen
        frame.getContentPane().setBackground(new Color(59, 114, 232));

       frame.setLayout(null);




       ImageIcon image = new ImageIcon("kool.jpg");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);

        //---------------------------------------------------------------------------------------------------------------

        //JLABEL

        JLabel label = new JLabel();
        label.setText("Why am I so Cool?"); //set text of label
        frame.add(label); // add label onto frame
        label.setIcon(image); //add image

        label.setHorizontalTextPosition(JLabel.CENTER); //alignment of text
        label.setVerticalTextPosition(JLabel.TOP);


        label.setForeground(new Color(227, 44, 44)); //color of text
        label.setFont(new Font("Times New Roman",Font.BOLD,30)); //font
        label.setIconTextGap(10); //gap from image

        label.setBackground(Color.BLACK); //set backgroud color
        label.setOpaque(true);

        label.setBorder(border); //set border
        label.setVerticalAlignment(JLabel.TOP); //alignment of img and text
        label.setHorizontalAlignment(JLabel.CENTER);

       label.setBounds(100,100,800,800); //set x and y as well as dimensions

        //frame.pack(); //add all the components, then pack. Fills entire thing


        //---------------------------------------------------------------------------------------------------------------

        //JPANEL

        JPanel rPanel = new JPanel();
        rPanel.setBackground(Color.red);
        rPanel.setBounds(0,0,250,250);
        //rPanel.setLayout(new BorderLayout()); //this allows you to move around the label
        rPanel.setLayout(null);


        JPanel bPanel = new JPanel();
        bPanel.setBackground(Color.blue);
        bPanel.setBounds(250,0,250,250);

        JPanel gPanel = new JPanel();
        gPanel.setBackground(Color.green);
        gPanel.setBounds(0,250,500,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        JLabel label = new JLabel();
        label.setText("HELLO!");
        label.setForeground(Color.BLACK);
        //label.setHorizontalAlignment(JLabel.CENTER);
        //label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(0,0,75,75);

        rPanel.add(label);

        frame.add(rPanel);
        frame.add(bPanel);
        frame.add(gPanel);

        //NOTE: When .setLayout is made null, you need to use .setBounds


        //---------------------------------------------------------------------------------------------------------------

        //BUTTONS

        new MyFrame();



        //---------------------------------------------------------------------------------------------------------------

        //Border Layout

        JFrame frame = new JFrame();

        frame.setTitle("JAVA GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10)); //horizontal and vertical gap
        frame.setVisible(true); //makes seen

        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();

        Panel1.setBackground(Color.red);
        Panel2.setBackground(Color.green);
        Panel3.setBackground(Color.blue);
        Panel4.setBackground(Color.yellow);
        Panel5.setBackground(Color.orange);

        Panel1.setPreferredSize(new Dimension(100,100));
        Panel2.setPreferredSize(new Dimension(100,100));
        Panel3.setPreferredSize(new Dimension(100,100));
        Panel4.setPreferredSize(new Dimension(100,100));
        Panel5.setPreferredSize(new Dimension(100,100));

        frame.add(Panel1, BorderLayout.NORTH);
        frame.add(Panel2, BorderLayout.EAST);
        frame.add(Panel3, BorderLayout.WEST);
        frame.add(Panel4, BorderLayout.SOUTH);
        frame.add(Panel5, BorderLayout.CENTER);



       // you can add panels upon panels; the panel acts like the frame
       // ex: Panel5.setLayout(new BorderLayout());
       // Panel5.add(Panel6, BorderLayout.NORTH);



        //---------------------------------------------------------------------------------------------------------------

        //FlowLayout

        JFrame frame = new JFrame();

        frame.setTitle("JAVA GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));

        frame.setVisible(true);

        //---------------------------------------------------------------------------------------------------------------

        //GridLayout

        JFrame frame = new JFrame();

        frame.setTitle("JAVA GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));


        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));


        frame.setVisible(true);


        //---------------------------------------------------------------------------------------------------------------

        //JLayeredPane

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBounds(50,50,200,200);
        label1.setBackground(Color.black);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBounds(100,100,200,200);
        label2.setBackground(Color.green);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBounds(150,150,200,200);
        label3.setBackground(Color.red);



        JLayeredPane lPane = new JLayeredPane();
        lPane.setBounds(0,0,500,500);

        lPane.add(label1, Integer.valueOf(0)); //allows you to choose the layer of the label
        lPane.add(label2, Integer.valueOf(2));
        lPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame();

        frame.add(lPane); //add the layered pane to the frame

        frame.setTitle("JAVA GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        frame.setVisible(true);


        //---------------------------------------------------------------------------------------------------------------

        //Open New Window

        LaunchPage launchPage = new LaunchPage();


        //---------------------------------------------------------------------------------------------------------------

        //JOptionPane

        //JOptionPane.showMessageDialog(null, "Your Computer Has a Virus! 😭 You Done Messed Up lil bro", "ERROR", JOptionPane.PLAIN_MESSAGE);

        //JOptionPane.showMessageDialog(null, "Your Computer Has a Virus! 😭 You Done Messed Up lil bro", "ERROR", JOptionPane.INFORMATION_MESSAGE);

        //JOptionPane.showMessageDialog(null, "Your Computer Has a Virus! 😭 You Done Messed Up lil bro", "ERROR", JOptionPane.QUESTION_MESSAGE);

        //JOptionPane.showMessageDialog(null, "Your Computer Has a Virus! 😭 You Done Messed Up lil bro", "ERROR", JOptionPane.WARNING_MESSAGE);

        //JOptionPane.showMessageDialog(null, "Your Computer Has a Virus! 😭 You Done Messed Up lil bro", "ERROR", JOptionPane.ERROR_MESSAGE);

        //JOptionPane.showConfirmDialog(null,"Want 1000 Vbucks?","Free Vbucks",JOptionPane.YES_NO_CANCEL_OPTION);
        //String x = JOptionPane.showInputDialog("How many Vbucks Do you want?");
        //System.out.println("Take your mom's credit card info and buy " + x + " Vbucks!!!");

        //String[] arr = {"apple", "banana", "orange"}; //This allows for you to use your array as options for buttons
        //JOptionPane.showOptionDialog(null,"What fruit is your favorite","Fruity",
        // JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,arr,0); //you can also add images




        //---------------------------------------------------------------------------------------------------------------

        //JTextField

        MyFrameTwo frame= new MyFrameTwo();

*/

        //---------------------------------------------------------------------------------------------------------------


    }
    }
