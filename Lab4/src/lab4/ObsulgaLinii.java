package lab4;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ObsulgaLinii extends JPanel{
	
	JSlider gruboscZmiana;
	JTextField gruboscPiskele;
	
	public ObsulgaLinii() {
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		//this.setPreferredSize(new Dimension(100,300));
		gruboscZmiana = new JSlider(JSlider.VERTICAL,10,50,10);
		gruboscZmiana.setMajorTickSpacing(1);
		gruboscZmiana.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				
				gruboscPiskele.setText(gruboscZmiana.getValue()+" pikseli");
			}
			
		});
		
		gruboscZmiana.setMinorTickSpacing(2);
		gruboscZmiana.setPaintTicks(true);
		gruboscPiskele = new JTextField("10 pikseli");
		gruboscPiskele.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				int wartosc=0;
				String pole;
				pole = gruboscPiskele.getText();
				if(pole.isEmpty())	
				wartosc=Integer.parseInt(pole.replaceAll("[\\D]", ""));
				gruboscZmiana.setValue(wartosc);
				
			}
			
		});
		gruboscPiskele.setMaximumSize(new Dimension(100,25));
		this.add(gruboscZmiana);
		this.add(gruboscPiskele);
	}
		
}
