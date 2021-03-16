import java.awt.*;
import javax.swing.*;

public class Harmonogram{

	JFrame fra = newJFrame();
	JPanel aaa = new JPanel(new BorderList);
	JPanel bbb = new JPanel(new BorderList);

	Harmonogram(){
		fra.setTitle("Harmonogram zajęć");
		fra.setLayout(new BorderLayout());
		JLabel label0, label1, label2;
		label0 = new JLabel("Liczba godzin: " liczbaGodzin());
		label0 = new JLabel("Przedmiot: " Przedmiot());
		label0 = new JLabel("Pozostało godzin: " liczbaPozostalo());
		aaa.add(label0);
		label1 = new JLabel("Liczba Godzin: " liczbaPozostalo());
		label1 = new JLabel("Temat: " Zajecia());
		bbb.add(label1);
		fra.add(aaa, BorderLayout.PAGE_START);
		fra.add(bbb);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.setSize(640.480);
		fra.setVisible(true);
	}



	public static void main(String[] args){
		new Harmonogram();
	}
}
//Jakub Nicpoń 2pt4