package spirala;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Start {

	private Scanner ulaz;

	public Start() {
		ulaz = new Scanner(System.in);

		HashMap<String, Integer> h = new HashMap<>();

		int stupac;
		int red;
		int max;

		while (true) {
			red = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
			if (red > 0) {
				break;
			} else {
				continue;
			}
		}

		while (true) {
			stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
			if (stupac > 0) {
				break;
			} else {
				continue;
			}
		}

		int spirala[][] = new int[red][stupac];
		// ulaz.close();

		max = red * stupac + 1;
		h.put("k", 1);
		h.put("stupac", stupac);
		h.put("red", red);
		h.put("max", max);
		h.put("redmax", red - 1);
		h.put("redmin", 0);
		h.put("stupacmax", stupac - 1);
		h.put("stupacmin", 0);

		boolean sat = true;
		h.put("sat", 1);
		if (JOptionPane.showConfirmDialog(null, "U smjeru kazalje na satu?") == JOptionPane.YES_OPTION) {
		    sat=false;
		    h.put("sat", 0);
		}
		
		
		Boolean run = true;	
		while(run){
			System.out.println("\n1. Dolje desno");
			System.out.println("2. Dolje lijevo");
			System.out.println("3. Gore lijevo");
			System.out.println("4. Gore desno");
			System.out.println("5. Izlaz");

			switch (Unos.unesiInt(ulaz, "Odaberite akciju")) {
			case 1:
				if(sat) {DoljeDesno.DoljeDesnoSat(spirala, h);}
				else{DoljeDesno.DoljeDesno(spirala, h);}
				break;
			case 2:
				if(sat) {DoljeLijevo.DoljeLijevoSat(spirala, h);}
				else {DoljeLijevo.DoljeLijevo(spirala,h);}
				break;
			case 3:
				if(sat) {GoreLijevo.GoreLijevoSat(spirala, h);}
				else {GoreLijevo.GoreLijevo(spirala,h);}
				break;
			case 4:
				if(sat) {GoreDesno.GoreDesnoSat(spirala, h);}
				else {GoreDesno.GoreDesno(spirala,h);}
				break;
			case 5:
				System.out.println("Hvala doviđenja");
				run = false;
			}
			run=josJednm(run);
		}

	}

	private boolean josJednm(boolean run) {
		if (JOptionPane.showConfirmDialog(null, "Još?") == JOptionPane.YES_OPTION) {
		    new Start();
		} else {
		   System.out.println("Hvala doviđenja");
		   return run=false;
		}
		return false;
		
	}



	

	

	

	public static void main(String[] args) {
		new Start();
	}
}
