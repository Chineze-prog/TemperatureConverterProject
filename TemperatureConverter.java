import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class TemperatureConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TemperatureConverter{
    // GUI Elements
    private JFrame frame;
    private JPanel panel;
    private JButton celsiusButton;
    private JButton fahrenheitButton;
    
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
        JButton celsiusButton = new JButton("Celsius");
        JButton fahrenheitButton = new JButton("fahrenheit");
        
        panel.setBorder(BorderFactory.createEmptyBorder(200, 200, 200, 200));
        panel.setLayout(new GridLayout(0, 1));
        
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