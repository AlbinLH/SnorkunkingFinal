import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;

public class MenuJeu {
	
	static boolean boolIA = false;

	public static void main(String [] args) {
		MainMenu();
	}
	
	public static void MainMenu() {
		
		double X = 0;
		double Y = 0;
		int a = 1;
		int style = Font.BOLD | Font.ITALIC;
		Font police = new Font ("Serif", style, 40);
		
		StdDraw.setCanvasSize(680, 700);
		StdDraw.setXscale(-3 - InterfaceGraphique.WIDTH, InterfaceGraphique.X_MAX + InterfaceGraphique.WIDTH);
		StdDraw.setYscale(-3 - InterfaceGraphique.WIDTH, InterfaceGraphique.X_MAX + InterfaceGraphique.WIDTH);
		StdDraw.picture(0, 0, "P5210976.jpg", 6.3, 6.3);
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.filledRectangle(0.1, 0.35, 2 * (1 + 0.05f), 2 * 0.185);
		StdDraw.filledRectangle(0.1, -1.10, 2 * (1 + 0.05f), 2 * 0.185);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setFont(police);
		StdDraw.text(0.1, 0.35, "2 joueurs");
		StdDraw.text(0.1, -1.10, "1 joueur");
		StdDraw.show();
		while (a == 1) {
			if (StdDraw.isMousePressed()) {
				X = StdDraw.mouseX();
				Y = StdDraw.mouseY();
				if (Y >= -0.05297142710004543 & Y <= 0.6621428387505666 & X >= -1.9448822989183314 & X <= 2.2538822903352624) {
					InterfaceGraphique.main();
					a = 0;
				}
				else if (Y >= -1.4478856740679058 & Y <= -0.7415999794006347 & X >= -2.0084999442100524 & X <= 2.181176410001867) {
					boolIA = true;
					InterfaceGraphique.main();
					a = 0;
				}
				
			}
			
		}
		
	}
}
