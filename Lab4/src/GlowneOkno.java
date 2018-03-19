import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GlowneOkno extends JFrame{

	JPanel panel1,panel2,panel3,panel4,panel5;
	
	public GlowneOkno() {
		JFrame Okno  = new JFrame();
		this.panel1 = new JPanel();
		this.panel2 = new JPanel();
		this.panel3 = new JPanel();
		this.panel4 = new JPanel();
		this.panel5 = new JPanel();
		
		Border pierwsze, linia, gora, dol, gora2, dol2;
		TitledBorder tytul;
		linia = BorderFactory.createLineBorder(Color.black);
		gora = BorderFactory.createRaisedBevelBorder();
		dol = BorderFactory.createLoweredBevelBorder();
		//gora2 = BorderFactory.createBevelBorder(Color.black, Color.white);
		//dol2 = BorderFactory.createLoweredBevelBorder(Color.black);
		pierwsze = BorderFactory.createCompoundBorder(gora, dol);
		tytul = BorderFactory.createTitledBorder(linia,"Wielokat"); 
		
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.LIGHT_GRAY);
		panel5.setBackground(Color.gray);
		
		panel1.setPreferredSize(new Dimension(50, 50));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(25,25));
		
		panel2.setBorder(tytul);
		panel3.setBorder(pierwsze);
		
		
		this.setLayout(new BorderLayout());
		this.add(BorderLayout.PAGE_START,panel1);
		this.add(BorderLayout.LINE_START,panel2);
		this.add(BorderLayout.CENTER,panel3);
		this.add(BorderLayout.LINE_END,panel4);
		this.add(BorderLayout.PAGE_END, panel5);
		
	}

	public static void main(String[] args) {
		GlowneOkno Okno = new GlowneOkno();
		Okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Okno.setSize(600,400);
		Okno.setVisible(true);
	}

}
