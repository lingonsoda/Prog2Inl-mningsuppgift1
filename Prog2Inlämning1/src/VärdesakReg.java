import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class VärdesakReg extends JFrame {
	
	private ArrayList<Värdesak> värdesaker = new ArrayList<>();
	private String[] sakStrings = {"Smycken", "Aktier", "Apparater"};
	
	public VärdesakReg() {
		super("Sakregister");
		
		JPanel höger = new JPanel();
		höger.setLayout(new BoxLayout(höger, BoxLayout.Y_AXIS));
		add(höger, BorderLayout.EAST);
		höger.add(new JLabel("Sortering"));
		JRadioButton namnButton = new JRadioButton("Namn");
		höger.add(namnButton);
		JRadioButton värdeButton = new JRadioButton("Värde");
		höger.add(värdeButton);
		
		JPanel nedre = new JPanel();
		add(nedre, BorderLayout.SOUTH);
		JComboBox sakCombo = new JComboBox(sakStrings);
		nedre.add(sakCombo);
		JButton visaButton = new JButton("Visa");
		nedre.add(visaButton);
		JButton kraschButton = new JButton("Börskrasch");
		nedre.add(kraschButton);
		
		JTextArea display = new JTextArea();
		add(display, BorderLayout.CENTER);
		
		JPanel övre = new JPanel();
		add(övre, BorderLayout.NORTH);
		övre.add(new JLabel("Värdesaker"));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new VärdesakReg();
	}

}
