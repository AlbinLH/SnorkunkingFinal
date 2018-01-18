import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

public class DrawEnvironnement {

	static double nombreLevels1;
	static double nombreLevels2;
	static double nombreLevels3;
	static double tailleNiv1;
	static double tailleNiv2;
	static double tailleNiv3;
	static boolean once = true;
	static double nbLevelIni1 = 0.0;
	static double nbLevelIni2 = 0.0;
	static double nbLevelIni3 = 0.0;
	static double nbLevels1 = (double) (int) (Math.random() * 3) + 9;
	static double nbLevels2 = (double) (int) (Math.random() * 3) + 6;
	static double nbLevels3 = (double) (int) (Math.random() * 3) + 3;
	static double nbLevelTotal = nbLevels1 + nbLevels2 + nbLevels3;
	static double positionY1ini[] = new double[TableauxTresors.nbCoffres1];
	static double positionY2ini[] = new double[TableauxTresors.nbCoffres2];
	static double positionY3ini[] = new double[TableauxTresors.nbCoffres3];
	static int statusTresor[] = new int[(int)nbLevelTotal];

	

	public static void draw(double nblevelUsed1, double nblevelUsed2, double nblevelUsed3, boolean changePhase) {
		double positionLevel;
		double tailleLevel;
		
		StdDraw.setFont();

		if (changePhase) {
			StdDraw.picture(0, 0,
					"src\\ImageGame\\fond marin jeu java2.jpg", 6.3,
					6.3);
			StdDraw.picture(0, 2.885, "src\\ImageGame\\sable.jpg",
					2 * (2.9 + 0.09f), 2 * 0.185);
			StdDraw.picture(-1, 2.885, "src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.picture(1, 2.885, "src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			CompteurJoueur.coffreHand1 = 0;
			CompteurJoueur.coffreHand2 = 0;
			nbLevels1 = nbLevels1 - nblevelUsed1;
			nbLevels2 = nbLevels2 - nblevelUsed2;
			nbLevels3 = nbLevels3 - nblevelUsed3;
			Oxygene.initOxygene(nbLevelTotal);
			for (int i = 0; i < statusTresor.length; i++) {
				statusTresor[i] = 1;
			}
			StdDraw.show(20);
		}

		nbLevelIni1 = nblevelUsed1;
		nbLevelIni2 = nblevelUsed2;
		nbLevelIni3 = nblevelUsed3;

		nombreLevels1 = nbLevels1;
		nombreLevels2 = nbLevels2;
		nombreLevels3 = nbLevels3;

	
		StdDraw.rectangle(0, 2.885, 2.9 + 0.09f, 0.185);
		StdDraw.picture(0, 2.885, "src\\ImageGame\\sable.jpg",
				2 * (2.9 + 0.09f), 2 * 0.185);
		while (once) {
			StdDraw.picture(-1, 2.885, "src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.picture(1, 2.885, "src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			once = false;
		}

		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.rectangle(0, 1.7, 2.9 + 0.09f, 1); 

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.rectangle(0, -0.3, 2.9 + 0.09f, 1);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.rectangle(0, -2.15, 2.9 + 0.09f, 0.85);

		if (nbLevels1 != 0) {
			
			tailleLevel = 2 / nbLevels1;
			
			positionLevel = 2.7 - tailleLevel / 2;
			for (int i = 1; i <= nbLevels1; i++) {
				StdDraw.setPenColor(StdDraw.GREEN);
				
				StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
				if (changePhase) {
					StdDraw.picture(0, positionLevel,
							"src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);
				
					positionY1ini[i - 1] = positionLevel;
				} else {
					if (Listes.contient(positionY1ini, positionLevel)) {
						StdDraw.picture(0, positionLevel,
								"src\\ImageGame\\coffre pirate2.jpg",
								0.2, tailleLevel - 0.01);

					} else {
						StdDraw.setPenColor(StdDraw.RED);
						StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.text(0, positionLevel, "Empty");
					}

				}
				positionLevel = positionLevel - tailleLevel;
			}
			tailleNiv1 = tailleLevel;

		} else {
			tailleNiv1 = 2;
		}

		
		if (nbLevels2 != 0) {

			tailleLevel = 2 / nbLevels2;
			positionLevel = 0.7 - tailleLevel / 2;
			for (int i = 1; i <= nbLevels2; i++) {
				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
				if (changePhase) {
					StdDraw.picture(0, positionLevel,
							"src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);
					positionY2ini[i - 1] = positionLevel;
				} else {
					if (Listes.contient(positionY2ini, positionLevel)) {
						StdDraw.picture(0, positionLevel,
								"src\\ImageGame\\coffre pirate2.jpg",
								0.2, tailleLevel - 0.01);

					} else {
						StdDraw.setPenColor(StdDraw.RED);
						StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.text(0, positionLevel, "Empty");
					}

				}
				positionLevel = positionLevel - tailleLevel;
			}
			tailleNiv2 = tailleLevel;

		} else {
			tailleNiv2 = 2;
		}

		if (nbLevels3 != 0) {

			tailleLevel = 1.7 / nbLevels3;
			positionLevel = -1.3 - tailleLevel / 2;
			for (int i = 1; i <= nbLevels3; i++) {
				StdDraw.setPenColor(StdDraw.RED);
				StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
				if (changePhase) {
					StdDraw.picture(0, positionLevel,
							"src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);
					positionY3ini[i - 1] = positionLevel;
				} else {
					if (Listes.contient(positionY3ini, positionLevel)) {
						StdDraw.picture(0, positionLevel,
								"src\\ImageGame\\coffre pirate2.jpg",
								0.2, tailleLevel - 0.01);

					} else {
						StdDraw.setPenColor(StdDraw.RED);
						StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
						StdDraw.setPenColor(StdDraw.BLACK);
						StdDraw.text(0, positionLevel, "Empty");
					}

				}
				positionLevel = positionLevel - tailleLevel;
			}
			tailleNiv3 = tailleLevel;

		} else {
			tailleNiv3 = 1.7;
		}

		StdDraw.filledRectangle(-2.8 - 0.09f + (1 - 0.09f) / 2, 0, (1.5 - 0.09f) / 2, 2.99 + 0.09f);
		StdDraw.picture(-2.8 - 0.09f + (1 - 0.09f) / 2, 0,
				"src\\ImageGame\\sable3.jpg", (1.5 - 0.09f),
				2 * (2.99 + 0.09f));
		StdDraw.filledRectangle(2.8 + 0.09f - (1 - 0.09f) / 2, 0, (1.5 - 0.09f) / 2, 2.99 + 0.09f);
		StdDraw.picture(2.8 + 0.09f - (1 - 0.09f) / 2, 0,
				"src\\ImageGame\\sable3.jpg", (1.5 - 0.09f),
				2 * (2.99 + 0.09f));
		CompteurJoueur.Compt(0, 0);
	}

}
