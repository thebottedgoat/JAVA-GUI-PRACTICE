/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameTwo extends JFrame implements ActionListener {


    JButton button;
    JTextField tField;
MyFrameTwo(){

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

 */
