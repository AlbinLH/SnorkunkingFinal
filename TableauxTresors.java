import java.util.ArrayList;
public class TableauxTresors {
	static int nbCoffres1 = (int) DrawEnvironnement.nbLevels1;
	static int nbCoffres2 = (int) DrawEnvironnement.nbLevels2;
	static int nbCoffres3 = (int) DrawEnvironnement.nbLevels3;
	static int tresorsCave1ini [] = new int [nbCoffres1];
	static int tresorsCave2ini [] = new int [nbCoffres2];
	static int tresorsCave3ini [] = new int [nbCoffres3];
	
	
	
	
	public static void IniContenuCoffres() {
		for (int i = 0; i < nbCoffres1 ; i++) {
			
			tresorsCave1ini[i] = (int)(Math.random()*3) + 1;
			
		}
		for (int j = 0; j < nbCoffres2; j++) {
			
			tresorsCave2ini[j] = (int)(Math.random()*4) + 5;
		}
		for (int k = 0; k < nbCoffres3; k++) {
			
			tresorsCave3ini[k] = (int)(Math.random()*3) + 10;
		}
	}


}
