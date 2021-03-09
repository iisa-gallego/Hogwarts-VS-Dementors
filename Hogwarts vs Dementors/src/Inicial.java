import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PFont;

public class Inicial extends PApplet {

	public static void main(String[] args) {
		PApplet.main("Inicial");

	}

	public void settings() {
		size(1200, 700);
	}

	PFont letter;
	PFont letterBold;
	int Screen;
	Screen screens;

	public void setup() {
		letter = createFont("ShipporiMinchoB1-Regular.ttf", 18);
		letterBold = createFont("ShipporiMinchoB1-SemiBold.ttf", 18);
		screens = new Screen (0,0,this);
	}

	public void draw() {
		switch (Screen) {
		case 0:
		screens.DrawStart(this);

			break;
		case 1:
			screens.DrawInstructions(this);

				break;

		default:
			
			break;
		}
	}

	// }
	public void keyPressed() {

	}

	public void mousePressed() {
	}
}