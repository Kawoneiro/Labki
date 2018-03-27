package lab4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ObslugaKolorow extends JPanel{

	JButton kolorLinii, kolorTla;
	GlowneOkno okno;
	
	ActionListener kolor = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			final JColorChooser wybor = new JColorChooser();
			wybor.setColor(Color.white);
			wybor.getSelectionModel().addChangeListener(new ChangeListener() {
	            @Override
	            public void stateChanged(ChangeEvent arg0) {
	                Color color = wybor.getColor();
	                System.out.println(color);
	                okno.getPanel3().setBackground(color);
	            }
	        });
	        JDialog dialog = JColorChooser.createDialog(null, "Color Chooser", true, wybor, null, null);
	        dialog.setVisible(true);
			
		}
	
		
	};
	
	public ObslugaKolorow(GlowneOkno kopia) {
		okno = kopia;
		kolorLinii = new JButton("Zmieñ kolor linii");
		kolorTla = new JButton("Zmieñ kolor t³a");
		
		kolorLinii.addActionListener(kolor);
		kolorTla.addActionListener(kolor);
		
		
		
		this.add(kolorLinii);
		this.add(kolorTla);
	}

}