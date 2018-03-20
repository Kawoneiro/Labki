package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
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
		
		Border pierwsze, linia, gora, dol;
		TitledBorder tytul1, tytul2;
		linia = BorderFactory.createLineBorder(Color.black);
		gora = BorderFactory.createRaisedBevelBorder();
		dol = BorderFactory.createLoweredBevelBorder();
		pierwsze = BorderFactory.createCompoundBorder(gora, dol);
		tytul1 = BorderFactory.createTitledBorder(linia,"Wielokat"); 
		tytul2 = BorderFactory.createTitledBorder(linia,"Gruboœæ Linii");
		
		//panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.pink);
		panel3.setBackground(Color.white);
		panel4.setBackground(Color.pink);
		panel5.setBackground(Color.pink);
		
		panel1.setLayout(new FlowLayout());
		panel2.setLayout(new GridLayout(1,1));
		panel4.setLayout(new GridLayout(1,1));
		panel5.setLayout(new FlowLayout());
		
		ObslugaWielokatow guziki = new ObslugaWielokatow();
		panel2.add(guziki);
		
		ObsulgaLinii linie = new ObsulgaLinii();
		panel4.add(linie);
		
		ObslugaKolorow kolory = new ObslugaKolorow();
		panel5.add(kolory);
		
		panel1.setPreferredSize(new Dimension(50, 50));
		panel2.setPreferredSize(new Dimension(125, 125));
		panel4.setPreferredSize(new Dimension(125, 125));
		panel5.setPreferredSize(new Dimension(50,50));
		
		panel2.setBorder(tytul1);
		panel3.setBorder(pierwsze);
		panel4.setBorder(tytul2);
		panel5.setBorder(pierwsze);
		
		this.setLayout(new BorderLayout());
		//this.add(BorderLayout.PAGE_START,panel1);
		this.add(BorderLayout.LINE_START,panel2);
		this.add(BorderLayout.CENTER,panel3);
		this.add(BorderLayout.LINE_END,panel4);
		this.add(BorderLayout.PAGE_END, panel5);
		
		
		
	}

	public static void main(String[] args) {
		GlowneOkno Okno = new GlowneOkno();
		Okno.setTitle("Laboratorium 4 - Rysowanie wielok¹tów");
		Okno.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Okno.setSize(600,400);
		Okno.setVisible(true);
	}

}
