import java.awt.*;
import javax.swing.*;

public class Tematy extends JList{

	public ListModel data = new DefaultListModel();

	Tematy(){
		JPanel panel2 = new JPanel(Przedmiot());
		JLabel label2 = new JLabel(liczbaGodzin());
		panel2.add(label2);
	}


}