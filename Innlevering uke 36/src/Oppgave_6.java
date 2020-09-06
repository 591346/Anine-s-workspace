import static javax.swing.JOptionPane.*;
public class Oppgave_6 {
	public static void main(String[] args) {
		int n = Integer.parseInt(showInputDialog("Input"));
		int p = 1;

		
		
	while (n>0) {
		p *= n;
		n--;
		
	}
	showMessageDialog(null, p);


	}
	
 

	
}
