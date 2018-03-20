package lab4;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ObslugaKolorow extends JPanel{

	JButton kolorLinii, kolorTla;
	
	
	public ObslugaKolorow() {
		kolorLinii = new JButton("Zmieñ kolor linii");
		kolorTla = new JButton("Zmieñ kolor t³a");
		
		ColorChooser kolor = new ColorChooser();
		
		this.add(kolorLinii);
		this.add(kolorTla);
	}

}