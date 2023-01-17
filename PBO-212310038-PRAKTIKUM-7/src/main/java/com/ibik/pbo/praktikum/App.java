package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class App extends JFrame implements ActionListener {

	private JButton btn_Lat1;
	private JButton btn_Lat2;
	private JButton btn_Lat3;
	private JButton btn_Lat4;
	
	App() {
		  setTitle("main menu");
	      setVisible(true);
	      pack();
	      setSize(300,150);
	      setLocationRelativeTo(null);
	      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      GenerateUI(this);
	}
    public static void main( String[] args )
    {
      new App();
    }
    
    public void GenerateUI(JFrame frame) {
    	btn_Lat1 = new JButton("latihan 1");
    	btn_Lat1.setLayout(null);
    	btn_Lat1.addActionListener(this);
    	frame.add(btn_Lat1);

    	
    	btn_Lat2 = new JButton("latihan 2");
    	btn_Lat2.setLayout(null);
    	btn_Lat2.addActionListener(this);
    	frame.add(btn_Lat2);

    	
    	btn_Lat3 = new JButton("latihan 3");
    	btn_Lat3.setLayout(null);
    	btn_Lat3.addActionListener(this);
    	frame.add(btn_Lat3);

    	
    	btn_Lat4 = new JButton("latihan 4");
    	btn_Lat4.setLayout(null);
    	btn_Lat4.addActionListener(this);
    	frame.add(btn_Lat4);
    	
    	frame.setLayout(new FlowLayout());
    }
	@Override
	public void actionPerformed(ActionEvent onClick) {
		if(onClick.getSource() == btn_Lat1) {
			Latihan01.main(null);
		}
		else if(onClick.getSource() == btn_Lat2) {
			Latihan02.main(null);
		}
		else if(onClick.getSource() == btn_Lat3) {
			Latihan03.main(null);
		}
		else if(onClick.getSource() == btn_Lat4) {
			Latihan04.main(null);
		}
		else {
			
		}
	}
}