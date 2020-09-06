import static javax.swing.JOptionPane.*;
public class Oppgave_4 {
public static void main(String[] args) {
		
		int brutto = Integer.parseInt(showInputDialog("Hva er brutto "));
		double prosent1 = 0.91/100;
		double prosent2 = 0.42/100;
		double prosent3 = 0.132/100;
		double prosent4 = 0.162/100;
		
		double trinn1 = 180800; 
		double trinn2 = 254500;
		double trinn3 = 639759; 
		double trinn4 = 999550;
		
		double diff; 
		double rest;
	
		double trinn_12 = (trinn2-trinn1)*prosent1;
		double trinn_23 = (trinn3-trinn2)*prosent2;
		double trinn_34 = (trinn4 -trinn3)*prosent3;
		double skatt;
		
		if (brutto<=trinn1) {
			showMessageDialog(null, "0 i skatt");
		} else if (brutto <=trinn2) {
			diff = brutto - trinn1; 
			rest = diff*prosent1;
			showMessageDialog(null, "Du skal betale" + rest +"kr i skatt");
		} else if (brutto <= trinn3) {
			diff = brutto - trinn2;
			rest = diff*prosent2;
			skatt = rest +trinn_12;
			showMessageDialog(null, "Du skal betale" + skatt +"kr i skatt");
			
		}else if (brutto <= trinn4) {
			diff = brutto - trinn3;
			rest = diff*prosent3;
			skatt= rest + trinn_12+trinn_23;
			showMessageDialog(null, "Du skal betale" + skatt +"kr i skatt");
		}else {
			diff= brutto -trinn4;
			rest = diff*prosent4;
			skatt=rest + trinn_12+trinn_23+trinn_34;
			showMessageDialog(null, "Du skal betale" + skatt +"kr i skatt");
		}
	
}
}
