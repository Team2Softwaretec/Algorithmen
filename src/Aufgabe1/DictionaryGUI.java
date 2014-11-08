package Aufgabe1;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings({"rawtypes"})
public class DictionaryGUI extends JFrame {
	
	private static final long serialVersionUID = 6714431009115370005L;
	public static Dictionary dic;
	
	public DictionaryGUI () {
		
		JPanel mainPanel = new JPanel();
		this.setJMenuBar(new DictionaryMenuBar());
		
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		mainPanel.add(new Einf�genPanel());
		mainPanel.add(new SuchenL�schenPanel());
		mainPanel.add(new PerformancePanel());
		this.setContentPane(mainPanel);
		
		this.setTitle("Dictionary");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(500, 500));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new DictionaryGUI();
	}

}
