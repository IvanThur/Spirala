package spirala;

import java.util.HashMap;

public class Metode {
	
	public static void lijevo(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int j = h.get("stupacmax"); j >= h.get("stupacmin"); j--) {
			spirala[h.get("redmax")][j] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("redmax", (h.get("redmax") - 1));
		h.put("k", k);

	}

	public static void gore(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int i = h.get("redmax"); i >= h.get("redmin"); i--) {
			spirala[i][h.get("stupacmin")] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("stupacmin", (h.get("stupacmin") + 1));
		h.put("k", k);
	}

	public static void desno(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int j = h.get("stupacmin"); j <= h.get("stupacmax"); j++) {
			spirala[h.get("redmin")][j] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("redmin", (h.get("redmin") + 1));
		h.put("k", k);
	}

	public static void dolje(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int i = h.get("redmin"); i <= h.get("redmax"); i++) {
			spirala[i][h.get("stupacmax")] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("stupacmax", (h.get("stupacmax") - 1));
		h.put("k", k);
	}

	public static void ispis(int[][] spirala, HashMap<String, Integer> h) {
		for (int i = 0; i < h.get("red"); i++) {
			for (int j = 0; j < h.get("stupac"); j++) {
				System.out.print("\t" + spirala[i][j]);
			}
			System.out.println();
		}
	}

	public static void goreSat(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int i = h.get("redmax"); i >= h.get("redmin"); i--) {
			spirala[i][h.get("stupacmax")] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("stupacmax", (h.get("stupacmax") - 1));
		h.put("k", k);
		
	}

	public static void desnoSat(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int j = h.get("stupacmin"); j <= h.get("stupacmax"); j++) {
			spirala[h.get("redmax")][j] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("redmax", (h.get("redmax") - 1));
		h.put("k", k);
		
	}

	public static void doljeSat(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int i = h.get("redmin"); i <= h.get("redmax"); i++) {
			spirala[i][h.get("stupacmin")] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("stupacmin", (h.get("stupacmin") + 1));
		h.put("k", k);
		
	}

	public static void lijevoSat(int[][] spirala, HashMap<String, Integer> h) {
		int k;
		k = h.get("k");
		for (int j = h.get("stupacmax"); j >= h.get("stupacmin"); j--) {
			spirala[h.get("redmin")][j] = k++;
			if (h.get("k") >= h.get("max")) {
				break;
			}
		}
		h.put("redmin", (h.get("redmin") + 1));
		h.put("k", k);
		
	}

}
