//importing libraries
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Gui Program class
public class GuiProgram implements ActionListener {
    //Constant for number of number buttons
    static final int NUMBER_OF_BUTTONS = 4;
    //Declaring all J object
    JFrame applicationWindow;
    JButton[] boardButtons = new JButton[NUMBER_OF_BUTTONS];
    JButton nowPlaying;
    JButton mediaGuide;
    JButton library;
    JButton helpAndInfo;
    JButton okButton;

    JLabel infoLabel;

    JTextArea textSection;

    /**
     * Instantiates a new Gui program.
     * @param title the title of the frame
     */
    public GuiProgram(String title)
    {
        applicationWindow = new JFrame(title); // creating a JFrame window with the title
        //naming and assigning action listener to buttons on the left side
        nowPlaying = new JButton("Now Playing");
        nowPlaying.addActionListener(this);

        mediaGuide = new JButton("Media Guide");
        mediaGuide.addActionListener(this);

        library = new JButton("Library");
        library.addActionListener(this);

        helpAndInfo = new JButton("Help & Info");
        helpAndInfo.addActionListener(this);
        //Adding buttons to left side panel
        JPanel leftButtonPanel = new JPanel();
        leftButtonPanel.setLayout(new GridLayout(4, 1));
        leftButtonPanel.setPreferredSize(new Dimension(150,50));
        leftButtonPanel.add(nowPlaying, BorderLayout.NORTH);
        leftButtonPanel.add(mediaGuide, BorderLayout.CENTER);
        leftButtonPanel.add(library, BorderLayout.CENTER);
        leftButtonPanel.add(helpAndInfo, BorderLayout.SOUTH);

        // Text Panel
        textSection = new JTextArea(35, 30);
        JPanel centerPanel = new JPanel();
        centerPanel.setPreferredSize(new Dimension(280,450));
        centerPanel.setLayout(new FlowLayout());
        centerPanel.add(textSection, BorderLayout.CENTER);

        // Number buttons
        JPanel NumberButtonPanel = new JPanel();
        NumberButtonPanel.setLayout(new GridLayout(2, 2));
        for (int index = 0; index < NUMBER_OF_BUTTONS; index++)
        {
            boardButtons[index] = new JButton();
            boardButtons[index].setText(Integer.toString(index));
            boardButtons[index].addActionListener(this);
            NumberButtonPanel.add(boardButtons[index], BorderLayout.EAST); // adding the button to the Panel
        }

        // OK Button
        JPanel OKButtonPanel = new JPanel();
        OKButtonPanel.setLayout(new FlowLayout());
        okButton = new JButton("OK");
        okButton.setPreferredSize(new Dimension(150, 300));
        okButton.addActionListener(this);
        OKButtonPanel.add(okButton, BorderLayout.SOUTH);

        // Button on the right side
        JPanel rightButtonPanel = new JPanel();
        rightButtonPanel.setLayout(new GridLayout(2,1));
        rightButtonPanel.setPreferredSize(new Dimension(150,400));
        rightButtonPanel.add(NumberButtonPanel,BorderLayout.NORTH);
        rightButtonPanel.add(OKButtonPanel, BorderLayout.SOUTH);


        // Text information panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new GridLayout(2, 8));
        infoLabel = new JLabel("                                       Movies   Music   Videos   DVD   Web Pages");
        infoLabel.setPreferredSize(new Dimension(100, 40));
        infoPanel.add(infoLabel, BorderLayout.CENTER);


        // adding all the panels to the main window
        applicationWindow.setLayout(new BorderLayout());
        applicationWindow.add(leftButtonPanel, BorderLayout.WEST);
        applicationWindow.add(centerPanel, BorderLayout.CENTER);
        applicationWindow.add(rightButtonPanel, BorderLayout.EAST);
        applicationWindow.add(infoPanel, BorderLayout.SOUTH);
        //Adjusting the main window
        applicationWindow.setSize(650, 600);
        applicationWindow.pack();
        applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        applicationWindow.setVisible(true);

    }

    /**
     * The main function of application.
     * @param args the input arguments
     */
    public static void main (String[] args)
    {
        GuiProgram window = new GuiProgram("Movie on Thursday");
    }

    // implementing actions performed
    public void actionPerformed (ActionEvent event)
    {
        if(event.getSource().equals(nowPlaying))
        {
            this.textSection.append("Now Playing \n");
        }
        else if (event.getSource().equals(library))
        {
            this.textSection.append("Library \n");
        }
        else if (event.getSource().equals(mediaGuide))
        {
            this.textSection.append("Media Guide \n");
        }
        else if (event.getSource().equals(helpAndInfo))
        {
            this.textSection.append("Help & Info \n");
        }
        else if (event.getSource().equals(boardButtons[0]))
        {
            this.textSection.append("0 \n");
        }
        else if (event.getSource().equals(boardButtons[1]))
        {
            this.textSection.append("1 \n");
        }
        else if (event.getSource().equals(boardButtons[2]))
        {
            this.textSection.append("2 \n");
        }
        else if (event.getSource().equals(boardButtons[3]))
        {
            this.textSection.append("3 \n");
        }
        else
        {
            this.textSection.append("OK \n");
        }
    }
}