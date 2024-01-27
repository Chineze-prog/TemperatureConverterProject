//import java.awt.event.*;
import java.awt.*;
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
        convertFtoCButton = new JButton("Convert F to C");

        celsiusLabel = new JLabel("Celsius:");
        fahrenheitLabel = new JLabel("Fahrenheit:");

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0, 1));
        
        panel.add(convertCtoFButton);
        panel.add(convertFtoCButton);
        panel.add(celsiusLabel);
        panel.add(fahrenheitLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Temperature Converter by @Chineze-prog");
        frame.pack();

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new TemperatureConverter();
    }
}