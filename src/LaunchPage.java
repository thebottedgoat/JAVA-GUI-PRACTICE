/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("CLICK ME");
    LaunchPage(){

        button.setBounds(100,100,250,250);
        button.setFocusable(false);
        button.addActionListener(this);
        button.setFont(new Font(null,Font.BOLD,20));


        frame.add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){
            frame.dispose();
            NewWindow myWindow = new NewWindow();

        }

    }
}

 */
