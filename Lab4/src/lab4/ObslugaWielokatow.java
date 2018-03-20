package lab4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ObslugaWielokatow extends JPanel {

	JRadioButton wielokatreg, wielokatlos;
	JPanel katySekcja;
	JLabel katyOpis;
	JSlider katyWybor;
	JTextField katyPole;
	
	ActionListener wielokatyListener = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
		}
		
	};
	
	
	
	public ObslugaWielokatow() {
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		//this.setPreferredSize(new Dimension(100,300));
		this.wielokatreg = new JRadioButton("Regularny");
		
		wielokatreg.setActionCommand("0");
		wielokatreg.addActionListener(wielokatyListener);
		
		this.wielokatlos = new JRadioButton("Dowolny");
		wielokatlos.setActionCommand("1");
		wielokatlos.addActionListener(wielokatyListener);
			
		this.add(wielokatreg);
		this.add(wielokatlos);
		
		
		katySekcja = new JPanel();
		katySekcja.setLayout(new BoxLayout(katySekcja, BoxLayout.Y_AXIS));
		katyOpis = new JLabel("Iloœæ k¹tów:");
		katySekcja.add(katyOpis);
		katyWybor = new JSlider(JSlider.VERTICAL,3,25,3);
		katyWybor.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent arg0) {
				
				katyPole.setText( String.valueOf(katyWybor.getValue()));
			}
			
		});
		katySekcja.add(katyWybor);
		katyPole = new JTextField("3");
		katyPole.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int value=0;
				String pole;
				pole = katyPole.getText();
				if(pole.isEmpty())
					pole="3";
				value=Integer.parseInt(pole.replaceAll("[\\D]", ""));
				katyWybor.setValue(value);
				
			}
			
		});
		katyPole.setMaximumSize(new Dimension(125,25));
		katySekcja.add(katyPole);
		
		
		this.add(katySekcja);
		
		
		ButtonGroup guziki = new ButtonGroup();
		guziki.add(wielokatreg);
		guziki.add(wielokatlos);
		
	}
	
	
	
	
}
