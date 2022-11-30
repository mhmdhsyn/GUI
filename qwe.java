import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class qwe implements ActionListener {

    //Creating the nine buttons used for interaction
    private JButton b1 = new JButton("Now Playing");
    private JButton b2 = new JButton("Media Guide");
    private JButton b3 = new JButton("Library");
    private JButton b4 = new JButton("Help & Info");

    private JButton b5 = new JButton("0");
    private JButton b6 = new JButton("1");
    private JButton b7 = new JButton("2");
    private JButton b8 = new JButton("3");
    private JButton b9 = new JButton("OK");

    //Creating the frame and titling it
    JFrame frame = new JFrame("Movie on Thursday");
    //Creating the three panels
    JPanel panel_right = new JPanel();
    JPanel panel_left = new JPanel();
    JPanel panel_bottom = new JPanel();
    //Creating the text area
    JTextArea textarea = new JTextArea();

    JScrollPane scroll;

    //Constructor
    public qwe (){
        //Giving the OK button a size
        b9.setPreferredSize(new Dimension(124,400));


        //Adding action listener to the buttons which will allow buttons to be responsive
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


        //Creating labes that will be adding to the bottom of the frame
        JLabel label_1 = new JLabel("Movies");
        JLabel label_2 = new JLabel("Music");
        JLabel label_3 = new JLabel("Videos");
        JLabel label_4 = new JLabel("DVD");
        JLabel label_5 = new JLabel("Web Pages");

        //Setting layout as borderlayout for the frame
        frame.setLayout(new BorderLayout());

        //Setting the size of the panel and adding the buttons on the left panel
        panel_left.setPreferredSize(new Dimension(125,450));
        panel_left.add(b1);
        panel_left.add(b2);
        panel_left.add(b3);
        panel_left.add(b4);

        //Setting the size of the panel and adding the buttons on the right panel
        panel_right.setPreferredSize(new Dimension(125,450));
        panel_right.add(b5, BorderLayout.WEST);
        panel_right.add(b6, BorderLayout.EAST);
        panel_right.add(b7,BorderLayout.WEST);
        panel_right.add(b8, BorderLayout.EAST);
        panel_right.add(b9, BorderLayout.CENTER);

        //Setting the size of the text area
        textarea.setPreferredSize(new Dimension(250,450));

        //Setting the size of the panel and adding the buttons on the bottom panel
        panel_bottom.setPreferredSize(new Dimension(500,50));
        panel_bottom.add(label_1);
        panel_bottom.add(label_2);
        panel_bottom.add(label_3);
        panel_bottom.add(label_4);
        panel_bottom.add(label_5);

        //Adding the panels to the frame and sitting their borderlayout
        frame.add(panel_left, BorderLayout.WEST);
        frame.add(panel_right, BorderLayout.EAST);
        frame.add(textarea, BorderLayout.CENTER);
        frame.add(panel_bottom, BorderLayout.SOUTH);


        //Set the functionality of the close button to exit the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Makes sure all components are at their preferred size
        frame.pack();

        //Shows frame object on the screen
        frame.setVisible(true);

        //Centers the gui on the screen
        frame.setLocationRelativeTo(null);


   }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Checking which button the event was invoked by and assigning text of the button on the text area.
        if(e.getSource() ==b1)
        {
            textarea.append(b1.getText() + '\n');
        }

        if(e.getSource() ==b2)
        {
            textarea.append(b2.getText() + '\n');
        }

        if(e.getSource() ==b3)
        {
            textarea.append(b3.getText() + '\n');
        }

        if(e.getSource() ==b4)
        {
            textarea.append(b4.getText() + '\n');
        }

        if(e.getSource() ==b5)
        {
            textarea.append(b5.getText() + '\n');
        }

        if(e.getSource() ==b6)
        {
            textarea.append(b6.getText() + '\n');
        }

        if(e.getSource() ==b7)
        {
            textarea.append(b7.getText() + '\n');
        }

        if(e.getSource() ==b8)
        {
            textarea.append(b8.getText() + '\n');
        }

        if(e.getSource() ==b9)
        {
            textarea.append(b9.getText() + '\n');
        }
    }

    public static void main(String[] main)
    {
        //Initialization of the GuiProgram
        qwe gui = new qwe();
    }

}

