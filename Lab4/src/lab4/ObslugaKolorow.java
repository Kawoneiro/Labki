package lab4;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ObslugaKolorow extends JPanel{

	JButton kolorLinii, kolorTla;
	
	
	public ObslugaKolorow() {
		kolorLinii = new JButton("Zmie� kolor linii");
		kolorTla = new JButton("Zmie� kolor t�a");
		
		ColorChooser kolor = new ColorChooser();
		
		this.add(kolorLinii);
		this.add(kolorTla);
	}

}