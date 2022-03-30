package spirala;

import java.util.HashMap;

public class GoreLijevo {

	public static void GoreLijevo(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.desno(spirala, h);
			Metode.dolje(spirala, h);
			Metode.lijevo(spirala, h);
			Metode.gore(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);

	}

	public static void GoreLijevoSat(int[][] spirala, HashMap<String, Integer> h) {
		while (true) {

			Metode.doljeSat(spirala, h);
			Metode.desnoSat(spirala, h);
			Metode.goreSat(spirala, h);
			Metode.lijevoSat(spirala, h);

			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		Metode.ispis(spirala, h);

	}

}
