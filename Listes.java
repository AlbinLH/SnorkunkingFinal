public class Listes {
	public static boolean contient(double[] liste, double a) {
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] == a) {
				return true;
			}
		}
		return false;
	}

	public static int max(int[] liste) {
		int max = 0;
		for (int i=0; i<liste.length;i++) {
			if (max <= liste[i]) {
				max = liste[i];
			}
		}
		return max;
	}
	
	public static boolean contientdouble(double[] liste, double a) {
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] - a < 0.000001) {
				return true;
			}
		}
		return false;
	}
	
}
