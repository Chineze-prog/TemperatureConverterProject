import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Write a description of class TemperatureConverter here.
 *
 * @author Chineze Obi
 * @version v1
 */
public class TemperatureConverter{
    // GUI Elements
    private JFrame frame;
    private JPanel panel;
    private JButton convertCtoFButton;
    private JButton convertFtoCButton;
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JTextField cTextField;
    private JTextField fTextField;
    
    /**
     * Constructor for objects of class TemperatureConverter
     */
    public TemperatureConverter(){
        /*
         * create new frame, create new panel
         * set border, set layout, add panel to frame
         * set default close operation, set title, turn on visibility
         */
        
        /*
         * alternative for frame layout 
         * frame = new JFrame("Temperature Converter by @Chineze-prog");
         * frame.setSize(500, 500);
         * frame.setLayout(new FlowLayout());
         * frame.setVisible(true);
        */
       
        frame = new JFrame();
        panel = new JPanel();

        convertCtoFButton = new JButton("Convert C to F");
        //adding listener
        convertCtoFButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                //convert C to F
            }
        });

        convertFtoCButton = new JButton("Convert F to C");
        convertFtoCButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                //convert F to C
            }
        });

        celsiusLabel = new JLabel("Celsius:");
        celsiusLabel.setBounds(10, 20, 80, 25);
        fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitLabel.setBounds(10, 20, 80, 25);

        cTextField = new JTextField(20);
        cTextField.setBounds(100, 20, 165, 25);
        fTextField = new JTextField(20);
        cTextField.setBounds(100, 20, 165, 25);
        
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        
        panel.add(celsiusLabel);
        panel.add(cTextField);
        panel.add(convertCtoFButton);
        
        panel.add(fahrenheitLabel);
        panel.add(fTextField);
        panel.add(convertFtoCButton);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Temperature Converter by @Chineze-prog");
        frame.pack();

        frame.setVisible(true);
        //done-thank you for using tc by co
        //String name = JOptionPane.showInputDialog("Enter your name: ")
        //JOptionPane.showMessageDialog(null, "Hello " + name)
    }

    public static void main(String[] args){
        new TemperatureConverter();
    }
}