package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class MainFrame
{
	private JFrame f;
	private Border border;

    public MainFrame()
    {
    	this.f = new JFrame("스레드를 가진 겜블링");
		
        this.f.setLayout(new GridLayout(1, 3));
        this.f.setSize(600, 300);
        this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.border = BorderFactory.createLineBorder(Color.BLACK);
        
        JLabel[] labels = {new JLabel("first"), new JLabel("second"), new JLabel("third")};
        for(JLabel label: labels) {
            label.setBorder(this.border);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            this.f.add(label);
        }

        this.f.setVisible(true);
    }

}