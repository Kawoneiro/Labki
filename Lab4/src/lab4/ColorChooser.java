package lab4;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser {
	
	public static void main(String[] args) {
		final JColorChooser wybor = new JColorChooser();
		wybor.setColor(Color.BLUE);
		wybor.getSelectionModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent arg0) {
                Color color = wybor.getColor();
                System.out.println(color);
            }
        });
        JDialog dialog = JColorChooser.createDialog(null, "Color Chooser", true, wybor, null, null);
        dialog.setVisible(true);
        System.exit(0);

	}

}
